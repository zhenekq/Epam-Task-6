package by.epamtc.essence.util;

import by.epamtc.essence.Airplane;

import java.util.Comparator;

public class SortByLiftingCapacityComparator implements Comparator<Airplane> {
    @Override
    public int compare(Airplane o1, Airplane o2) {
        return liftingCapacity(o1) - liftingCapacity(o2);
    }

    private int liftingCapacity(Airplane airplane){
        return airplane.getLiftingCapacity();
    }
}
