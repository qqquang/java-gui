/**
 * Quang Nguyen
 * Java Gui
 * HW 5
 */

package code;

// Minimum requirement
import javafx.scene.layout.*;// Pane, StackPane etc
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.application.Application;

// Other properties
import javafx.scene.control.Label;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Circle;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;


public class Demo extends Application {
    
    Pane root;
    Scene scene;
    @Override // Override the start method in the Application class
    public void start(Stage stage) {
        root = new StackPane();  // Create layout for scene
        scene = new Scene(root, 600, 400);    // Create a scene for stage
        createRectangle();   // create rectangle and add it to layout
        stage.setScene(scene); // Place the scene in the stage
        stage.show(); // Display the stage
       //optional
        stage.setTitle("ShowRectangle"); // Set the stage title
        }
    
    public void createRectangle(){
        Rectangle rectangle = new Rectangle();
        rectangle.setX(100);
        rectangle.setY(100);
        rectangle.setWidth(200);
        rectangle.setHeight(100);
        rectangle.setStroke(Color.BLUE);
        rectangle.setStrokeWidth(4);
        rectangle.setFill(Color.WHITE);

        rectangle.widthProperty().bind(scene.widthProperty().divide(2));
        rectangle.heightProperty().bind(scene.heightProperty().divide(2));
        
        Label label= new Label("Quang Nguyen");
        label.setFont(new Font(40));
        label.setTextFill(Color.RED);
        root.getChildren().addAll(rectangle,label);
    }
    /**
     * The main method is only needed for the IDE with limited
     * JavaFX support. Not needed for running from the command line.
     */
    public static void main(String[] args) {
        launch(args);
    }
}