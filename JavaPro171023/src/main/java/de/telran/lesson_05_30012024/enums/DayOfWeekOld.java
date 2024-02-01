package de.telran.lesson_05_30012024.enums;

public class DayOfWeekOld {
    private String title;

    private DayOfWeekOld(String title) {
        this.title = title;
    }

    public static DayOfWeekOld SUNDAY = new DayOfWeekOld("Воскресенье");
    public static DayOfWeekOld MONDAY = new DayOfWeekOld("Понедельник");
    public static DayOfWeekOld TUESDAY = new DayOfWeekOld("Вторник");
    public static DayOfWeekOld WEDNESDAY = new DayOfWeekOld("Среда");
    public static DayOfWeekOld THURSDAY = new DayOfWeekOld("Четверг");
    public static DayOfWeekOld FRIDAY = new DayOfWeekOld("Птяница");
    public static DayOfWeekOld SATURDAY = new DayOfWeekOld("Суббота");

    @Override
    public String toString() {
        return "DayOfWeekOld{" +
                "title='" + title + '\'' +
                '}';
    }
}
