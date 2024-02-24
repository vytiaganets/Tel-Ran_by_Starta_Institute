package de.telran.home20240222.task3;

public class Transport implements Comparable<Transport> {
    private TypeOfTransport TypeOfTransport;
    private int priorityLevel;

    public Transport(TypeOfTransport TypeOfTransport) {
        this.TypeOfTransport = TypeOfTransport;
        this.priorityLevel = 4;
    }

    public TypeOfTransport getTypeOfTransport() {
        return TypeOfTransport;
    }

    public int getPriorityLevel() {
        return priorityLevel;
    }

    public void setPriorityLevel(int priorityLevel) {
        this.priorityLevel = priorityLevel;
    }

    @Override
    public String toString() {
        return "Transport{" +
                "TypeOfTransport=" + TypeOfTransport +
                ", priorityLevel=" + priorityLevel +
                "}";
    }


    @Override
    public int compareTo(Transport other) {
        if (this.getTypeOfTransport().equals(TypeOfTransport.AMBULANCE)) {
            this.setPriorityLevel(1);
        } else if (other.getTypeOfTransport().equals(TypeOfTransport.AMBULANCE)) {
            other.setPriorityLevel(1);
        }
        if (this.getPriorityLevel() == other.getPriorityLevel()) {
            return 0;
        } else if (this.getPriorityLevel() < other.getPriorityLevel()) {
            return -1;
        } else {
            return 1;
        }
    }
}
