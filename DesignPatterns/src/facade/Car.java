package facade;

public class Car {
    private String type;
    private String color;
    private int numberOfDoors;
    private String city;
    private String address;

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumberOfDoors() {
        return this.numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return String.format("Car type: %s%nCar color: %s%nNumber of doors: %d%nManufactured in: %s%nAddress: %s%n",
                this.getType(), this.getColor(), this.getNumberOfDoors(), this.getCity(), this.getAddress());
    }
}
