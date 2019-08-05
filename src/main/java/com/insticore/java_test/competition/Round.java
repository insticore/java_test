package com.insticore.java_test.competition;

import java.util.ArrayList;
import java.util.List;

public class Round {
    private List<Match> matches = new ArrayList<>();

    public List<Match> getMatches() {
        return matches;
    }

    public void setMatches(List<Match> matches) {
        this.matches = matches;
    }
}