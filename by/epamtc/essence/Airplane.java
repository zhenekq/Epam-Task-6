package by.epamtc.essence;

import java.util.Objects;

public class Airplane {

    final int DEFAULT_AMOUNT_OF_FUEL_LITERS = 125_000;
    final String DEFAULT_NAME_OF_AIRPLANE = "Airplane";
    final int DEFAULT_LIFTING_CAPACITY_KG = 120_000;

    protected String type;
    protected int fuel;
    protected String company;
    protected int liftingCapacity;

    public Airplane(){
        type = DEFAULT_NAME_OF_AIRPLANE;
        fuel = DEFAULT_AMOUNT_OF_FUEL_LITERS;
        liftingCapacity = DEFAULT_LIFTING_CAPACITY_KG;
    }

    public Airplane(String name, int fuel, int liftingCapacity) {
        this.type = name;
        this.fuel = fuel;
        this.liftingCapacity = liftingCapacity;
    }

    public Airplane(String name, int fuel, String company, int liftingCapacity) {
        this.type = name;
        this.fuel = fuel;
        this.company = company;
        this.liftingCapacity = liftingCapacity;
    }

    public String getCompany(){
        return company;
    }

    void setCompany(String company){
        this.company = company;
    }


    public void setName(String name){
        this.type = name;
    }

    public void changeAirline(Airline airlineFrom, Airline airlineTo) {
        airlineFrom.removeAirplane(this);
        airlineTo.addAirplane(this);
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public int getLiftingCapacity() {
        return liftingCapacity;
    }

    public void setLiftingCapacity(int liftingCapacity) {
        this.liftingCapacity = liftingCapacity;
    }


    public String getName() {
        return type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Airplane airplane = (Airplane) o;
        return fuel == airplane.fuel &&
                liftingCapacity == airplane.liftingCapacity &&
                type.equals(airplane.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), type, fuel, liftingCapacity);
    }

    @Override
    public String toString() {
        return " Airplane {" +
                "type = " + type  +
                ", company = " + company +
                ", fuel = " + fuel +
                ", liftingCapacity = " + liftingCapacity +
                "}\n\t\t";
    }
}
