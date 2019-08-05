package com.insticore.java_test.competition;

import java.util.ArrayList;
import java.util.List;

public class Competition {

    private String name;
    private List<Round> rounds = new ArrayList<>();

    public Competition(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Round> getRounds() {
        return rounds;
    }

    public void setRounds(List<Round> rounds) {
        this.rounds = rounds;
    }






}
