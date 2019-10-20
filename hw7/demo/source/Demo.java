/**
 * Quang Nguyen
 * Java Gui
 * HW 7
 */

package code;
/*
 import library packages
 */
import java.util.*;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.control.Button;
import javafx.application.Application;
//actions items
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
//paint and othe useful classes
import javafx.scene.paint.Color;
import javafx.scene.text.*;//Font,FontWeight,FontPosture,TextAlignment

import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;

import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;

import javafx.geometry.Orientation;
import javafx.scene.control.Slider;

import static java.lang.Math.*;
import javafx.geometry.Insets;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

import javafx.scene.shape.Circle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
/**
 *
 * @author Quang Nguyen
 */

public class Demo extends Application {
       /** create layouts*/
       // Panes 
    Pane pane1 = new Pane();
    Pane pane2 = new Pane();
    Pane pane3 = new Pane();
    Pane pane4 = new Pane();
    Pane root = new Pane();
    Scene scene;
    Stage stage;

    Text t1,t2,t3,t4,t5,t6,t7;
    Button button1,button2,button3;
    Slider slHorizontal;
    Arc arc1;
    Circle circle;

    public void start(Stage stage) {
       
       // root.getChildren().addAll(pane1,button1,button2,button3);//first panne the controls
        root = createFrontPage();
        scene= new Scene(root,700,600,Color.GRAY);
        stage.setTitle("Problem DEMO");
        stage.setScene(scene);
        stage.show();
    }
    


    public void addArc(double numArc, Slider hSlider, Circle cir){


        double splitCircle = 0;
        double nextArcLocation = 0;
        double arcSize = 0;
        pane3.getChildren().clear();
        
        splitCircle = 360/numArc;
        nextArcLocation = 360/numArc;
        arcSize = splitCircle/3;

        pane3.getChildren().addAll(hSlider, cir);

        for(int i = 0; i < numArc; i++){
            Arc arc1 = new Arc(250, 250, 150, 150, splitCircle, arcSize); //Create an arc    
            arc1.setStyle ("-fx-fill:red;-fx-type:round;-fx-stroke-width:5");    
            arc1.setType(ArcType.ROUND);
            pane3.getChildren().addAll(arc1);
            splitCircle += nextArcLocation;
        }
        
    }

    public Pane createFrontPage()
    {   double oldValue = 0;
        double splitCircle = 0;
        double nextArcLocation = 0;
        double arcSize = 0;
        t2 = new Text(10, 80, "This is a test"); 
        t2.setFont(new Font(20));
        t2.setFill(Color.RED);
        t2.setWrappingWidth(500);
        t2.setTextAlignment(TextAlignment.CENTER);
        t2.setText("Demonstration of HW7 for\nJava, GUI and Visualization: CS5405");
        
        t3 = new Text(10, 120, "\nPresented by\n\nQuang Nguyen, \n\nqhnwv8@umsystem.edu\n");
        t3.setFont(new Font(20));
        t3.setFill(Color.GREEN);
        t3.setWrappingWidth(500);
        t3.setTextAlignment(TextAlignment.CENTER);
        
        t4 = new Text(10, 260, "This is my orignal code, No IDE used in the submission.");
        t4.setFont(Font.font("Arial"));
        t4.setFill(Color.BLUE);
        t4.setWrappingWidth(600);
        t4.setTextAlignment(TextAlignment.CENTER);

        t5 = new Text(10, 260, "\nI did not give my code to anyone or I did not use anyone's code in this work. \nLink: url address for reference to specific page and quotation");
        t5.setFont(Font.font("Times New Roman"));
        t5.setFont(new Font(30));
        t5.setFill(Color.PURPLE);
        t5.setWrappingWidth(600);
        t5.setTextAlignment(TextAlignment.CENTER);

        t7 = new Text(10, 40,
                      "Write a program with three buttons\n\n • Button1 action: displays pane with course information, your name on color and some font, and relevant information in different color and different font, as shown in the class.\n\n• Button2 action: Give description of assignment, cover page.\n\n• Button3 action: Create a slider with range 1 to 10. Create  a circle and  read a slider value into an integer n.  Divide the circle into n sectors. Fill 1/3 each sector sector with a color say red, the rest 2/3 sector remains unfilled.\n\nFor your reference, demo of a different assignment on the same line looks like");
        t7.setFont(new Font(20));
        t7.setFill(Color.BLUE);
        t7.setWrappingWidth(600);
        t7.setTextAlignment(TextAlignment.JUSTIFY);
        
        
        slHorizontal = new Slider(1,10,1);
        slHorizontal.setShowTickLabels(true);
        slHorizontal.setShowTickMarks(true);
        slHorizontal.setStyle("-fx-border-color: blue;-fx-border-radius: 4;-fx-border-width: 4;");
        slHorizontal.setMajorTickUnit(1);
        slHorizontal.setBlockIncrement(1);
        slHorizontal.setMinorTickCount(0);
        slHorizontal.setSnapToTicks(true);
        slHorizontal.setMinWidth(500);
        slHorizontal.setValue(1);

        

        Circle circle = new Circle();        
        circle.setCenterX(250);        
        circle.setCenterY(250);        
        circle.setRadius(150);        
        circle.setStroke(Color.BLUE);        
        circle.setFill(Color.TRANSPARENT);
        
        slHorizontal.valueProperty().addListener(ov ->       
        addArc(slHorizontal.getValue(), slHorizontal, circle));

       //
        pane1.getChildren().addAll(t2,t3,t4,t5);
        pane2.getChildren().addAll(t7);
        pane3.getChildren().addAll(slHorizontal, circle);
        pane4.getChildren().addAll(pane1);


        splitCircle = 360/slHorizontal.getValue();
        nextArcLocation = 360/slHorizontal.getValue();
        
        arcSize = splitCircle/3;

        for(int i = 0; i < slHorizontal.getValue(); i++){
            Arc arc1 = new Arc(250, 250, 150, 150, splitCircle, arcSize); //Create an arc    
            arc1.setStyle ("-fx-fill:red;-fx-type:round;-fx-stroke-width:5");    
            arc1.setType(ArcType.ROUND);
            pane3.getChildren().add(arc1);
            splitCircle += nextArcLocation;
        }
        
        pane1.relocate(10,50);
        pane2.relocate(10,50);
        pane3.relocate(10,50);
        pane4.relocate(10,100);
    
        button1 =  new Button("Author");
        button2 =  new Button("Problem");
        button3 =  new Button("ImageDemo");
        
        button1.relocate(100,20);
        button2.relocate(250,20);
        button3.relocate(400,20);
    
       
        root.getChildren().addAll(button1,button2,button3,pane4);

        button1.setOnAction(ae->
{pane4.getChildren().clear();pane4.getChildren().add(pane1);});

        button2.setOnAction(ae->
{pane4.getChildren().clear();pane4.getChildren().add(pane2);});

        button3.setOnAction(ae->{
            pane4.getChildren().clear();
            pane4.getChildren().add(pane3);
        });
        
        return root;
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Application.launch(args);
    }

}
