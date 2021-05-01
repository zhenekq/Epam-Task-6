package by.epamtc.essence.util;

import by.epamtc.essence.Airline;
import by.epamtc.essence.Airplane;

import java.util.Comparator;

public class SortByFuel implements Comparator<Airplane> {
    @Override
    public int compare(Airplane o1, Airplane o2) {
        return value(o1) - value(o2);
    }

    private int value(Airplane airplane) {
        return airplane.getFuel();
    }


}
