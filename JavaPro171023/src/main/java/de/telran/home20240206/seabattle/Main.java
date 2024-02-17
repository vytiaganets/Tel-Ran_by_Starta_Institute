//Консольное приложение.
//Одновременно в игре могут участвовать только два человека.
//Игроки вводят имена.
//У каждого игрока есть своё поле - квадрат 10х10 клеток
//По очереди расставляют свои корабли.
//4 однопалубных корабля,
//3 двухпалубных,
//2 трехпалубных,
//1 четырёхпалубный.
//Корабли можно располагать только по горизонтали или по вертикали.
//Между кораблями должна быть минимум одна клетка
//Игроки не видят расположение кораблей друг друга.
//Начинается игра. Первый игрок делает выстрел, сообщая нашему приложению координаты предполагаемой цели - номер клетки по горизонтали и номер клетки по вертикали.
//Если выстрел первого игрока оказался удачным, и он поразил цель, то возможно два варианта развития событий.
//Первый вариант: в указанной игроком клетки находится корабль, то, если корабль однопалубный, игрок "убил" корабль, если не однопалубный, то ранил. Следующий ход за первым игроком.
//Второй вариант: игрок не попал ни в какой корабль, ход переходит второму игроку.
//Таким образом, возвращаемся в пункт 8, передавая ход друг другу, игроки пытаются как можно раньше уничтожить корабли друг друга. Тот, кто первым, уничтожит все корабли - победитель. Печатаем поздравление и выход из игры.
package de.telran.home20240206.seabattle;

import java.util.Scanner;

public class Main {
    static final int FILED_LENGTH = 10;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Player 1, please, input your name");
        String player1Name = scanner.nextLine();
        System.out.println("Hello, " + player1Name + "!");

        System.out.println("Player 2, please, input your name");
        String player2Name = scanner.nextLine();
        System.out.println("Hello, " + player2Name + "!");

        char[][] playerField1 = new char[FILED_LENGTH][FILED_LENGTH];
        char[][] playerField2 = new char[FILED_LENGTH][FILED_LENGTH];

        fillPlayerField(playerField1);
        fillPlayerField(playerField2);
    }
    private static void fillPlayerField(char[][] playerField) {
        for (int i = 4; i >= 1; i--) {
            // растановка кораблей
            for (int k = i; k <= 5 - i; k++) {
                System.out.println("Расставляем " + i + "-палубный корабль. Осталось расставить: " + (k + 1));
                int position = 0;
                int y=0;
                int x=0;
                // иницализируем переменную начальным значением
                int validationResult = 1;
                while (validationResult != 0) {
                    System.out.println("Input x coord: ");
                    x = scanner.nextInt();

                    System.out.println("Input y coord: ");
                    y = scanner.nextInt();

                    System.out.println("1 - horizontal; 2 - vertical ?");
                    position = scanner.nextInt();
                    // если координата не прошла валидацию (проверку), то метод возвращает отрицательное
                    // значение, конечно, оно не равно нулю, поэтому пользователю придётся ввести координаты
                    // ещё раз
                    validationResult = validateCoordForShip(playerField, x, y, position, i);
                }

                // если корабль располагаем горизонтально
                if (position == 1) {
                    // заполняем '1' столько клеток по горизонтали, сколько палуб у корабля
                    for (int q = 0; q < i; q++) {
                        playerField[y][x + q] = '1';
                    }
                }

                // если корабль располагаем вертикально
                if (position == 2) {
                    // заполняем столько клеток по вертикали, сколько палуб у корабля
                    for (int m = 0; m < i; m++) {
                        playerField[y + m][x] = '1';
                    }
                }
                // печатаем в консоли поле игрока, на котором будет видно, где игрок уже поставил корабли
                // о реализации метода - см. ниже
                printField(playerField);
            }
        }
    }
    static void printField(char[][] field) {
        for (char[] cells : field) {
            for (char cell : cells) {
                // если значение дефолтовое (в случае char - 0), значит в данной клетке
                // корабль не установлен - печатаем пустую клетку
                if (cell == 0) {
                    System.out.print(" |");
                } else {
                    // если клетка непустая (значение отличается от дефолтового),
                    //тогда отрисовываем сожержимое клетки (элемента массива)
                    System.out.print(cell + "|");
                }
            }
            System.out.println("");
            System.out.println("--------------------");
        }
    }
    /**
     * Метод реализует логику игры: выстрел и передача хода.
     */
    /**
     * Метод реализует логику игры: выстрел и передача хода.
     */
    private static void playGame(String player1Name, String player2Name, char[][] playerField1, char[][] playerField2) {
        // "карты" выстрелов - создаём двумерные массивы, которые содержат все выстрелы
        // удачные (#) и неудачные (*)
        char[][] playerBattleField1 = new char[FILED_LENGTH][FILED_LENGTH];
        char[][] playerBattleField2 = new char[FILED_LENGTH][FILED_LENGTH];

        // вспомогательные переменные, которым будут присваиваться значения текущего игрока -
        // игрока, чья очередm делать выстрел. Сначала играет первый игрок, прошу прошения
        // за тавтологию
        String currentPlayerName = player1Name;
        char[][] currentPlayerField = playerField2;
        char[][] currentPlayerBattleField = playerBattleField1;

        // внутри цикла происходит смена очередности игроков, выстрел, его обработка.
        // код внутри цикла выполняется до тех пор, пока "живы" оба игрока - пока у двух игроков
        // "частично" цел (ранен) ещё хотя бы один корабль
        while (isPlayerAlive(playerField1) && isPlayerAlive(playerField2)) {
            // перед каждым выстрелом выводим в консоль отображение всех выстрелов игрока
            printField(currentPlayerBattleField);
            // принимаем от пользователя координаты выстрела
            System.out.println(currentPlayerName + ", please, input x coord of shot");
            int xShot = scanner.nextInt();
            System.out.println(currentPlayerName + ", please, input y coord of shot");
            int yShot = scanner.nextInt();

            // обрабатываем выстрел и получаем возвращаемое значение метода handleShot
            int shotResult = handleShot(currentPlayerBattleField, currentPlayerField, xShot, yShot);
            // если выстрел неудачный, и не один корабль не повреждён, то очередь переходит к следующему игроку
            if (shotResult == 0) {
                currentPlayerName = player2Name;
                currentPlayerField = playerField1;
                currentPlayerBattleField = playerBattleField2;
            }
        }
        System.out.println(currentPlayerName + " is winner!");
    }

    /**
     * Метод обрабатывает выстрел. Если выстрел удачный, то есть снаряд достиг цели -
     * в клетку записывается значение '#' (отображается к в массиве игрока, так и в массиве соперника),
     * а также на экран выводится сообщение 'Good shot!'. В этом случае метод возвращает значение 1.
     * В случае неудачного выстрела - в массив battleField записывается значение '0' в элемент [y][x], и
     * и возвращается значение 0.
     * Возвращаемые значения нам нужны для того, чтобы в методе, внутри которого вызывается метод handleShot,
     * мы могли понимать, успешно или неуспешно прошёл выстрел. На основе этого мы принимаем решение,
     * переходит ход к другому игроку или нет.
     */
    private static int handleShot(char[][] battleField, char[][] field, int x, int y) {
        if ('1'==field[y][x]) {
            field[y][x] = '#';
            battleField[y][x] = '#';
            System.out.println("Good shot!");
            return 1;
        }
        battleField[y][x] = '*';
        System.out.println("Bad shot!");
        return 0;
    }

    /**
     *	Метод определяет, не проиграл ли еще игрок. Если у игрока остался хотя бы
     * один "раненный" корабль, тогда пользователь продолжает игру.
     * То есть, если на карте у игрока остался хотя бы один символ '1', которым мы отмечали
     * корабли, то игра продолжается - возвращается значение true. Иначе false.
     */
    private static boolean isPlayerAlive(char[][] field) {
        for (char[] cells : field) {
            for (char cell : cells) {
                if ('1' == cell) {
                    return true;
                }
            }
        }
        return false;
    }
    private static int validateCoordForShip(char[][] field, int x, int y, int position, int shipType) {
        // если пользователь хочет расположить корабль горизонтально
        if (position == 1) {
            for (int i = 0; i < shipType - 1; i++) {
                if ('1' == field[y][x + i]
                        || '1' == field[y - 1][x + i]
                        || '1' == field[y + 1][x + i]
                        || '1' == field[y][x + i + 1]
                        || '1' == field[y][x + i - 1]
                        || (x + i) > 9) {
                    return -1;
                }
            }
        } else if (position == 2) {
            // если пользователь хочет расположить корабль вертикально
            for (int i = 0; i < shipType - 1; i++) {
                if ('1' == field[y][x + i]
                        || '1' == field[y - 1][x + i]
                        || '1' == field[y + 1][x + i]
                        || '1' == field[y][x + i + 1]
                        || '1' == field[y][x + i - 1]
                        || (y + i) > 9) {
                    return -1;
                }
            }
        }
        return 0;
    }
}
