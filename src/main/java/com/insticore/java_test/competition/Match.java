package com.insticore.java_test.competition;

public class Match {
    private final static int DEFAULT_VICTORY_PRICE = 3;
    private final static int DEFAULT_DRAW_PRICE = 1;

    private Team homeTeam;
    private Team guestTeam;
    private MatchStatus matchStatus = MatchStatus.UNFINISHED;
    private int victoryPrice = DEFAULT_VICTORY_PRICE;
    private int drawPrice = DEFAULT_DRAW_PRICE;

    public enum MatchStatus {
        UNFINISHED, HOME_VICTORY, GUEST_VICTORY, DRAW
    }

    public Match(Team homeTeam, Team guestTeam) {
        this.homeTeam = homeTeam;
        this.guestTeam = guestTeam;
    }

    public Match(Team homeTeam, Team guestTeam, int victoryPrice, int drawPrice) {
        this.homeTeam = homeTeam;
        this.guestTeam = guestTeam;
        this.victoryPrice = victoryPrice;
        this.drawPrice = drawPrice;
    }

    public Team getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(Team homeTeam) {
        this.homeTeam = homeTeam;
    }

    public Team getGuestTeam() {
        return guestTeam;
    }

    public void setGuestTeam(Team guestTeam) {
        this.guestTeam = guestTeam;
    }

    public MatchStatus getMatchStatus() {
        return matchStatus;
    }

    public void setMatchStatus(MatchStatus matchStatus) {
        this.matchStatus = matchStatus;
    }

    public int getVictoryPrice() {
        return victoryPrice;
    }

    public void setVictoryPrice(int victoryPrice) {
        this.victoryPrice = victoryPrice;
    }

    public int getDrawPrice() {
        return drawPrice;
    }

    public void setDrawPrice(int drawPrice) {
        this.drawPrice = drawPrice;
    }

    public Team getWinner() {
        if (MatchStatus.HOME_VICTORY.equals(matchStatus)) {
            return homeTeam;
        } else if (MatchStatus.GUEST_VICTORY.equals(matchStatus)) {
            return guestTeam;
        }
        return null;
    }
}