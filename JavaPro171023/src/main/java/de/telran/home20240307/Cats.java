package de.telran.home20240307;

public class Cats {
    private String nameOfCat;
    private int ageOfCat;


    public Cats(String nameOfCat, int ageOfCat) {
        this.nameOfCat = nameOfCat;
        this.ageOfCat = ageOfCat;
    }

    public String getNameOfCat() {
        return nameOfCat;
    }

    public int getAgeOfCat() {
        return ageOfCat;
    }

    @Override
    public String toString() {
        return "Cats{" +
                "nameOfCat='" + nameOfCat + '\'' +
                ", ageOfCat=" + ageOfCat +
                '}';
    }
}
