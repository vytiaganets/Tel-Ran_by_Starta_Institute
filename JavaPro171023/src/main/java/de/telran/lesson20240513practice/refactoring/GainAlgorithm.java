package de.telran.lesson20240513practice.refactoring;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


/**
 * The algorithm that counts income for voters in accordance with their prediction.
 * <p>Logic of the algorithm:
 * <p>1. If a player had voted for a team that lost, the money of a player is put to the winner's pool.
 * <p>2. If a player had voted for a team that won, he/she recieves an income according to this formula:
 * <p>income = normKoeff * stake * EXPONENTIAL_QUANTITY^-abs(result - prediction);
 * <p>where:
 * "normKoeff" - normalized koeff.,
 * "stake" - player's money put on goal count "prediction",
 * "result" - real goal count.
 */

public class GainAlgorithm {
    private static final int EXPONENTIAL_QUANTITY = 3;
    private static final int MAX_GOAL_DIFFERENCE = 5;

    public static ArrayList<Bet> calculateAwardsForWinningBets(Match match, List<Bet> list) {
        ArrayList<Bet> winningBets = list.stream()
                .filter(bet -> bet.hasWon(match))
                .collect(Collectors.toCollection(ArrayList::new));


        double[] winningKoeff = calculateWinningKoeff(match.getGoalDifference());

        double[] awardDistribution = calculateAwardDistribution(winningBets, winningKoeff);

        double sumKoeff = Arrays.stream(awardDistribution)
                .reduce(0, Double::sum);

        int pricePool = getPricePool(match, list);
        double normKoeff = (double) pricePool / sumKoeff;

        setEarnedMoney(winningBets, normKoeff, awardDistribution);
        return winningBets;
    }

    private static void setEarnedMoney(ArrayList<Bet> resultList, double normKoeff, double[] awardDistribution) {
        for (int i = 0; i < resultList.size(); i++) {
            Bet bet = resultList.get(i);
            bet.setEarned(bet.getStake() + (int) (normKoeff * awardDistribution[i]));
        }
    }

    private static double[] calculateAwardDistribution(ArrayList<Bet> resultList, double[] winningKoeff) {
        double[] listKoeff = new double[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            Bet bet = resultList.get(i);
            listKoeff[i] = winningKoeff[Math.abs(bet.getCondition()) - 1] * bet.getStake();
        }
        return listKoeff;
    }

    private static double[] calculateWinningKoeff(int goalDifference) {
        double[] koeff = new double[MAX_GOAL_DIFFERENCE];
        for (int i = 0; i < MAX_GOAL_DIFFERENCE; i++) {
            koeff[i] = Math.pow(EXPONENTIAL_QUANTITY, -Math.abs(Math.abs(goalDifference) - i - 1));
        }
        return koeff;
    }

    private static int getPricePool(Match match, List<Bet> list) {
        return list.stream()
                .filter(bet -> bet.hasWon(match))
                .map(Bet::getStake)
                .reduce(0, Integer::sum);

    }

}
