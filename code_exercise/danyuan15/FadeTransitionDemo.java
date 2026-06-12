package java_code.danyuan15;

import javafx.animation.FadeTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.stage.Stage;
import javafx.util.Duration;

public class FadeTransitionDemo extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        //  Place an ellipse to the pane
        Pane pane = new Pane();
        Ellipse ellipse = new Ellipse(10,10,100,50);   // 椭圆
        ellipse.setFill(Color.RED);
        ellipse.setStroke(Color.BLACK);
        ellipse.centerXProperty().bind(pane.widthProperty().divide(2));
        ellipse.centerYProperty().bind(pane.heightProperty().divide(2));
        ellipse.radiusXProperty().bind(pane.widthProperty().multiply(0.4));
        ellipse.radiusYProperty().bind(pane.heightProperty().multiply(0.4));
        pane.getChildren().add(ellipse);


        //  Apply a fade transition to ellipse
        FadeTransition fadeTransition = new FadeTransition(Duration.millis(3000),ellipse);
//        fadeTransition.setDuration(Duration.millis(3000));
//        fadeTransition.setNode(ellipse);
        fadeTransition.setFromValue(1.0);
        fadeTransition.setToValue(0.1);
        fadeTransition.setCycleCount(Timeline.INDEFINITE);
        fadeTransition.setAutoReverse(true);
        fadeTransition.play();    //  Start animation

        //  Control animation
        ellipse.setOnMousePressed(e -> fadeTransition.pause());
        ellipse.setOnMouseReleased(e -> fadeTransition.play());

        //  Create a scene and place it in the stage
        Scene scene = new Scene(pane,400,200);
        primaryStage.setTitle("FadeTransition");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}


/*
                FadeTransition  :   淡出 （Animation的子类）

                        ->  setNode()  :  设 置 目 标 节 点
                        ->  setDuration()  :  设 置 淡 化 的 持 续 时 间
                        ->  setFromValue()  :  开 始 的 不 透 明 度
                        ->  setToValue()  :  最 终 的 不 透 明 度
                        ->  setByValue()  :  不 透 明 度 增 值 量
 */

