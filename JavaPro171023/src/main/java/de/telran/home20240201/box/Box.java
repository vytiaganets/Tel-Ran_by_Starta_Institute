package de.telran.home20240201.box;

public class Box<Template> {
    private final int weight;
    private final int lenght;
    private final int height;
    private Exemplar exemplar;

    public Box(int weight, int lenght, int height) {
        this.weight = weight;
        this.lenght = lenght;
        this.height = height;
        //this.exemplar = exemplar;
    }

    public int getWeight() {
        return weight;
    }

    public int getLenght() {
        return lenght;
    }

    public int getHeight() {
        return height;
    }

    public Exemplar getExemplar() {
        return exemplar;
    }

    public void setExemplar(Exemplar exemplar) {
        this.exemplar = exemplar;
    }

    @Override
    public String toString() {
        return "Box{" +
                "weight=" + weight +
                ", lenght=" + lenght +
                ", height=" + height +
                ", exemplar=" + exemplar +
                '}';
    }
    public boolean putExemplar(Exemplar exemplar){
        if(this.weight>exemplar.getWeight()&&this.height>exemplar.getHeight()&&this.lenght>exemplar.getLenght()){
            this.exemplar = exemplar;
            System.out.println(exemplar.getName()+" in box.");
            return true;
        } else {
            System.out.println(exemplar.getName()+" box is small.");
            return false;
        }
    }
}
