package by.epamtc.essence.properties;

import by.epamtc.essence.Airplane;

import java.util.Comparator;

public class FuelComparator implements Comparator<Airplane> {

    @Override
    public int compare(Airplane o1, Airplane o2) {
        return fuel(o1);
    }

    public int fuel(Airplane airplane){
        return airplane.getFuel();
    }
}
