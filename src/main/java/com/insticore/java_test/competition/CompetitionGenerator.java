package com.insticore.java_test.competition;

import org.paukov.combinatorics3.Generator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CompetitionGenerator {
    public Competition generateCompetition(List<Team> teams, String competitionName) {
        Competition competition = new Competition(competitionName);
        List<Match> matches = new ArrayList<>();
        generateMatches(teams, matches);
        int n = teams.size();
        int roundsCount = isEven(n) ? n - 1 : n;
        int matchesPerRound = matches.size() / roundsCount;
        int matchesIndex = 0;
        for (int roundNumber = 0; roundNumber < roundsCount; roundNumber++) {
            Round round = new Round();
            for (int roundMatchesNumber = 0; roundMatchesNumber < matchesPerRound; roundMatchesNumber++) {
                round.getMatches().add(matches.get(matchesIndex++));
            }
            competition.getRounds().add(round);
        }
        return competition;
    }

    private void generateMatches(List<Team> originalList, List<Match> matches) {
        int size = originalList.size();
        if (size < 2) {
            return;
        } else if (originalList.size() == 2) {
            matches.add(new Match(originalList.get(0), originalList.get(1)));
        } else {
            int k = originalList.size() / 2;
            List<Team> firstPart = originalList.subList(0, k);
            List<Team> secondPart = originalList.subList(k, size);
            List<Team> workingSecondPart = new ArrayList<>(secondPart);
            Collections.reverse(workingSecondPart);


            for (int rotateCount = 0; rotateCount < workingSecondPart.size(); rotateCount++) {
                if (isEven(rotateCount)) {
                    for (int i = 0; i < k; i++) {
                        matches.add(new Match(firstPart.get(i), workingSecondPart.get(i)));
                    }

                } else {
                    for (int i = 0; i < k; i++) {
                        matches.add(new Match(workingSecondPart.get(i), firstPart.get(i)));
                    }
                }
                Collections.rotate(workingSecondPart, -1);
            }
            generateMatches(firstPart, matches);
            generateMatches(secondPart, matches);
        }
    }

    private boolean isEven (int number) {
        return (number & 1) == 0;
    }

}
