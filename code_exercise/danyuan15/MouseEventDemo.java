package java_code.danyuan15;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class MouseEventDemo extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        //  Create a pane and set its properties
        Pane pane = new Pane();
        Text text = new Text(20,20,"Programming is fun");
        text.setFont(Font.font(20));
        text.setFill(Color.RED);
        pane.getChildren().add(text);

        text.setOnMouseDragged(e -> {           //   鼠 标 拖 拽 （ lambda表达式 ）
            text.setX(e.getX());
            text.setY(e.getY());
        });

        //  Create a scene and place it in the stage
        Scene scene = new Scene(pane,400,300);
        primaryStage.setTitle("Title");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
