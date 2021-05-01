package by.epamtc.runner;

import by.epamtc.essence.Airline;
import by.epamtc.essence.Airplane;
import by.epamtc.essence.util.Sort;
import by.epamtc.essence.util.SortByFuel;

public class Main {
    public static void main(String[] args) {
        Airline airline = new Airline("1");
        Airline airline1 = new Airline("2");
        Airplane airplane = new Airplane("ZLIANA FOMINA",12,32);
        Airplane airplane1 = new Airplane("XHENYA VOZNY", 15 ,566);
        Airplane airplane2 = new Airplane("YHENYA VOZNY", 1 ,566);
        Airplane airplane3 = new Airplane("CHENYA VOZNY", 414 ,566);
        Airplane airplane4 = new Airplane("FHENYA VOZNY", 1 ,566);
        Airplane airplane5 = new Airplane("HHENYA VOZNY", 334 ,566);
        Airplane airplane6 = new Airplane("AHENYA VOZNY", 1224 ,566);
        airline.addAirplane(airplane);
        airline.addAirplane(airplane1);
        airline.addAirplane(airplane2);
        airline.addAirplane(airplane3);
        airline.addAirplane(airplane4);
        airline.addAirplane(airplane5);
        airline.addAirplane(airplane6);

        System.out.println(airline);
        Sort.sort(airline,true, new SortByFuel());
        System.out.println(airline);

    }
}
