package controller;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import model.CarDatabase;
import model.Vehicle;

import java.util.ArrayList;

public class MainController {
    //Variables
    private CarDatabase carDatabase = new CarDatabase();
    @FXML TextField txtf_input = new TextField();
    @FXML TextArea txta_results = new TextArea();

    //Methods
    @FXML public void hdl_getButton(Event event) {
        //gets the pressed button
        Object obj = event.getSource();
        Button btn_clicked = (Button)obj;
        String searchMethod = btn_clicked.getText();

        //gets the licence plate that is searched for
        String inputLicencePlate = txtf_input.getText();

        //results
        ArrayList<Vehicle> foundVehicles;

        //checks if the textfield contents text
        if (!txtf_input.getText().equals("")) {
            //checks whether it is an exact search or not
            if (searchMethod.equals("Search Exact ..."))
                foundVehicles = carDatabase.search(inputLicencePlate, true);
            else
                foundVehicles = carDatabase.search(inputLicencePlate, false);

            //prints out the results
            StringBuilder sb = new StringBuilder();
            for (Vehicle v : foundVehicles)
                sb.append(v.toString());
            txta_results.setText(sb.toString());
        } else
            txta_results.setText("Please enter the licence plate of the vehicle you are looking for!");
    }
}
