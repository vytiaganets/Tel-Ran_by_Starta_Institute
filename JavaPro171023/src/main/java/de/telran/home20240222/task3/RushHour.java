package de.telran.home20240222.task3;

import java.util.Comparator;

public class RushHour implements Comparator<Transport> {
    @Override
    public int compare(Transport transport1, Transport transport2) {
        if (transport1.getTypeOfTransport().equals(TypeOfTransport.AMBULANCE)) {
            transport1.setPriorityLevel(1);
        } else if (transport2.getTypeOfTransport().equals(TypeOfTransport.AMBULANCE)) {
            transport2.setPriorityLevel(1);
        }
        if (transport1.getTypeOfTransport().equals(TypeOfTransport.PUBLIC_BUS)) {
            transport1.setPriorityLevel(2);
        } else if (transport2.getTypeOfTransport().equals(TypeOfTransport.PUBLIC_BUS)) {
            transport2.setPriorityLevel(2);
        }

        if (transport1.getPriorityLevel() == transport2.getPriorityLevel()) {
            return 0;
        } else if (transport1.getPriorityLevel() < transport2.getPriorityLevel()) {
            return -1;
        } else {
            return 1;
        }
    }
}
