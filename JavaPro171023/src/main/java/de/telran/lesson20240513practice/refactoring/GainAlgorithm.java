package de.telran.lesson20240513practice.refactoring;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;


/** The algorithm that counts income for voters in accordance with their prediction.
 * <p>Logic of the algorithm:
 * <p>1. If a player had voted for a team that lost, the money of a player is put to the winner's pool.
 * <p>2. If a player had voted for a team that won, he/she recieves an income according to this formula:
 * <p>income = normKoeff * stake * EXPONENTIAL_QUANTITY^-abs(result - prediction);
 * <p>where:
 * "normKoeff" - normalized koeff.,
 * "stake" - player's money put on goal count "prediction",
 * "result" - real goal count.*/
/** Алгоритм, подсчитывающий доходы избирателей в соответствии с их прогнозом.
 * <p>Логика алгоритма:
 * <р>1. Если игрок голосовал за проигравшую команду, деньги игрока помещаются в пул победителя.
 * <р>2. Если игрок проголосовал за команду, которая победила, он получает доход по такой формуле:
 * <p>доход = нормаКоэфф * ставка * EXPONENTIAL_QUANTITY^-abs(результат - прогноз);
 * <p>где:
 * "нормКоэфф" - нормированный коэфф.,
 * "ставка" - деньги игрока, поставленные на "прогноз" подсчета голов,
 * "result" - реальное количество голов.*/

public class GainAlgorithm {
    // 1. Streams
    // 2. methods and var naming
    // 3. code refactoring
    private static final int EXPONENTIAL_QUANTITY = 3;
    private static final int MAX_GOAL_DIFFERENCE = 5;

    public static ArrayList<Bet> getWinningBets(Match match, List<Bet> list) {//не используется
        ArrayList<Bet> resultList = new ArrayList<>();//!!!stream
        //resultList.stream().forEach();

        for (Bet bet : list) {
            if (bet.hasWon(match)) {
                resultList.add(bet);
            }
        }
        double[] listKoeff = new double[resultList.size()];
        int goalDifference = match.getGoalDifference();
        double[] koeff = setKoeff(goalDifference);

        // find listKoeff and total sum of listKoeff for normalization
        // найти listKoeff и общую сумму listKoeff для нормализации
        double sumKoeff = 0;
        for (int i = 0; i < resultList.size(); i++) {
            Bet bet = resultList.get(i);//*** обьеденить
            listKoeff[i] = koeff[Math.abs(bet.getCondition()) - 1]*bet.getStake();
            sumKoeff += listKoeff[i];
        }
        int pricepool = getPricePool(match, list);
        double normKoeff = (double)pricepool/sumKoeff;

        // set earned money for the list of bets
        // установить заработанные деньги по списку ставок
        for (int i = 0; i < resultList.size(); i++) {
            Bet bet = resultList.get(i);//*** обьеденить
            bet.setEarned(bet.getStake() + (int)(normKoeff*listKoeff[i]));
        }
        return resultList;
    }

    private static double[] setKoeff(int goalDifference) {//изменить название метода
        double[] koeff = new double[MAX_GOAL_DIFFERENCE];
        for (int i = 0; i < MAX_GOAL_DIFFERENCE; i++) {
            koeff[i] = Math.pow(EXPONENTIAL_QUANTITY, - Math.abs(Math.abs(goalDifference) - i - 1));
        }
        return koeff;
    }

    private static int getPricePool(Match match, List<Bet> list) {//изменить название метода
        int pricepool = 0;
        for (Bet bet : list) {
            if (!bet.hasWon(match)){
                pricepool += bet.getStake();
            }
        }
        return pricepool;
    }
}