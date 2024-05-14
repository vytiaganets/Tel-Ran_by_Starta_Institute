package de.telran.lesson20240514.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Exercise {
    public static void main(String[] args) throws NoSuchMethodException, NoSuchFieldException, InvocationTargetException, IllegalAccessException {
        Sample obj = new Sample();
        // Создаем новый объект класса из другого объекта
        Class cls = obj.getClass();
        System.out.println("Имя класса — " + cls.getName());
        // Получаем имя конструктора класса с помощью объекта
        Constructor constructor = cls.getConstructor();
        System.out.println("Имя конструктора — " +
                constructor.getName());
        System.out.println("Это публичные методы классов: ");
        // Получаем методы классов с помощью объектов
        Method[] methods = cls.getMethods();
// Выводим имена методов
        for (
                Method method : methods)
            System.out.println(method.getName());
        // Создаем объект нужного метода с помощью имени метода и параметра класса
        Method methodcall1 = cls.getDeclaredMethod("method2", int.class);
// Вызов метода во время исполнения
        methodcall1.invoke(obj, 25);
        // Создаем объект нужного поля с помощью имени поля
        Field field = cls.getDeclaredField("s");
// Открываем доступ к полю независимо от используемого в нем спецификатора доступа
        field.setAccessible(true);
// Устанавливаем новое значение поля
        field.set(obj, "Tel-Ran");
        // Создаем объект метода с помощью имени метода
        Method methodcall2 = cls.getDeclaredMethod("method1");
// Вызов метода во время исполнения
        methodcall2.invoke(obj);
        // Создаем третий объект метода с помощью имени метода
        Method methodcall3 = cls.getDeclaredMethod("method3");

//    public
//        Exercise() throws
//        NoSuchMethodException
//        {
//        }
// Изменяем настройки доступа
        methodcall3.setAccessible(true);
// Вызов метода во время исполнения

        methodcall3.invoke(obj);

        //Имя класса — de.telran.lesson20240514.reflection.Sample
        //Имя конструктора — de.telran.lesson20240514.reflection.Sample
        //Это публичные методы классов:
        //method2
        //method1
        //wait
        //wait
        //wait
        //equals
        //toString
        //hashCode
        //getClass
        //notify
        //notifyAll
        //Целое число — 25
        //Информация в строке — Tel-Ran
        //Вызов приватного метода
    }
}

