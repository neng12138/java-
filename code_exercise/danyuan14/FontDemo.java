package java_code.danyuan14;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class FontDemo extends Application {

  public static void main(String[] args) {
    launch(args);
  }

  @Override
  public void start(Stage primaryStage) {
    StackPane pane = new StackPane();
//    Pane pane = new Pane();

    Circle circle = new Circle(50);
    circle.setStroke(Color.BLACK);
    //  常 用 设 置 颜 色 的 方 法
    circle.setFill(new Color(0.5,0.5,0.5,0.1));
//    circle.setFill(Color.color(0.5,0.5,0.5,0.5));
//    circle.setFill(Color.rgb(50,50,50,0.5));
//    circle.setFill(Color.RED);

    pane.getChildren().add(circle);

    Label label = new Label("JavaFx");
//    label.setFont(new Font("Times New Roman", 20));
    label.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC,20));
    //  FontWeight.BOLD ->  粗体
    //  FontPosture.ITALIC ->  斜体

    pane.getChildren().add(label);


//    circle.centerXProperty().bind(pane.widthProperty().divide(2));
//    circle.centerYProperty().bind(pane.heightProperty().divide(2));


//   Create a scene and place it in the stage
    Scene scene = new Scene(pane,400,200);
    primaryStage.setTitle("Title");
    primaryStage.setScene(scene);
    primaryStage.show();

  }
}
