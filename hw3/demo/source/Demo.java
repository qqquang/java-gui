//Quang Nguyen
//Java Gui
//HW 3

package code;

import javafx.scene.layout.*;// Pane, StackPane etc
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.application.Application;
// Other Nodes
import javafx.scene.control.Label;
import javafx.scene.shape.Circle;
import javafx.scene.paint.Color;

public class Demo extends Application{
    StackPane root;
    @Override

    public void start(Stage stage){
        root = new StackPane();
        createCircle();

        Scene scene = new Scene(root, 200, 200);
        stage.setScene(scene);
        stage.show();
    }

    public Circle createCircle(){
        Circle circle = new Circle();
        circle.setCenterX(100);
        circle.setCenterY(100);
        circle.setRadius(50);
        circle.setStroke(Color.BLACK);
        circle.setFill(Color.BLACK);
        Label label= new Label("Quang Nguyen");
        label.setTextFill(Color.WHITE);
        root.getChildren().addAll(circle,label);
        return circle;
    }

    public static void main(String[] args){
        launch(args);
    }
    
}