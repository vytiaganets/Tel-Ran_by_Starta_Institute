// Task 2.
//- Создать класс Student c полями name, surname, grade.
//- Создать общий список студентов в школе List<Student> schoolStudents. Всего в школе имеется 5 классов.
//- Написать метод, который преобразовал бы этот список в список List<List<Student>> studentGrades,
//распределив всех студентов по отдельным классам.
//Task 3.
//Имеется список студентов, распределенных по отдельным классам List<List<Student>> studentGrades
//- Написать метод countTotalAmount(), который считает общее число студентов
//- Написать метод countAmountWithName(), который считает количество студентов в школе с заданным именем name.
package de.telran.lesson20240212practice;

public class Student {
//    public static void main(String[] args) {
//          List<Student> students = new ArrayList<>();
//          students.add(new Student("Mark","Johnson",3));
//          students.add(new Student("Eva","Brown",2));
//          students.add(new Student("Tom","Vans",4));
//          students.add(new Student("Rebeca","Stark",4));
//          students.add(new Student("Steven","Klark",1));
//          students.add(new Student("Ivan","Olic",1));
//          students.add(new Student("Emre","Hosul",5));
//          students.add(new Student("Lina","Jackson",3));
//          students.add(new Student("Toni","Kadar",2));
//          students.add(new Student("Nemanja","Orsic",3));
//          students.add(new Student("Viktoria","Necid",5));
//
//          System.out.println(distributeStudentsByGrades(students));
//                }
//public static List<List<Student>> distributeStudentsByGrades(List<Student> students) {
//          List<Integer> grades = new ArrayList<>();
//          for (Student student : students) {
//              if(!grades.contains(student.getGrade())) {
//                  grades.add(student.getGrade());
//              }
//          }
//          Collections.sort(grades);
//
//          List<List<Student>> studentsGrades = new ArrayList<>();
//          for (int i = 0; i < grades.size(); i++) {
//              List<Student> studentsOfGrade = new ArrayList<>();
//              for (int j = 0; j < students.size(); j++) {
//                  if(grades.get(i) == students.get(j).getGrade()) {
//                      studentsOfGrade.add(students.get(j));
//                  }
//              }
//              studentsGrades.add(studentsOfGrade);
//          }
//          return studentsGrades;
//      }
}
