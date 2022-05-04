/**
 * @author vashishth
 * CIS-2571
 * 05/03/2022
 * Rotate Rectangle
 * This program rotates the rectangle according the button clicked.
 */

package rotaterectangle;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class RotateRectangle extends Application {
    
    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) {
        
        // Create a pane and rectangles 
        Pane pane = new Pane(); 
        Rectangle rectangle = new Rectangle();
        
        // binding the rectangle with panes
        rectangle.widthProperty().bind(pane.widthProperty().divide(8));
        rectangle.heightProperty().bind(pane.heightProperty().divide(4));
        
        // setting the color and borders of the rectangle
        rectangle.setStroke(Color.BLACK);
        rectangle.setFill(new Color(0.4314,0.6078,0.6275,1));
        // positions the rectangle in the center of the pane
        rectangle.xProperty().bind(pane.widthProperty().divide(2).subtract(
                rectangle.widthProperty().divide(2)));
        rectangle.yProperty().bind(pane.heightProperty().divide(2).subtract(
                rectangle.widthProperty().divide(2)));
        pane.getChildren().add(rectangle);

        // creating the buttons and initializing them in HBox
        Button btnLeft = new Button("Rotate Left");
        Button btnRight = new Button("Rotate Right");
        HBox hBox = new HBox(btnLeft, btnRight);
        hBox.setSpacing(10);
        hBox.setAlignment(Pos.CENTER);
        
        BorderPane borderPane = new BorderPane(pane);
        borderPane.setBottom(hBox);
        
        // rotating rectangle counterclockwise
        btnLeft.setOnAction((ActionEvent e) -> {
            rectangle.setRotate(rectangle.getRotate()-15);
        } // Override the handle method
        );

        // rotating rectangle clockwise
        btnRight.setOnAction((ActionEvent e) -> {
            rectangle.setRotate(rectangle.getRotate()+15);
        } // Override the handle method
        );

        // Create a scene and place the pane in the stage
        Scene scene = new Scene(borderPane,400,400);
        primaryStage.setTitle("Rotate Rectangle"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage
    }

    /**
     * The main method is only needed for the IDE with limited JavaFX support.
     * Not needed for running from the command line.
     * @param args
     */
    public static void main(String[] args) {
        launch(args);
    }
}