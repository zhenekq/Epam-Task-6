package by.epamtc.essence.file;

import by.epamtc.essence.Airline;

import java.io.IOException;

public interface DAO {
    void perform(Airline airline) throws IOException;
}
