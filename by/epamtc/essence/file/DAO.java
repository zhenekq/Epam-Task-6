package by.epamtc.essence.file;

import by.epamtc.essence.Airline;

import java.io.FileNotFoundException;

public interface DAO {
    void perform(Airline airline) throws FileNotFoundException;
}
