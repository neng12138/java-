package java_code.danyuan14;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polyline;
import javafx.stage.Stage;

public class ShowPolyline extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        //  Create a pane , a polyline and place polyline to pane
        Pane pane = new Pane();
        Polyline polyline = new Polyline();
        pane.getChildren().add(polyline);
        polyline.setFill(Color.WHITE);
        polyline.setStroke(Color.BLACK);

        ObservableList<Double> list = polyline.getPoints();      //  传地址值

        final double WIDTH = 200, HEIGHT = 200;
        double centerX = WIDTH/2, centerY = HEIGHT/2;
        double radius = Math.min(WIDTH,HEIGHT)*0.4;

        //  Add points to the polygon list
        for (int i = 0; i < 6; i++) {
            list.add(centerX + radius * Math.cos(2*i*Math.PI/6));
            list.add(centerY - radius * Math.sin(2*i*Math.PI/6));
        }


        //  Create a scene and place it in the stage
        Scene scene = new Scene(pane,400,300);
        primaryStage.setTitle("ShowPolyLine");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}


/*
                    Polyline :  第一个添加的点最后不会与最后添加的点相连，形成一条曲折的线

                          ->  Polyline 和  Polygon 的用法几乎一模一样
 */

