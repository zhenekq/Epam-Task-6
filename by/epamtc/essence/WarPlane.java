package by.epamtc.essence;

import java.util.Objects;

public class WarPlane extends Airplane {
    final int DEFAULT_AMOUNT_OF_GUNS = 2;
    private int amountOfGuns = DEFAULT_AMOUNT_OF_GUNS;

    public WarPlane() {
        this.type = "WarPlane";
    }

    public WarPlane(int amountOfGuns) {
        this.amountOfGuns = amountOfGuns;
        this.setName("War Airplane");
        this.type = "WarPlane";
    }

    public WarPlane(String name, int fuel, String company, int liftingCapacity, int amountOfGuns) {
        super(name, fuel, company, liftingCapacity);
        this.amountOfGuns = amountOfGuns;
        this.type = "WarPlane";
    }

    public int getAmountOfGuns() {
        return amountOfGuns;
    }

    public void setAmountOfGuns(int amountOfGuns) {
        this.amountOfGuns = amountOfGuns;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        WarPlane warPlane = (WarPlane) o;
        return amountOfGuns == warPlane.amountOfGuns;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), amountOfGuns);
    }

    @Override
    public String getCompany() {
        return this.company;
    }

    @Override
    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public void setName(String name) {
        this.type = name;
    }

    @Override
    public int getFuel() {
        return this.fuel;
    }

    @Override
    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    @Override
    public int getLiftingCapacity() {
        return this.liftingCapacity;
    }

    @Override
    public void setLiftingCapacity(int liftingCapacity) {
        this.liftingCapacity = liftingCapacity;
    }

    @Override
    public String getName() {
        return this.type;
    }

    public String toString() {
        return "WarPlane {" +
                "type='" + type + '\'' +
                ", fuel=" + fuel +
                ", company='" + company + '\'' +
                ", liftingCapacity=" + liftingCapacity +
                ", amountOfGuns=" + amountOfGuns +
                "}\n\t\t\t";
    }
}
