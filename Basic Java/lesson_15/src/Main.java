public class Main {
        public static void main(String[] args) {
//            int num = 10;
//            if (num != 15) {
//                System.out.println(num + " not equals 15");
//            }
//            if (num == 15) {
//                System.out.println(num + " equals 15");
//            }
//            System.out.println("I'm not in equals");
//        Создайте и инициализируйте переменную int = 10
//        В блоке if сравните созданную переменную со значением 15
//        Внутри блока добавьте инструкцию System.out.println("i is smaller than 15");
//        В  блоке else добавьте инструкцию System.out.println("i is greater than 15");
//        Проанализируйте вывод
//        if (num < 15) {
//            System.out.println(num + " is smaller than 15");
//        } else {
//            System.out.println(num + " is greater than 15");
//        }
//        Создайте и инициализируйте переменную int = 10
//        В блоке if сравните созданную переменную со значением 10 (==)
//        Внутри блока добавьте блок if и сравните переменную со значением 15 , внутри блока добавить инструкцию System.out.println("i is smaller than 15");
//        Добавите еще один блок if-else и сравните переменную со значением 12
//        В блоке if добавить инструкцию System.out.println("i is smaller than 12 too")
//        В  блоке else добавьте инструкцию System.out.println("i is greater than 12");
//        Проанализируйте вывод
////        nested-if
//        if (num == 10) {
//            if (num < 15) {
//                System.out.println(num + " is smaller than 15");
//            }
//            if (num < 12) {
//                System.out.println(num + " is smaller than 12");
//            } else {
//                System.out.println(num + " is greater than 12");
//            }
//        }
////        nested-if
//        if (num == 10) {
//            if (num < 15) {
//                System.out.println(num + " is smaller than 15");
//                if (num < 12) {
//                    System.out.println(num + " is smaller than 12");
//                } else {
//                    System.out.println(num + " is greater than 12");
//                }
//            }
//        }
////        if-else-if ladder
//        int n = 100;
//        if (n == 10) {
//            System.out.println(n + " is 10");
//        } else if (n == 15) {
//            System.out.println(n + " is 15");
//        } else if (n == 20) {
//            System.out.println(n + " is 20");
//        } else {
//            System.out.println(n + " is not present");
//        }
////        return
//        boolean t = true;
//        System.out.println("Before the return instruction");
//        if (t) {
//            System.out.println(t + " is true");
//            return;
//        }
////        return;
//        System.out.println("This won't execute");
////        return
//        boolean t = false;
//        System.out.println("Before the return instruction");
//        if (t) {
//            System.out.println(t + " is true");
//            return;
//        } else {
////            System.exit(0); -> return;
//        }
////        return;
//        System.out.println("This won't execute");
//            int x = 10;
//            double y = 5.5;
//        if (x > 30 && x < 50 && x != 5) {
//            System.out.println ("number from 30 to 50, and not equal to 5");
//        }
//        if (x < 10 || x > 40) {
//            System.out.println ("number is or less than 10 or greater than 40");
//        }
//        if (y == 5.5 || y == 10 || y == 8.3) {
//            System.out.println ("number is or 5.5 or 10 or 8.3");// number is or 5.5 or 10 or 8.3
//        }
//        if (y == 5.5 && y == 10) {
//            System.out.println ("Is there something wrong?");
//        }

                    int x = 49;
                    double y = 5.5;
                    if (x>30 && x< 50 && x!= 5) {
                        System.out.println(x + " from 30 to 50 not equals 5");
                    }
                    else if (x<10 || x> 40) {
                        System.out.println(x + " less than 10 or greater that 40");
                    } else
                    {
                        System.out.println("block else"); }
                    if (y== 5.5 || y == 10 || y== 8.3) {
                        System.out.println(y + " is 5.5 or 10 or 8.3");
                    }
                    else if (y== 5.5 && y== 10) {
                        System.out.println(" something new");
                    } else {
                        System.out.println("block else y"); }
        }
}
