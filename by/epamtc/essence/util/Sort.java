package by.epamtc.essence.util;

import by.epamtc.essence.Airline;
import by.epamtc.essence.Airplane;

public class Sort {
    public static void sort(Airline airline, boolean way, SortByFuel howCompare) {
        for (int i = 0; i < airline.getAirline().size(); i++) {
            for (int j = 0; j < airline.getAirline().size() - i - 1; j++) {
                if (howCompare.compare(airline.getAirline().get(j), airline.getAirline().get(j + 1)) > 0 == way) {
                    Airplane airline1 = airline.getAirline().get(j);
                    airline.getAirline().set(j, airline.getAirline().get(j + 1));
                    airline.getAirline().set(j + 1, airline1);
                }
            }
        }
    }
}
