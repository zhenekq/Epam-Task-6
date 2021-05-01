package by.epamtc.essence.util;

import by.epamtc.essence.Airline;
import by.epamtc.essence.Airplane;

import java.util.Comparator;

public class Sort {
    public static void sort(Airline airline, boolean way, Comparator<Airplane>... howCompare) {
        for (int i = 0; i < airline.getAirline().size(); i++) {
            for (int j = 0; j < airline.getAirline().size() - i - 1; j++) {
                for (int comparatorIndex = 0; comparatorIndex < howCompare.length; comparatorIndex++) {
                    boolean condition = howCompare[comparatorIndex].compare(airline.getAirline().get(j),
                            airline.getAirline().get(j + 1)) > 0 == way;
                    if (condition) {
                        Airplane airline1 = airline.getAirline().get(j);
                        airline.getAirline().set(j, airline.getAirline().get(j + 1));
                        airline.getAirline().set(j + 1, airline1);
                    }
                }
            }
        }
    }
}
