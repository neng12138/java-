package java_code.danyuan14;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.stage.Stage;

public class ShowEllipse extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        //  Create a pane
        Pane pane = new StackPane();

        //  Create an ellipse and add it to pane
        for (int i = 0; i < 16; i++) {

            Ellipse ellipse = new Ellipse(250,200,150,100);     // 椭 圆
            ellipse.setStroke(Color.color(Math.random(),Math.random(),Math.random()));
            ellipse.setFill(Color.WHITE);
            ellipse.setRotate(i*180/16);

            pane.getChildren().add(ellipse);

            //  属 性 绑 定
            ellipse.centerXProperty().bind(pane.widthProperty());
            ellipse.centerYProperty().bind(pane.heightProperty());

        }

        //  Create a scene and place it in the stage
        Scene scene = new Scene(pane,600,400);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Title");
        primaryStage.show();

    }
}
