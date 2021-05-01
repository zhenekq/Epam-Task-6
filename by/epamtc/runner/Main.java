package by.epamtc.runner;

import by.epamtc.essence.Airline;
import by.epamtc.essence.Airplane;
import by.epamtc.essence.properties.AverageInformation;
import by.epamtc.essence.properties.FuelComparator;
import by.epamtc.essence.properties.LiftingComparator;
import by.epamtc.essence.util.Sort;
import by.epamtc.essence.util.SortByNameComparator;

public class Main {
    public static void main(String[] args) {
        Airline airline = new Airline("1");
        Airline airline1 = new Airline("2");
        Airplane airplane = new Airplane("ZLIANA FOMINA",12,32);
        Airplane airplane1 = new Airplane("XHENYA VOZNY", 15 ,44);
        Airplane airplane2 = new Airplane("YHENYA VOZNY", 1 ,10);
        Airplane airplane3 = new Airplane("CHENYA VOZNY", 414 ,566);
        Airplane airplane4 = new Airplane("FHENYA VOZNY", 1 ,9);
        Airplane airplane5 = new Airplane("HHENYA VOZNY", 334 ,2244);
        Airplane airplane6 = new Airplane("AHENYA VOZNY", 1224 ,12);
        airline.addAirplane(airplane);
        airline.addAirplane(airplane1);
        airline.addAirplane(airplane2);
        airline.addAirplane(airplane3);
        airline.addAirplane(airplane4);
        airline.addAirplane(airplane5);
        airline.addAirplane(airplane6);

        System.out.println(airline);
        Sort.sort(airline,false, new SortByNameComparator());
        System.out.println(airline);
        System.out.println(AverageInformation.averageCapacity(airline, new FuelComparator()));
    }
}
