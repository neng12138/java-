package java_code.danyuan15;

import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class PathTransitionDemo extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        //  Create a pane
        Pane pane = new Pane();

        //  Create a rectangle
        Rectangle rectangle = new Rectangle(0,0,25,50);
        rectangle.setFill(Color.ORANGE);

        //  Create a circle
        Circle circle = new Circle(125,100,50);
        circle.setFill(Color.WHITE);
        circle.setStroke(Color.BLACK);

        //  Add circle and rectangle to the pane
        pane.getChildren().add(circle);
        pane.getChildren().add(rectangle);


        //  Create a path transition
        PathTransition pathTransition = new PathTransition(Duration.millis(4000),circle,rectangle);
//        pathTransition.setDuration(Duration.millis(4000));
//        pathTransition.setPath(circle);
//        pathTransition.setNode(rectangle);
        pathTransition.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);   //  自 动 翻 转
        pathTransition.setCycleCount(Timeline.INDEFINITE);
        pathTransition.setAutoReverse(true);
        pathTransition.play();       //  Start animation

        //  Set HandleEvent
        circle.setOnMousePressed(event -> pathTransition.pause());
        circle.setOnMouseReleased(event -> pathTransition.play());

        //  Create a scene and place it in the stage
        Scene scene = new Scene(pane,400,200);
        primaryStage.setScene(scene);
        primaryStage.setTitle("PathTransition");
        primaryStage.show();

    }
}


/*
                     PathTransition : 路径跃迁 （Animation的子类）

                                ->  setNode()  :  设 置 目 标 节 点
                                ->  setPath()  :  设 置 目 标 节 点 的 移 动 路 径
                                ->  setDuration()  :  设 置 移 动 的 持 续 时 间 （一圈）
 */

