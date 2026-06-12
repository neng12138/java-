package java_code.danyuan14;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ShowRectangle extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        //  Create a pane in the stage
        Pane pane = new Pane();

        //  Create rectangles and add to pane
        Rectangle rectangle1 = new Rectangle(155,10,100,30);
        rectangle1.setStroke(Color.BLACK);
        rectangle1.setFill(Color.WHITE);
        pane.getChildren().add(new Text(10,27,"rectangle1"));
        pane.getChildren().add(rectangle1);

        Rectangle rectangle2 = new Rectangle(155,50,100,30);
        pane.getChildren().add(new Text(10,67,"rectangle2"));
        pane.getChildren().add(rectangle2);

        Rectangle rectangle3 = new Rectangle(155,90,100,30);
        pane.getChildren().add(new Text(10,107,"rectangle3"));
        rectangle3.setArcWidth(15);
        rectangle3.setArcHeight(25);
        pane.getChildren().add(rectangle3);

        for (int i = 0; i < 4; i++) {
            Rectangle rectangle = new Rectangle(300,50,100,30);
            rectangle.setRotate(i*45);
            rectangle.setStroke(Color.color(Math.random(),Math.random(),Math.random()));   //  设置边框颜色
            rectangle.setFill(Color.WHITE);                         //  设置填充颜色
            pane.getChildren().add(rectangle);

            //  属 性 绑 定
//            rectangle.widthProperty().bind(pane.widthProperty().divide(3));
//            rectangle.heightProperty().bind(pane.heightProperty().divide(7));

//            rectangle.setFill(null); //透明效果

            //渐变效果
//            Stop[] stops = new Stop[] { new Stop(0, Color.color(Math.random(), Math.random(),
//                    Math.random())), new Stop(1, Color.color(Math.random(), Math.random(),
//                    Math.random())) };
//            LinearGradient lg1 = new LinearGradient(0, 0, 1, 0, true, CycleMethod.NO_CYCLE, stops);
//            rectangle.setFill(lg1);

        }


        //  Create a scene and place it in the stage
        Scene scene = new Scene(pane,600,400);
        primaryStage.setTitle("Title");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
