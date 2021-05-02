package by.epamtc.runner;

import by.epamtc.essence.Airline;
import by.epamtc.essence.Airplane;
import by.epamtc.essence.file.DAO;
import by.epamtc.essence.file.ReadFromFile;

import java.io.FileNotFoundException;


public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Airline airline = new Airline();
        Airplane airplane = new Airplane();
        DAO dao = new ReadFromFile();
        dao.perform(airline);
        System.out.println(airline);
        System.out.println(airplane.getCompany());
        Airline airline1 = new Airline("VOZNY");
        dao.perform(airline1);
        System.out.println(airline1);
    }
}
