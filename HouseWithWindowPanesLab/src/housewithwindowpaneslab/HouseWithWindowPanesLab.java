/* https://github.com/theta148/Lab06-MihirPatel
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package housewithwindowpaneslab;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 *
 * @author 6316704
 */
public class HouseWithWindowPanesLab extends Application{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        launch(args);
    }
    
    @Override
    public void start(Stage stage) {
        Rectangle house = new Rectangle(250, 200);
        house.setStroke(Color.BLACK);
        house.setFill(Color.LIGHTGRAY);
        house.setX(120);
        house.setY(220);
        
        Polygon roof = new Polygon(245, 120,
                                   120, 220,
                                   370, 220);
        roof.setFill(Color.RED);
        
        Rectangle base = new Rectangle(250, 10);
        base.setFill(Color.BEIGE);
        base.setX(120);
        base.setY(420);
        
        Rectangle window1 = new Rectangle(50, 50);
        window1.setFill(Color.LIGHTBLUE);
        window1.setX(140);
        window1.setY(250);
        
        Rectangle window2 = new Rectangle(50, 50);
        window2.setFill(Color.LIGHTBLUE);
        window2.setX(300);
        window2.setY(250);
        
        Rectangle door = new Rectangle(50, 80);
        door.setFill(Color.MAROON);
        door.setX(210);
        door.setY(340);
        
        Rectangle chimney = new Rectangle(20, 80);
        chimney.setFill(Color.GRAY);
        chimney.setX(220);
        chimney.setY(140);
        
        Rectangle grass = new Rectangle(500, 80);
        grass.setFill(Color.GREEN);
        grass.setX(0);
        grass.setY(420);
        
        Circle sun = new Circle();
        sun.setFill(Color.YELLOW);
        sun.setCenterX(450);
        sun.setCenterY(50);
        sun.setRadius(35);
        
        Pane root = new Pane(house, grass, base, roof, window1, window2, door, chimney, sun);
        
        Scene scene = new Scene(root, 500, 500);
        stage.setScene(scene);
        stage.setTitle("House with Windows");
        stage.show();
    }
}
