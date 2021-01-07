package model;

import java.util.HashMap;

public class CarDatabase {
    //Variables
    HashMap<String, Vehicle> db = new HashMap<>();
    MagicGenerator mgcGenerator = new MagicGenerator();
    
    //Constructor
    public CarDatabase() {
        for (int i = 0; i < 1000; i++) {
            String manufacturer = mgcGenerator.getRandomManufacturer();
            Vehicle vehicle = new Vehicle(mgcGenerator.getRandomColor(), mgcGenerator.getRandomName(), manufacturer, mgcGenerator.getRandomModel(manufacturer), mgcGenerator.getRandomLicencePlate());
        }
    }

    // TODO: 07.01.2021  //Methods
    public Vehicle[] search(String licencePlate, boolean exact) {
        
    }
}
