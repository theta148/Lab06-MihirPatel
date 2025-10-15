/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javafxdemo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 *
 * @author 6316704
 */
public class JavaFXDemo extends Application{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        launch(args);
    }
    
    @Override
    public void start(Stage stage) {
        final double SCENE_WIDTH = 520.0;
        final double SCENE_LENGTH = 520.0;
        
        final int X1 = 10, Y1 = 10;
        final int X2 = 60, Y2 = 60;
        final int X3 = 110, Y3 = 110;
        
        final int WIDTH1 = 500, LENGTH1 = 500; 
        final int WIDTH2 = 400, LENGTH2 = 400;
        final int WIDTH3 = 300, LENGTH3 = 300;
        
        final int CENTER_X = 260, CENTER_Y = 260, RADIUS = 150;
        
        Rectangle sq1 = new Rectangle(WIDTH1, LENGTH1);
        sq1.setStroke(Color.BLACK);
        sq1.setFill(null);
        sq1.setX(X1);
        sq1.setY(Y1);
        
        Rectangle sq2 = new Rectangle(WIDTH2, LENGTH2);
        sq2.setStroke(Color.BLACK);
        sq2.setFill(null);
        sq2.setX(X2);
        sq2.setY(Y2);
        
        Rectangle sq3 = new Rectangle(WIDTH3, LENGTH3);
        sq3.setStroke(Color.BLACK);
        sq3.setFill(null);
        sq3.setX(X3);
        sq3.setY(Y3);
        
        Line line1 = new Line();
        line1.setStartX(X1);
        line1.setStartY(Y1);
        line1.setEndX(X2);
        line1.setEndY(Y2);
        
        Line line2 = new Line();
        Line line3 = new Line();
        Line line4 = new Line();
        
        Circle c = new Circle();
        c.setRadius(RADIUS);
        c.setCenterX(CENTER_X);
        c.setCenterY(CENTER_Y);
        c.setFill(Color.BLACK);
        
        Pane root = new Pane(sq1, sq2, sq3, c);
        
        Scene scene = new Scene(root, 520, 520);
        
        stage.setScene(scene);
        stage.setTitle("j");
        stage.show();
    }
}
