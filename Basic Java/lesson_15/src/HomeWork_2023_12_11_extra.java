//Создайте две переменные *isWeekend* и *isRain*.
//
//        Создайте переменную *canWalk*, значение которой должно быть истинным, если это выходной день (isWeekend = true) и не идет дождь (isRain = false).
//
//        Создайте метод, который принимает два параметра и возвращает значение true/false
//
//        Результат сохраните в canWalk
//
//        Распечатайте в консоль.



public class HomeWork_2023_12_11_extra {

    public static void main(String[] args) {

        boolean isWeekend = true;

        boolean isRain = false;

        boolean canWalk = walkOrNot(isWeekend, isRain);





        System.out.println(canWalk);

    }



    public static boolean walkOrNot(boolean isWeekend, boolean isRain) {



        if (isWeekend && !isRain) {

            return true;

        }

        return false;

    }



} 