package de.telran.home20240130.coffeeautomat;

import java.util.Scanner;
public class CoffeeAutomat {
public static CoffeeTypes[] coffeeTypes = CoffeeTypes.values();
public static volatile CoffeeAutomat example;
        CoffeeAutomat() {
        }
        public static CoffeeAutomat getExample() {
            if (example == null) {
                synchronized (CoffeeAutomat.class) {
                    if (example == null) {
                        example = new CoffeeAutomat();
                        return example;
                    }
                }
            }
            return example;
        }

        public void getCoffee() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Please, make choice: ");
            System.out.println("0 - latte, 1 - espresso, 2 - americano");
            int temp = sc.nextInt();
            switch (temp) {
                case 0:
                    System.out.println("Ready " + CoffeeTypes.LATTE);
                    break;
                case 1:
                    System.out.println("Ready " + CoffeeTypes.ESPRESSO);
                    break;
                case 2:
                    System.out.println("Ready " + CoffeeTypes.AMERICANO);
                    break;
                default:
                    System.out.println("Error");
            }
        }
    }
