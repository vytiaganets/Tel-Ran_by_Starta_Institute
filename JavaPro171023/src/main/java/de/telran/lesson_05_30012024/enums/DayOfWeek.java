package de.telran.lesson_05_30012024.enums;

public enum DayOfWeek {
    SUNDAY ("Воскресенье"),
    MONDAY,//new DayOfWeek()
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY("Суббота");
    private String title;

  DayOfWeek(String title) {//контструктор private
        this.title = title;
    }

 DayOfWeek() {//контструктор private
    }

    @Override
    public String toString() {
        return "DayOfWeek{" +
                "title='" + title + '\'' +
                '}' + super.toString();
    }
}
