package de.telran.home20240222.task3;

public enum TypeOfTransport {
    AUTO("auto"),
    AMBULANCE("ambulance"),
    PUBLIC_BUS("public bus"),
    TECHNOLOGICAL_TRANSPORT_OF_THE_CITY_SERVICE("technological transport of the city service");

    TypeOfTransport() {
    }

    private String TypeOfTransport;

    TypeOfTransport(String TypeOfTransport) {
        this.TypeOfTransport = TypeOfTransport;
    }

    @Override
    public String toString() {
        return TypeOfTransport;
    }
}
