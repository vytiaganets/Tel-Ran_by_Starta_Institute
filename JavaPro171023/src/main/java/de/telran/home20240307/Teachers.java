package de.telran.home20240307;

public class Teachers {
    private String nameOfTeacher;
    private int ageOfTeacher;

    public Teachers(String nameOfTeacher, int ageOfTeacher) {
        this.nameOfTeacher = nameOfTeacher;
        this.ageOfTeacher = ageOfTeacher;
    }

    public String getNameOfTeacher() {
        return nameOfTeacher;
    }

    public void setNameOfTeacher(String nameOfTeacher) {
        this.nameOfTeacher = nameOfTeacher;
    }

    public int getAgeOfTeacher() {
        return ageOfTeacher;
    }

    public void setAgeOfTeacher(int ageOfTeacher) {
        this.ageOfTeacher = ageOfTeacher;
    }

    @Override
    public String toString() {
        return "Teachers{" +
                "nameOfTeacher='" + nameOfTeacher + '\'' +
                ", ageOfTeacher=" + ageOfTeacher +
                '}';
    }
}
