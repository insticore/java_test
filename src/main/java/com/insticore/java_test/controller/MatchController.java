package com.insticore.java_test.controller;

import com.insticore.java_test.competition.*;
import org.paukov.combinatorics3.CombinationGenerator;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/competitions")
public class MatchController {

    @RequestMapping(method= RequestMethod.GET)
    public List<Competition> getCompetitions() {
        List<Competition> competitions = new ArrayList<>();
        Team team1 = new Team("Team1");
        Team team2 = new Team("Team2");
        Team team3 = new Team("Team3");
        Team team4 = new Team("Team4");
//        Match match1 = new Match(team1, team2);
//        match1.setMatchStatus(Match.MatchStatus.HOME_VICTORY);
//        Round round = new Round();
//        round.getMatches().add(match1);
//        Competition competition = new Competition("Competition1");
//        competition.getRounds().add(round);
//        competitions.add(competition);

        Team[] originalArray = new Team[] {team1, team2, team3, team4};
        List<Team> originalList = Arrays.asList(originalArray);
        CompetitionGenerator competitionGenerator = new CompetitionGenerator();
        Competition competition = competitionGenerator.generateCompetition(originalList, "Competition1");
        competitions.add(competition);
        return competitions;
    }
}
