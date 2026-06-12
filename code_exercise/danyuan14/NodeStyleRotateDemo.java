package java_code.danyuan14;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Border;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;



public class NodeStyleRotateDemo extends Application {

  public static void main(String[] args) {
    launch(args);
  }

  @Override
  public void start(Stage primaryStage) {

    StackPane pane = new StackPane();
    Button button = new Button("OK");

    button.setFont(new Font(20));
    button.setTextFill(Color.RED);
    button.setRotate(45);

    pane.getChildren().add(button);

//    pane.setBackground(new Background(new BackgroundFill(Color.AQUA,null,null)));
//    css 样式： （层叠样式表）
    pane.setStyle("-fx-border-color:red; -fx-background-color: lightgray; -fx-rotate: 45");


    // Create a scene and place it in the stage
    Scene scene = new Scene(pane,400,200);
    primaryStage.setScene(scene);
    primaryStage.setTitle("Title");
    primaryStage.show();

  }
}
