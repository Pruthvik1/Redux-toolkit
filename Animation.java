/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animation;

import java.awt.Rectangle;
import java.util.Collection;
import javafx.animation.RotateTransition;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import static javafx.scene.paint.Color.*;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 *
 * @author HP
 */
public class Animation extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button();
        
        
        Rectangle r1;
        r1 = new Rectangle(120,100,200,100);
        r1.setFrame(10,10, 10, 10);
        
      
        RotateTransition rt=new RotateTransition();
        rt.setDelay(Duration.millis(1000));
        
        rt.setNode(r1);
        rt.setByAngle(120);
        rt.setCycleCount(50);
        rt.setAutoReverse(true);
        rt.play();
        Group root =new Group((Collection<Node>) r1);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
