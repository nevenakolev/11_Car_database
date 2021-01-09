package model;

public class Vehicle {
    //Variables
    private String color;
    private String owner;
    private String manufacturer;
    private String model;
    private String licensePlate;

    //Constructor
    public Vehicle() {
        //default constructor
    }

    public Vehicle(String clr, String ownr, String manuf, String mdl, String lcnsplt) {
        this.color = clr;
        this.owner = ownr;
        this.manufacturer = manuf;
        this.model = mdl;
        this.licensePlate = lcnsplt;
    }

    //Getter & Setter
    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getOwner() {
        return owner;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    //Methods
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Manufacturer: " + this.manufacturer + "\n");
        sb.append("Model: " + this.model + "\n");
        sb.append("Color: " + this.color + "\n");
        sb.append("License Plate: " + this.licensePlate + "\n");
        sb.append("Owner: " + this.owner + "\n\n");

        return sb.toString();
    }
}
