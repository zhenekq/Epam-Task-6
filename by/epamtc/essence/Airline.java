package by.epamtc.essence;

import by.epamtc.exception.WrongCapacityException;

import java.util.ArrayList;
import java.util.Objects;

public class Airline {

    final String DEFAULT_NAME_OF_AIRLINE = "Tiny Airlines";

    private String name = DEFAULT_NAME_OF_AIRLINE;
    private ArrayList<Airplane> airline = new ArrayList<>();
    private int capacity = airline.size();

    public Airline(String name) {
        this.name = name;
    }

    public Airline() {
        name = DEFAULT_NAME_OF_AIRLINE;
        airline = new ArrayList<>(capacity);
    }

    public Airline(String name, ArrayList<Airplane> airline) {
        if (airline == null) {
            //exception
        }
        this.name = name;
        this.airline = airline;
        capacity = airline.size();
    }

    public Airline(String name, ArrayList<Airplane> airline, int capacity) throws WrongCapacityException {
        this.name = name;
        this.airline = airline;
        if (capacity >= 0) {
            this.capacity = airline.size();
        } else {
            throw new WrongCapacityException("Airline " + name + " Can't have capacity lower than zero!!!");
        }
    }

    public void addAirplane(Airplane... airplane) {
        for (int i = 0; i < airplane.length; i++) {
            airline.add(airplane[i]);
            airplane[i].setCompany(getName());
        }
        capacity++;
    }

    public void removeAirplane(Airplane airplane) {
        airline.remove(airplane);
        capacity--;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Airplane> getAirline() {
        return airline;
    }

    public void setAirline(ArrayList<Airplane> airline) {
        this.airline = airline;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Airline airline1 = (Airline) o;
        return capacity == airline1.capacity &&
                name.equals(airline1.name) &&
                airline.equals(airline1.airline);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, airline, capacity);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " {" +
                "\n name = '" + name + '\'' +
                ",\n airplanes = " + airline +
                ",\n capacity = " + capacity +
                "\n}";
    }
}
