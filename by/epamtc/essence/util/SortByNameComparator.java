package by.epamtc.essence.util;

import by.epamtc.essence.Airplane;

import java.util.Comparator;

public class SortByNameComparator implements Comparator<Airplane> {
    @Override
    public int compare(Airplane o1, Airplane o2) {
        return name(o1).compareTo(name(o2));
    }
    private String name(Airplane airplane){
        return airplane.getName();
    }
}
