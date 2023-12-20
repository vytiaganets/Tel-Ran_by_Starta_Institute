public class Time {//            №2
//    Есть устройство, на табло которого показывается количество секунд, оставшихся до конца рабочего дня. Когда рабочий день начинается ровно в 9 часов утра — табло отображает «28800» (т.е. остаётся 8 часов), когда 14:30 — на табло «9000» (т.е. остаётся два с половиной часа), а когда наступает 17 часов — на табло отображается «0» (т.е. рабочий день закончился).
//    Некоторый сотрудники не умеют оценивать остаток рабочего дня в секундах.
//    Требуется написать программу, которая вместо секунд будет выводить на табло понятные фразы с информацией о том, сколько полных часов осталось до конца рабочего дня.
//    Например: «осталось 7 часов», «осталось 4 часа», «остался 1 час», «осталось менее часа».
//    Объяснение: в переменную n должно записываться случайное (на время тестирования программы) целое число из диапазона от 0 до 28800, далее оно должно выводиться на экран (для тех, кто понимает в секундах) и на следующей строке (для тех кто не понимает) должна выводиться фраза о количестве полных часов, содержащихся в n секундах.
//

    public static void main(String args [])
    {
        final int SEC_PER_MIN = 60;
        final int MIN_PER_HOUR = 60;
        final int TOTAL_SEC = 28800;

        int sec = (int)(Math.random() * TOTAL_SEC);
        int hour = (sec / SEC_PER_MIN) / MIN_PER_HOUR;

        System.out.println(sec + " секунд");//13855 секунд

        if(hour == 0) {
            System.out.println("Осталось менее часа");
        } else if(hour == 1) {
            System.out.println("Остался " + hour + " час");

        } else if(hour >= 2 && hour <= 4) {
            System.out.println("Осталось " + hour + " часа"); //Осталось 3 часа
        } else {
            System.out.println("Осталось " + hour + " часов");
        }
    }


}

