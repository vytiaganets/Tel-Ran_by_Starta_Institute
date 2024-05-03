package org.example.lesson12;

public class MultiLegRobot {

    private static final Object monitor = new Object();

    private static int legIndex = 1;

    private static boolean forward = true;

    public static void main(String[] args) {
       int n = 40;
       
        for (int i = 1; i <= n; i++) {
            int finalI = i;
            Thread thread = new Thread(() -> {
                while (true) {
                    synchronized (monitor) {
                        if (legIndex == finalI) {
                            System.out.println("Leg " + finalI);
                       if(forward){
                           legIndex++;
                       } else {
                           legIndex--;
                       }
                            if(legIndex % n == 0){
                                forward = !forward;
                            }
                            if(legIndex == 0){
                                legIndex = 2;
                            }
                        } else {
                            try {
                                monitor.notify();
                                monitor.wait();
                                Thread.sleep(1);
                            } catch (
                                    InterruptedException e) {
                                throw new RuntimeException(e);
                            }
                        }
                    }
                }
            });
            thread.setName("Leg 1");
            thread.start();
        }
//        Thread leg1 = new Thread(() -> {
//            while (true) {
//                synchronized (monitor) {
//                    if (legIndex == 1) {
//                        System.out.println("Leg 1");
//                        legIndex = 2;
//                    } else {
//                        try {
//                            monitor.notify();
//                            monitor.wait();
//                            Thread.sleep(100);
//                        } catch (
//                                InterruptedException e) {
//                            throw new RuntimeException(e);
//                        }
//                    }
//                }
//            }
//        });
//        leg1.setName("Leg 1");
//        leg1.start();
//
//        Thread leg3 = new Thread(() -> {
//            while (true) {
//                synchronized (monitor) {
//                    if (legIndex == 3) {
//                        System.out.println("Leg 3");
//                        legIndex = 1;
//                    } else {
//                        try {
//                            monitor.notify();
//                            monitor.wait();
//                            Thread.sleep(100);
//                        } catch (
//                                InterruptedException e) {
//                            throw new RuntimeException(e);
//                        }
//                    }
//                }
//            }
//        });
//        leg3.setName("Leg 3");
//        leg3.start();
//
//
//        Thread leg2 = new Thread(() -> {
//            while (true) {
//                synchronized (monitor) {
//                    if (legIndex == 2) {
//                        System.out.println("Leg 2");
//                        legIndex = 3;
//                    } else {
//                        try {
//                            monitor.notify();
//                            monitor.wait();
//                            Thread.sleep(100);
//                        } catch (
//                                InterruptedException e) {
//                            throw new RuntimeException(e);
//                        }
//                    }
//                }
//            }
//        });
//        leg2.setName("Leg 2");
//        leg2.start();
    }
}