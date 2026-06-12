package java_code.danyuan14;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class ShowCircleCenter extends Application {

  public static void main(String[] args) {
    launch(args);
  }

  @Override
  public void start(Stage primaryStage) {
    Circle circle = new Circle(50);
    circle.setStroke(Color.BLACK);
    circle.setStrokeWidth(3);
    circle.setFill(Color.WHITE);

    Pane pane = new Pane();
    pane.getChildren().add(circle);

    //   属 性 绑 定 （属性值）
    circle.centerXProperty().bind(pane.widthProperty().divide(2));
    circle.centerYProperty().bind(pane.heightProperty().divide(2));


    //  Create a scene and place it in the stage
    Scene scene = new Scene(pane,400,200);
    primaryStage.setTitle("Title");
    primaryStage.setScene(scene);
    primaryStage.show();

  }
}
