package java_code.danyuan14;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class ShowCircle extends Application {

  public static void main(String[] args) {
    launch(args);
  }

  @Override
  public void start(Stage primaryStage) {
    Circle circle = new Circle(100,100,50);
//    circle.setCenterX(100);
//    circle.setCenterY(100);
//    circle.setRadius(50);
    circle.setStroke(Color.BLACK);
    circle.setStrokeWidth(5);
    circle.setFill(Color.WHITE);

    Pane pane = new Pane();
    pane.getChildren().add(circle);

    //  Create a scene and place it in the stage
    Scene scene = new Scene(pane,400,200);
    primaryStage.setScene(scene);
    primaryStage.setTitle("Title");
    primaryStage.show();

  }
}
