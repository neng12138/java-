package java_code.danyuan14;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class ButtonInpane extends Application {

  public static void main(String[] args) {
    launch(args);
  }

  @Override
  public void start(Stage primaryStage) {
    //   Create a scene and place a button in the scene
    StackPane pane = new StackPane();

    pane.getChildren().add(new Button("OK"));           // getChildren().add 或  getChildren().addAll()


    //  Create a scene and place it in the stage
    Scene scene = new Scene(pane,400,200);
    primaryStage.setTitle("Button in a pane");
    primaryStage.setScene(scene);
    primaryStage.show();

  }
}
