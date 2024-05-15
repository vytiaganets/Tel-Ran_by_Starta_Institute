package de.telran.lesson20240513practice.refactoring;


public class Match {
    private Integer goalsA = 0;
    private Integer goalsB = 0;

    public int getGoalDifference(){
        return goalsA - goalsB;
    }

    public void setGoalsA(Integer goalsA) {
        this.goalsA = goalsA;
    }

    public void setGoalsB(Integer goalsB) {
        this.goalsB = goalsB;
    }

}
