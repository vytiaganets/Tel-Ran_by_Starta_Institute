//Лифт, находящийся на первом этаже здания высотой H, должен подняться на последний этаж.
//        Лифт сломан.
//        Каждый раз он поднимается на N этажей и спускается на M этажей. Если на последнем подъеме лифт превысил количество этажей, то считается что лифт поднялся на самый верх.
//        Найдите количество подъемов, которые понадобятся лифту.
//        Ввод:
//        H = 200, N = 50, M = 1
//        Ответ: 5
//        Объяснение:
//        Первый подъем: 50 - 1 = 49
//        Второй подъем: 49 + 50 - 1 = 98
//        Третий подъем: 98 + 50 - 1 = 147
//        Четвертый подъем: 147 + 50 - 1 = 196
//        Пятый подъем: выйти за пределы H.
//
//        Реализовать метод numberOfLifts(int floor, int stepUp, int stepDown)

public class Elevator {
    public static void main(String[] args) {
        int stepUp = 50;
        int stepDown = 1;
        int floor = 200;
        int sumOfLifts = 0;
        numberOfLifts(floor, sumOfLifts, stepUp, stepDown);
    }

    private static void numberOfLifts(int floor, int sumOfLifts, int stepUp, int stepDown) {
        while (floor > 0) {
            sumOfLifts++;
            floor = floor - stepUp + stepDown;
            if (floor <= 0) {
                break;
            }
        }
        System.out.println("Количество подьемов: " + sumOfLifts);//Количество подьемов: 5
    }
}
