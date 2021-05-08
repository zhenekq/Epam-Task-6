package by.epamtc.file;

import by.epamtc.essence.Airline;
import by.epamtc.essence.Airplane;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFromFile implements DAO {
    private static final String path = "database.txt";
    private static void readFromFile(Airline airline) throws FileNotFoundException {
        final String separator = File.separator;
        File file = new File(path);

        Scanner scanner = new Scanner(file);
        String separatorOfFile = " ";
        Airplane airplane;
        while (scanner.hasNextLine()){
            String line = scanner.nextLine();
            String[] parts = line.split(separatorOfFile);
            String nameOfAirplane = parts[0];
            int fuel = Integer.parseInt(parts[1]);
            int liftingCapacity = Integer.parseInt(parts[2]);
            airplane = new Airplane(nameOfAirplane, fuel, liftingCapacity);
            airline.addAirplane(airplane);
        }
        scanner.close();
    }

    @Override
    public void perform(Airline airline) throws FileNotFoundException {
        readFromFile(airline);
    }
}
