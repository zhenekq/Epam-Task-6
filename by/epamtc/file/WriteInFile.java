package by.epamtc.file;

import by.epamtc.essence.Airline;
import by.epamtc.essence.Airplane;
import by.epamtc.properties.AverageInformation;
import by.epamtc.properties.FuelComparator;
import by.epamtc.properties.LiftingComparator;

import java.io.*;

public class WriteInFile implements DAO {
    private static final String path = "output.txt";
    private void writeInFile(Airline airline) throws IOException {
        File file = new File(path);
        PrintWriter writer = new PrintWriter(file);
        writer.write(airline.getName() + " {\n");
        for(Airplane airplane: airline.getAirline()){
            writer.write(String.valueOf(airplane));
        }
        writer.write("}\n");
        int averageOfFuel = AverageInformation.averageCapacity(airline, new FuelComparator());
        int averageOfLifting = AverageInformation.averageCapacity(airline, new LiftingComparator());
        writer.write("Average amount of fuel --> " + averageOfFuel + "\n");
        writer.write("Average amount of lifting capacity --> " + averageOfLifting + "\n");
        writer.flush();
    }

    @Override
    public void perform(Airline airline) throws IOException {
        writeInFile(airline);
    }
}
