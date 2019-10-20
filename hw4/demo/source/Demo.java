//Quang Nguyen
//Java Gui
//HW 4

package code;

import javafx.scene.layout.*;// Pane, StackPane etc
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.application.Application;
// Other Nodes
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.text.TextAlignment;

public class Demo extends Application{
    Pane root;
    @Override

    public void start(Stage stage){
        root = new VBox();
        createTextField();

        //createCircle();
        Scene scene = new Scene(root, 600, 600);
        stage.setScene(scene);
        stage.show();
        stage.setTitle("TextField by Quang Nguyen");
    }

    Label label0, label1;
    TextField tField;

    public void createTextField(){
        tField = new TextField("Welcome to the Demo of shapes by Quang Nguyen");
        tField.setOnAction(ActionEvent->{
            String str = tField.getText();
            if(str.charAt(0) == 'C' || str.charAt(0) == 'c'){
                root.getChildren().clear();
                createCircle();
            }else if(str.charAt(0) == 'R' || str.charAt(0) == 'r'){
                root.getChildren().clear();
                createRectangle();
            }
            tField.setText( "Welcome to the Demo of shapes by Quang Nguyen" );  // clear data entry field
        });
        root.getChildren().addAll(tField);
    }

    public Circle createCircle(){
        Circle circle = new Circle();
        circle.setCenterX(100.0f);
        circle.setCenterY(100.0f);
        circle.setRadius(50.0f);
        circle.setStroke(Color.BLUE);
        circle.setFill(Color.CYAN);
        Label label= new Label("Quang Nguyen");
        label.setTextFill(Color.BLACK);
        root.getChildren().addAll(tField,circle,label);
        return circle;
    }

    public Rectangle createRectangle(){
        Rectangle rectangle = new Rectangle();
        rectangle.setX(600);
        rectangle.setY(200);
        rectangle.setWidth(200);
        rectangle.setHeight(100);
        rectangle.setStroke(Color.BLUE);
        rectangle.setFill(Color.CYAN);
        Label label= new Label("Quang Nguyen");
        label.setTextFill(Color.BLACK);
        root.getChildren().addAll(tField, rectangle,label);
        return rectangle;
    }

    public static void main(String[] args){
        Application.launch(args);
    }
    
}