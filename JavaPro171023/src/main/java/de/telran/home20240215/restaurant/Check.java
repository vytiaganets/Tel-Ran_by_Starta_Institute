package de.telran.home20240215.restaurant;

public class Check implements Comparable<Check> {
    private int CheckNumber;

    private NameOfJuice NameOfJuice;

    public Check(int CheckNumber, NameOfJuice NameOfJuice) {
        this.CheckNumber = CheckNumber;
        this.NameOfJuice = NameOfJuice;
    }

    public int getCheckNumber() {
        return CheckNumber;
    }

    public void setCheckNumber(int CheckNumber) {
        this.CheckNumber = CheckNumber;
    }

    public NameOfJuice getNameOfJuice() {
        return NameOfJuice;
    }

    public void setNameOfJuice(NameOfJuice NameOfJuice) {
        this.NameOfJuice = NameOfJuice;
    }


    @Override
    public int compareTo(Check other) {
        return this.CheckNumber - other.CheckNumber;
    }

    @Override
    public String toString() {
        return "\nCheck{" +
                "CheckNumber=" + CheckNumber +
                ", NameOfJuice=" + NameOfJuice +
                '}';
    }

}
