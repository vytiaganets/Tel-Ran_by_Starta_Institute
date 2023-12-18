//        Вы реализуете игру, в которой вы показываете пользователю некоторые параметры,
//        нажмите 1, чтобы сделать это...,
//        нажмите 2, чтобы сделать это... и т. д.,
//        и нажмите "Q", чтобы выйти из игры.
//        Реализуйте меню выбора игрока (Elf or Orc and Exit)
//        Отобразите меню
//        1. Elf
//        2. Orc
//        3. Exit
//        Проверьте ввод на соответствие, в случае неверного ввода распечатайте "Choose any one : " и покажите меню выбора
//        Сохраните выбор
//        Распечатайте выбор в консоль

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        do {
            System.out.println("Выберите героя: ");
            System.out.println("1. Elf");
            System.out.println("2. Orc");
            System.out.println("3. Exit");
            System.out.println("Выберите кого-то");
            num = sc.nextInt();
        } while (num != 1 && num != 2 && num != 3);
        switch (num) {
            case 1:
                System.out.println("Вы выбрали эльфа");
                break;
            case 2:
                System.out.println("Вы выбрали орка");
                break;
            case 3:
                System.out.println("Пока!");
                break;
            default:
                System.out.println("Default");
                break;
        }

//        import java.util.Scanner;
//        public class Task2 {
//            public static void main(String[] args) {
//                Scanner sc = new Scanner(System.in);
//                int num;
//                do {
//                    System.out.println("Выберите героя: ");
//                    System.out.println("1. Elf");
//                    System.out.println("2. Orc");
//                    System.out.println("3. Exit");
//                    System.out.println("Выберите кого то");
//                    num = sc.nextInt();
//                } while (num != 1 && num != 2 && num != 3);
//                switch (num) {
//                    case 1:
//                        System.out.println("Вы выбрали эльфа");
//                        break;
//                    case 2:
//                        System.out.println("Вы выбрали орка");
//                        break;
//                    case 3:
//                        System.out.println("Пока!");
//                        break;
//                    default:
//                        System.out.println(" Default");
//                }
//            }
//        }




    }
    }
