
package rectanguloid;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Rectanguloid extends Application {
    
    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) {
        
        // Create a pane to hold the rectangle 
        Pane pane = new Pane();
        
        // Create two rectangles 
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle();
        
        // binding the rectangles with panes
        r1.widthProperty().bind(pane.widthProperty().divide(1.33));
        r1.heightProperty().bind(pane.heightProperty().divide(2));
        r2.widthProperty().bind(pane.widthProperty().divide(1.33));
        r2.heightProperty().bind(pane.heightProperty().divide(2));
        
        // setting the position of the rectangles
        r1.setX(15);
        r1.setY(40);
        r2.setX(40);
        r2.setY(15);
        
        // setting the color as transparent and borders to be black
        r1.setStroke(Color.BLACK);
        r1.setFill(new Color(0,0,0,0));
        r2.setStroke(Color.BLACK);
        r2.setFill(new Color(0,0,0,0));
        
        // creating the four lines to connect each vertex of the rectangles
        Line line1 = new Line();
        Line line2 = new Line();
        Line line3 = new Line();
        Line line4 = new Line();

        line1.startXProperty().bind(r1.xProperty());
        line1.startYProperty().bind(r1.yProperty());
        line1.endXProperty().bind(r2.xProperty());
        line1.endYProperty().bind(r2.yProperty());
        
        line2.startXProperty().bind(r1.xProperty());
        line2.startYProperty().bind(r1.yProperty().add(r1.heightProperty()));
        line2.endXProperty().bind(r2.xProperty());
        line2.endYProperty().bind(r2.yProperty().add(r1.heightProperty()));
        
        line3.startXProperty().bind(r1.xProperty().add(r1.widthProperty()));
        line3.startYProperty().bind(r1.yProperty());
        line3.endXProperty().bind(r2.xProperty().add(r1.widthProperty()));
        line3.endYProperty().bind(r2.yProperty());
        
        line4.startXProperty().bind(r1.xProperty().add(r1.widthProperty()));
        line4.startYProperty().bind(r1.yProperty().add(r1.heightProperty()));
        line4.endXProperty().bind(r2.xProperty().add(r1.widthProperty()));
        line4.endYProperty().bind(r2.yProperty().add(r1.heightProperty()));
        
        // setting the color to be black
        line1.setStroke(Color.BLACK);
        line2.setStroke(Color.BLACK);
        line3.setStroke(Color.BLACK);
        line4.setStroke(Color.BLACK);

        // place the rectangles in the pane
        pane.getChildren().addAll(r1,r2,line1,line2,line3,line4);
        
        // Create a scene and place it in the stage
        Scene scene = new Scene(pane, 400, 400);
        primaryStage.setTitle("Rectanguloid");  // Set the stage title
        primaryStage.setScene(scene);           // Place the scene in the stage
        primaryStage.show();                    // Display the stage
    }

    /**
     * The main method is only needed for the IDE with limited JavaFX support.
     * Not needed for running from the command line.
     */
    public static void main(String[] args) {
        launch(args);
    }
}
