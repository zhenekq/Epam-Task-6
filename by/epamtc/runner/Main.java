package by.epamtc.runner;

import by.epamtc.essence.Airline;
import by.epamtc.essence.Airplane;
import by.epamtc.essence.PassengerPlane;
import by.epamtc.essence.WarPlane;
import by.epamtc.file.DAO;
import by.epamtc.file.ReadFromFile;
import by.epamtc.file.WriteInFile;
import by.epamtc.util.Sort;
import by.epamtc.util.SortByFuelComparator;

import java.io.IOException;


public class Main {

    private static DAO read = new ReadFromFile();
    private static DAO write = new WriteInFile();

    public static void main(String[] args) throws IOException {
        Airline airline = new Airline("Arabian Airlines");
        read.perform(airline);
        write.perform(airline);

        WarPlane warPlane = new WarPlane();
        warPlane.setLiftingCapacity(43);
        warPlane.setCompany("LOL");
        warPlane.setName("KILLER");
        warPlane.setFuel(2);
        System.out.println(warPlane);
        Airline airline1 = new Airline();
        airline1.addAirplane(warPlane);
        airline1.addAirplane(new Airplane());
        PassengerPlane passengerPlane = new PassengerPlane();
        passengerPlane.setFuel(244);
        airline1.addAirplane(passengerPlane);
        System.out.println(airline1);
        Sort.sort(airline1, true, new SortByFuelComparator());
        System.out.println(airline1);
    }
}
