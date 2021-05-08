package by.epamtc.essence;

import java.util.Objects;

public class PassengerPlane extends Airplane {

    private int amountOfPassengers;

    public PassengerPlane() {this.type = "PassengerPlane";}

    public PassengerPlane(String type, int fuel, String company, int liftingCapacity, int amountOfPassengers) {
        super(type, fuel, company, liftingCapacity);
        this.amountOfPassengers = amountOfPassengers;
        this.type = "PassengerPlane";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PassengerPlane that = (PassengerPlane) o;
        return amountOfPassengers == that.amountOfPassengers;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), amountOfPassengers);
    }

    @Override
    public String toString() {
        return "PassengerPlane {" +
                ", type='" + type + '\'' +
                ", fuel=" + fuel +
                ", company='" + company + '\'' +
                ", liftingCapacity=" + liftingCapacity +
                ", amountOfPassengers=" + amountOfPassengers +
                "}\n\t\t";
    }
}
