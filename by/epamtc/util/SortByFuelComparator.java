package by.epamtc.util;

import by.epamtc.essence.Airplane;

import java.util.Comparator;

public class SortByFuelComparator implements Comparator<Airplane> {
    @Override
    public int compare(Airplane o1, Airplane o2) {
        return fuel(o1) - fuel(o2);
    }

    private int fuel(Airplane airplane) {
        return airplane.getFuel();
    }


}
