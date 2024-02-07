package de.telran.lesson20240201.generics;

public class SimpleGeneric {
    public static void main(String[] args) {
        Account1 acc1 = new Account1(12345, 100);
        System.out.println(acc1); //de.telran.lesson01022024.generics.Account1@7a81197d
        //7a81197d - адресс в стеке
        // после переопределения toString: Account1{id=12345, sum=100}
        //rabotaiem s object
        AccountObject accObj1= new AccountObject(1111,200);
        System.out.println(accObj1);
        AccountObject accObj2= new AccountObject("23n3213",200);
        System.out.println(accObj2);
        AccountObject accObj3= new AccountObject(true,200);
        System.out.println(accObj3);
        Object obj1 = accObj3;
        System.out.println(obj1);
        int id = (int) accObj1.getId();
        System.out.println(id);
//        id = (int)accObj2.getId(); //error
//        id = (int)accObj2.getId();
        //if accObj1.getId() instanceof Integer; //old version
        AccountGeneric <Integer> accGen1 = new AccountGeneric<>(12345,100);
        System.out.println(accGen1);
        AccountGeneric<String> accGen2 = new AccountGeneric<>("cdc", 100);
        System.out.println(accGen2);
        //AccountGeneric<int[]> accGen3;//запрещено с примитивными типами
        int[] arr = {1,2,3,4,5};// no massiv mojno, massiv v Java - object type
        AccountGeneric<int[]> accGen3 = new AccountGeneric<>(arr, 100);
        System.out.println(accGen3);//AccountGeneric{id=[I@4a574795, sum=100} ssylka narealizasiiu v massive

        Accountable<Integer> accInt = new AccountInt(2313321,200);
        System.out.println(accInt);//AccountInt{id=2313321, sum=200}

        Accountable<String> accGenInterf = new AccountGenericInt<String>("23213ikno32", 100);
        System.out.println(accGenInterf);

        AccountTwoParam<String, Double> acc2Par1 = new AccountTwoParam<>("vvu43kj3jbkj3b3", 212.21);
        System.out.println(acc2Par1);
        System.out.println("*******");
        AccountTwoParam<Integer, Number> acc2Par3 = new AccountTwoParam<>(68689, 212);
        System.out.println(acc2Par3);//AccountTwoParam{id=68689, sum=212}
        AccountTwoParam<Integer, Double> acc2Par4 = new AccountTwoParam<>(68689, 212.100);
        System.out.println(acc2Par4);//AccountTwoParam{id=68689, sum=212.1}

        AccountTwoParam<Integer, Integer> acc2Par2 = new AccountTwoParam<>(121323,32321);
        //используем шаблонизированные методы
        Printer printer = new Printer();
        printer.print();
        Integer[] ints = {1,2,3,4,5,6,7,8,9};
        printer.print(ints);

        String[] strings = {"jkjbnkl", "lknlknk", "lkhkn"};
        printer.print(strings);

        Boolean[] bools = {true, false};
        printer.print(bools);
//уточняющий вызов, применяется редко
        printer.<Integer>print(ints);
        printer.<String>print(strings);
        printer.<Boolean>print(bools);
    }
}
