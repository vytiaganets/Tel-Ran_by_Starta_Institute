package org.example;

import static org.example.Const.PLAYERS;
import static org.example.Util.*;

public class Lottery {
    public static void startLottery() {
        Integer[][] userNums = inputUserData();

        for (int i = 0; i < PLAYERS; i++) {
            checkArrayUniq(userNums[i], 0, (i + 1));
        }
        Integer[] winNums = checkArrayUniq(createWinData(), 1, 0);
        printResult(userNums, winNums);
    }

}