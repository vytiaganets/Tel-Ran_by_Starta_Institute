////1. На соревнованиях 5 спортсменов начинают одновременно стрелять в одну мишень.
////Если кто-нибудь в нее попадает(сделать Random-но), то мишень разрушается и другие в нее уже попасть не могут,
////но что-то пошло не так. Исправь программу, чтобы другие потоки "видели" изменения значения
////переменной isHit и больше его не меняли. Как только мишень разрушена кем то из стрелков,
////соревнования прекращаются. Воспользуйся классом AtomicBoolean и его методами.
////1. At competitions, 5 athletes begin shooting at the same target at the same time.
////If someone hits it (make it Random), then the target is destroyed and others can no longer hit it,
////but something went wrong. Correct the program so that other threads “see” the value changes
////variable isHit and did not change it again. As soon as the target is destroyed by one of the shooters,
////the competition is terminated. Use the AtomicBoolean class and its methods.
package de.telran.home20240416;

import java.util.concurrent.atomic.AtomicBoolean;

public class SimpleTask1 {
    public static void main(String[] args) {
        AtomicBoolean isHit = new AtomicBoolean(false);
        int playerCount = 5;
        Thread[] players = new Thread[playerCount];

        for (int i = 0; i < playerCount; i++) {
            players[i] = new Thread(() -> {
                if (isHit.compareAndSet(false, true)) {
                    System.out.println(Thread.currentThread().getName() + " hit the target!" +
                            "Target destroyed!");
                } else {
                    System.out.println(Thread.currentThread().getName() + " missed the target");
                }
            }, "Player " + (i + 1));
        }
        for (int i = 0; i < playerCount; i++) {
            players[i].start();
        }
        //Player 1 hit the target!Target destroyed!
        //Player 2 missed the target
        //Player 3 missed the target
        //Player 4 missed the target
        //Player 5 missed the target
    }
}