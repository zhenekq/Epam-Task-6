package by.epamtc.properties;

import by.epamtc.essence.Airline;
import by.epamtc.essence.Airplane;

import java.util.Comparator;

public class AverageInformation {
    public static int averageCapacity(Airline airline, Comparator<Airplane> info){
        int averageCapacity = 0;
        for(Airplane plane: airline.getAirline()){
            if(info.compare(plane,plane) > 0){
                averageCapacity += info.compare(plane,plane);
            }
        }
        return averageCapacity;
    }
}
