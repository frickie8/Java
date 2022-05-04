/**
 * @author vashishth
 * CIS-2571
 * 05/01/2022
 * Random 0 and 1
 * This program displays random 0 and 1 in 10x10 matrix.
 */

package random0and1;

import javafx.application.Application ;
import javafx.geometry.Pos;
import javafx.scene.Scene ;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage ;

public class Random0and1 extends Application {

    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) {
        
        int noOfCols = 10;
        int noOfRows = 10;
        int cellSpacing = 5; // gap between two text box
        int cellSize = 30;   // width and height are same
        
        // Create a pane and set its properties
        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER); // Set center alignment
        pane.setHgap(cellSpacing);     // Set hGap to 5px
        pane.setVgap(cellSpacing);     // Set vGap to 5px

        for(int i = 0; i < noOfRows; i++){
            for(int j = 0; j < noOfCols; j++){
                // Randomly generating 0 or 1
                String strValue = Integer.toString((int) (Math.random() + 0.5));
                
                // creating the textfield and setting the width
                TextField text = new TextField(strValue);
                text.setAlignment(Pos.CENTER);
                text.setPrefWidth(cellSize);
                text.setPrefHeight(cellSize);
                
                // Place nodes in the pane
                pane.add(text, j, i);
            }
        }
           
        int windowSize = (cellSize * noOfCols) + ((noOfCols + 1) * cellSpacing);
        
        Scene scene = new Scene(pane,windowSize,windowSize);
        primaryStage.setTitle("Random 0 or 1"); // Set the stage title
        primaryStage.setScene(scene);           // Place the scene in the stage
        primaryStage.show();                    // Display the stage
    }

    /**
     * The main method is only needed for the IDE with limited JavaFX
     * support.Not needed for running from the command line.
     * @param args
     */
    public static void main(String[] args) {
        launch(args);
    }
}
