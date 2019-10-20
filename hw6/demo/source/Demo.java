/**
 * Quang Nguyen
 * Java Gui
 * HW 6
 */

package code;
/*
 import library packages
 */

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
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import static java.lang.Math.*;
import javafx.geometry.Insets;


/**
 *
 * @author Chaman Sabharwal
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

    
    public void start(Stage stage) {
       
       // root.getChildren().addAll(pane1,button1,button2,button3);//first panne the controls
        root = createFrontPage();
        scene= new Scene(root,700,600,Color.GRAY);
        stage.setTitle("Problem DEMO");
        stage.setScene(scene);
        stage.show();
    }
    
    Text t1,t2,t3,t4,t5,t6,t7;
    Button button1,button2,button3;
    Image image;
    ImageView imageView1,  imageView2 , imageView3, imageView4, imageView5;
    
    public void createImageViews()
    {
        image = new Image("images/gumball.jpg");
        double w= image.getWidth(); double h=image.getHeight();
        imageView1 =new ImageView(image);
        
        double x=w/3,y=h/3,wR,hR,theta=PI/4, diffW,diffH;//use Math.toRadians(angleDegrees)
        wR=x*cos(theta)-y*sin(theta); hR=y*cos(theta)+x*sin(theta);
        diffW=abs(x-wR);diffH=abs(y-hR);
        double minValue =min(diffH,diffW);
        
        imageView2 = new ImageView(image);
        imageView2.setFitHeight(h/2);
        imageView2.setFitWidth(w/2);
        imageView2.setLayoutX(w);imageView2.setLayoutY(0);

        imageView3 = new ImageView(image);
        imageView3.setRotate(45);
        imageView3.setFitHeight(h/3);
        imageView3.setFitWidth(w/3);
        imageView3.setLayoutX(w+minValue);imageView3.setLayoutY(h/2+minValue);
        // Because of different values of w and h, the following does not come out looking right
      //  imageView3.setLayoutX(w+diffH);imageView3.setLayoutY(h/2+diffH);
    }


    public Pane createFrontPage()
    {             
        t2 = new Text(10, 80, "This is a test");
        t2.setFont(new Font(20));
        t2.setFill(Color.RED);
        t2.setWrappingWidth(500);
        t2.setTextAlignment(TextAlignment.CENTER);
        t2.setText("Demonstration of HW6 for\nJava, GUI and Visualization: CS5405");
        
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
                      "Write a program with three buttons\n\n • Button1 action: displays pane with course information, your name on color and some font, and relevant information in different color and different font, as shown in the class.\n\n• Button2 action: Give description of assignment, cover page.\n\n• Button3 action: Use your own picture, display it in the center of pane, scale, rotate and display four different variations of your picture in four corners of the display pane. Sample demos from class may be used to understand how to do it.\n\nDemo codes are in the handouts and demos folder.\n\nFor your reference, demo of a different assignment on the same line looks like");
        t7.setFont(new Font(20));
        t7.setFill(Color.BLUE);
        t7.setWrappingWidth(600);
        t7.setTextAlignment(TextAlignment.JUSTIFY);
        
        image = new Image("images/gumball.jpg");
        double w= image.getWidth(); double h=image.getHeight();
        imageView1 =new ImageView(image);
        imageView1.setLayoutX(200);imageView1.setLayoutY(75);
        
        double x=w/3,y=h/3,wR,hR,theta=PI/4, diffW,diffH;//use Math.toRadians(angleDegrees)
        wR=x*cos(theta)-y*sin(theta); hR=y*cos(theta)+x*sin(theta);
        diffW=abs(x-wR);diffH=abs(y-hR);
        double minValue =min(diffH,diffW);
        
        imageView2 = new ImageView(image);
        imageView2.setRotate(72);
        imageView2.setFitHeight(h/2);
        imageView2.setFitWidth(w/2);
        imageView2.setLayoutX(0);imageView2.setLayoutY(0);

        imageView3 = new ImageView(image);
        imageView3.setRotate(144);
        imageView3.setFitHeight(h/2);
        imageView3.setFitWidth(w/2);
        imageView3.setLayoutX(w+300);
        imageView3.setLayoutY(0);

        imageView4 = new ImageView(image);
        imageView4.setRotate(288);
        imageView4.setFitHeight(h/2);
        imageView4.setFitWidth(w/2);
        imageView4.setLayoutX(0);
        imageView4.setLayoutY(h+75);

        imageView5 = new ImageView(image);
        imageView5.setRotate(216);
        imageView5.setFitHeight(h/2);
        imageView5.setFitWidth(w/2);
        imageView5.setLayoutX(w+300);
        imageView5.setLayoutY(h+75);

       //
        pane1.getChildren().addAll(t2,t3,t4,t5);
        pane2.getChildren().addAll(t7);
        pane3.getChildren().addAll(imageView1, imageView2, imageView3, imageView4, imageView5);
        pane4.getChildren().addAll(pane1);
        
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
