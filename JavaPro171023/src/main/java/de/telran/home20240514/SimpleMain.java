package de.telran.home20240514;
//1. Представьте, что Вы ревьювите код в классе, который написал Ваш коллега.
//Вас не устраивает реализация некоторых методов в классе, характеристик и есть даже замечания по реализации самого класса.
//Вам нужно создать аннотацию, которой Вы можете пометить вышеуказанные участки кода, указать в ней ФИО ревьювера и
//написать в ней комментарий, в чем же Вы видите проблему.
//1. Imagine that you are reviewing code in a class that your colleague wrote.
//You are not satisfied with the implementation of some methods in the class, characteristics, and there are even comments on the implementation of the class itself.
//You need to create an annotation with which you can mark the above sections of code, indicate in it the name of the reviewer and
//write a comment in it, what do you see as the problem.
//2*. Для первой задачи напишите программу, которая с помощью Reflection API сможет найти все участки кода, которые
//помечены пользовательской аннотацией и выведет информацию в виде списка необходимых доработок в формате:
//Имя метода/класса/характеристики, ФИО ревьювера, Комментарий.
//2*. For the first task, write a program that, using the Reflection API, can find all the sections of code that
//marked with a custom annotation and will display information in the form of a list of necessary improvements in the format:
//Name of the method/class/characteristic, full name of the reviewer, Comment.

import java.lang.reflect.Field;
import java.lang.reflect.Method;

@BadCode(name = "Peter Peter", comment = "Comment1")

public class SimpleMain {
    int number;

    @BadCode(name = "Peter Peter", comment = "Comment2")
    private String string;

    @BadCode(name = "Peter Peter", comment = "Comment3")
    public void print() {
        System.out.println(string + number);
    }

    public static void main(String[] args) {

        SimpleMain badClass = new SimpleMain();

        Class aClass = badClass.getClass();
        if (aClass.isAnnotationPresent(BadCode.class)) {
            System.out.println("Class name: " + aClass.getSimpleName());
            BadCode annotation = (BadCode) aClass.getAnnotation(BadCode.class);
            System.out.println("Reviewer name: " + annotation.name());
            System.out.println("A comment: " + annotation.comment());
        }

        System.out.println();

        Field[] declaredFields = badClass.getClass().getDeclaredFields();
        for (Field field : declaredFields) {
            if (field.isAnnotationPresent(BadCode.class)) {
                System.out.println("Field name: " + field.getName());
                System.out.println("Reviewer name: " + field.getAnnotation(BadCode.class).name());
                System.out.println("A comment: " + field.getAnnotation(BadCode.class).comment());
            }
        }

        System.out.println();

        Method[] declaredMethods = badClass.getClass().getDeclaredMethods();
        for (Method method : declaredMethods) {
            if (method.isAnnotationPresent(BadCode.class)) {
                System.out.println("Method name: " + method.getName());
                System.out.println("Reviewer name: " + method.getAnnotation(BadCode.class).name());
                System.out.println("A comment: " + method.getAnnotation(BadCode.class).comment());
            }
        }
        //Class name: SimpleMain
        //Reviewer name: Peter Peter
        //A comment: Comment1
        //
        //Field name: string
        //Reviewer name: Peter Peter
        //A comment: Comment2
        //
        //Method name: print
        //Reviewer name: Peter Peter
        //A comment: Comment3
    }
}