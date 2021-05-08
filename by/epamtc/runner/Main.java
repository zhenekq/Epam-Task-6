package by.epamtc.runner;

import by.epamtc.essence.Airline;
import by.epamtc.essence.Airplane;
import by.epamtc.essence.file.DAO;
import by.epamtc.essence.file.ReadFromFile;
import by.epamtc.essence.file.WriteInFile;
import by.epamtc.essence.properties.AverageInformation;
import by.epamtc.essence.properties.FuelComparator;
import by.epamtc.essence.properties.LiftingComparator;
import by.epamtc.essence.util.Sort;
import by.epamtc.essence.util.SortByLiftingCapacityComparator;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;


public class Main {

    private static DAO read = new ReadFromFile();
    private static DAO write = new WriteInFile();

    public static void main(String[] args) throws IOException {
        Airline airline = new Airline("Arabian Airlines");
        read.perform(airline);
        write.perform(airline);
    }
}
