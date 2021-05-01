package by.epamtc.essence.properties;

import by.epamtc.essence.Airplane;

import java.util.Comparator;

public class LiftingComparator implements Comparator<Airplane> {
    @Override
    public int compare(Airplane o1, Airplane o2) {
        return liftingCapacity(o1);
    }

    public int liftingCapacity(Airplane airplane){
        return airplane.getLiftingCapacity();
    }
}
