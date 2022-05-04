/**
 * @author vashishth
 * CIS-2571
 * 05/03/2022
 * BMI Calculator
 * This program displays BMI of the person.
 */

package bmi_calculator;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.geometry.HPos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class BMI_Calculator extends Application {

    private TextField tfWeight = new TextField();
    private TextField tfHeight = new TextField();
    private TextField tfBMI = new TextField();
    private TextField tfBMIStatus = new TextField();
    private Button btnCalculate = new Button("Calculate");

    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) {
        // Create UI
        GridPane gridPane = new GridPane();
        gridPane.setHgap(5);
        gridPane.setVgap(5);
        gridPane.add(new Label("Weight (in pounds):"), 0, 0);
        gridPane.add(tfWeight, 1, 0);
        gridPane.add(new Label("Height (in inches):"), 0, 1);
        gridPane.add(tfHeight, 1, 1);
        gridPane.add(new Label("Body Mass Index (BMI):"), 0, 2);
        gridPane.add(tfBMI, 1, 2);
        gridPane.add(new Label("BMI Status:"), 0, 3);
        gridPane.add(tfBMIStatus, 1, 3);
        gridPane.add(btnCalculate, 1, 4);

        // Set properties for UI
        gridPane.setAlignment(Pos.CENTER);
        tfWeight.setAlignment(Pos.BOTTOM_RIGHT);
        tfHeight.setAlignment(Pos.BOTTOM_RIGHT);
        tfBMI.setAlignment(Pos.BOTTOM_RIGHT);
        tfBMIStatus.setAlignment(Pos.BOTTOM_RIGHT);
        tfBMI.setEditable(false);
        tfBMIStatus.setEditable(false);
        GridPane.setHalignment(btnCalculate, HPos.RIGHT);

        // Process events
        btnCalculate.setOnAction(e -> calculateBMIPayment());

        // Create a scene and place it in the stage
        Scene scene = new Scene(gridPane, 350, 200);
        primaryStage.setTitle("BMI Calculator"); // Set title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage
    }

    private void calculateBMIPayment() {
        // Get values from text fields
        double weight = Double.parseDouble(tfWeight.getText());
        double height = Double.parseDouble(tfHeight.getText());

        // Create a BMI object
        BMI bmi = new BMI("", weight, height);

        // Display BMI and BMI status
        tfBMI.setText(String.format("%.2f", bmi.getBMI()));
        tfBMIStatus.setText(String.format(bmi.getStatus()));
    }

    /**
     * The main method is only needed for the IDE with limited JavaFX support.
     * Not needed for running from the command line.
     */
    public static void main(String[] args) {
        launch(args);
    }
}
