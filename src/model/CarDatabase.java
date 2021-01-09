package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CarDatabase {
    //Variables
    HashMap<String, Vehicle> db = new HashMap<>();
    MagicGenerator mgcGenerator = new MagicGenerator();
    
    //Constructor
    public CarDatabase() {
        initDataBase();
    }

    //Methods
    public void initDataBase() {
        for (int i = 0; i < 1000; i++) {
            String manufacturer = mgcGenerator.getRandomManufacturer();
            String licensePlate = mgcGenerator.getRandomLicencePlate().toUpperCase();
            Vehicle vehicle = new Vehicle(mgcGenerator.getRandomColor(), mgcGenerator.getRandomName(), manufacturer, mgcGenerator.getRandomModel(manufacturer), licensePlate);

            //add vehicle in the database (HashMap) --> key = licensePlate, value = vehicle
            db.put(licensePlate, vehicle);

            //print out all the generated vehicles
            System.out.println("Created vehicle with license plate " + licensePlate);
        }
    }

    public ArrayList<Vehicle> search(String input, boolean exact) {
        //tracks the start time of this search
        long startTime = System.nanoTime();

        ArrayList<Vehicle> results = new ArrayList<>();
        //checks whether it is an exact search or not
        if (exact) {
            //checks it the vehicle with the given license plate exists
            if(db.get(input.toUpperCase()) != null)
                results.add(db.get(input.toUpperCase()));
        } else {
            for (Map.Entry<String, Vehicle> v : db.entrySet()) {
                if(v.getKey().contains(input.toUpperCase()))
                    results.add(v.getValue());

            }
        }

        //tracks the end time of this search
        long endTime = System.nanoTime();
        //gets the duration for the search
        double duration = endTime - startTime;
        //turns the duration from nanoseconds into milliseconds
        duration /= 1000000;
        //prints out the duration of the search and the type of search
        if (exact)
            System.out.println("Search took: " + duration + "ms (exact)");
        else
            System.out.println("Search took: " + duration + "ms (pattern search)");

        return results;
    }
}
















