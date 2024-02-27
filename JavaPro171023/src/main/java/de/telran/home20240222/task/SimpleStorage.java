//1) Вы работаете на Центре, который продает один вид продукции, не имеющий сроков хранения, например кирпич, авто.
//У вас всего одни двери на Центре, через которые вы загружаете новый товар и отгружаете заказчикам тоже через эту же дверь.
//Как бы вы построили рабочий процесс на Вашем Центре, какую бы коллекцию использовали для имитации процесса работы?
//Напишите программу, которая бы имитировала работу.
//2)* Тот же Центр, что и в случае п.1 но у Вас есть две двери - одна в начале Центра, вторая в конце.
//Как бы вы построили оптимальный рабочий процесс на Вашем Центре, какую бы коллекцию использовали для имитации процесса работы?
//Напишите программу, которая бы имитировала работу.
package de.telran.home20240222.task;

import java.util.Stack;

public class SimpleStorage {
    public static void main(String[] args) {
        //1) You work at a Center that sells one type of product that does not have a shelf life, for example brick.
        //You have only one door at the Center, through which you load new goods and ship them to customers through the same door.
        //How would you build a workflow in your Center, what collection would you use to simulate the work process?
        //Write a program that would simulate the work.
        System.out.println("==========Task #1==========");

        Stack<Auto> autoCenter1 = new Stack<>();
        autoCenter1.push(new Auto(652, 62652));
        autoCenter1.push(new Auto(345, 45636));
        autoCenter1.push(new Auto(753, 56747));
        autoCenter1.push(new Auto(578, 23541));
        autoCenter1.push(new Auto(122, 51512));
        autoCenter1.push(new Auto(544, 56844));
        System.out.println("Center at the moment: ");
        System.out.println(autoCenter1);
        System.out.println();

        System.out.println("First car" + autoCenter1.peek().getAutoNumber());
        System.out.println();

        System.out.println("Auto:" + autoCenter1.pop().getAutoNumber());
        System.out.println();

        System.out.println("Center after the car has been shipped:");
        System.out.println(autoCenter1);
        System.out.println();

        System.out.println("Next auto: " + autoCenter1.peek().getAutoNumber() );
        System.out.println();

        System.out.println("Auto: " + autoCenter1.pop().getAutoNumber() + " отгружена клиенту." );
        System.out.println();

        System.out.println("Center at the moment: ");
        System.out.println(autoCenter1);
        //2)* The same Center as in the case of step 1, but you have two doors - one at the beginning of the Center, the second at the end.
        //How would you build an optimal workflow at your Center, what collection would you use to simulate the work process?
        //Write a program that would simulate the work.
        //Center at the moment:
        //[
        // Auto{ number=652, number of cars=62652},
        // Auto{ number=345, number of cars=45636},
        // Auto{ number=753, number of cars=56747},
        // Auto{ number=578, number of cars=23541},
        // Auto{ number=122, number of cars=51512},
        // Auto{ number=544, number of cars=56844}]
        //
        //First car544
        //
        //Auto:544
        //
        //Center after the car has been shipped:
        //[
        // Auto{ number=652, number of cars=62652},
        // Auto{ number=345, number of cars=45636},
        // Auto{ number=753, number of cars=56747},
        // Auto{ number=578, number of cars=23541},
        // Auto{ number=122, number of cars=51512}]
        //
        //Next auto: 122
        //
        //Auto: 122 отгружена клиенту.
        //
        //Center at the moment:
        //[
        // Auto{ number=652, number of cars=62652},
        // Auto{ number=345, number of cars=45636},
        // Auto{ number=753, number of cars=56747},
        // Auto{ number=578, number of cars=23541}]
        System.out.println("==========Task #2==========");
        Stack<Auto> autoCenter2 = new Stack<>();
        autoCenter2.push(new Auto(421, 56737));
        autoCenter2.push(new Auto(321, 84585));
        autoCenter2.push(new Auto(214, 36757));
        autoCenter2.push(new Auto(436, 78476));
        autoCenter2.push(new Auto(322, 24565));
        autoCenter2.push(new Auto(343, 76854));
        System.out.println("Center at the moment:");
        System.out.println(autoCenter2);
        System.out.println();

        System.out.println("First Auto: " + autoCenter2.peek().getAutoNumber());
        System.out.println();

        System.out.println("Auto: " + autoCenter2.pop().getAutoNumber());
        System.out.println();

        System.out.println("Center after the car has been shipped: ");
        System.out.println(autoCenter1);
        System.out.println();

        System.out.println("Next auto: " + autoCenter2.peek().getAutoNumber() );
        System.out.println();

        System.out.println("Auto:" + autoCenter2.pop().getAutoNumber());
        System.out.println();

        System.out.println("Center at the moment:");
        System.out.println(autoCenter2);
        //Center at the moment:
        //[
        // Auto{ number=421, number of cars=56737},
        // Auto{ number=321, number of cars=84585},
        // Auto{ number=214, number of cars=36757},
        // Auto{ number=436, number of cars=78476},
        // Auto{ number=322, number of cars=24565},
        // Auto{ number=343, number of cars=76854}]
        //
        //First Auto: 343
        //
        //Auto: 343
        //
        //Center after the car has been shipped:
        //[
        // Auto{ number=652, number of cars=62652},
        // Auto{ number=345, number of cars=45636},
        // Auto{ number=753, number of cars=56747},
        // Auto{ number=578, number of cars=23541}]
        //
        //Next auto: 322
        //
        //Auto:322
        //
        //Center at the moment:
        //[
        // Auto{ number=421, number of cars=56737},
        // Auto{ number=321, number of cars=84585},
        // Auto{ number=214, number of cars=36757},
        // Auto{ number=436, number of cars=78476}]
    }
}
