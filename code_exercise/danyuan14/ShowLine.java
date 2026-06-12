package java_code.danyuan14;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class ShowLine extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        //  Create a scene and place it in the stage
        Pane pane = new Pane();

        Line line1 = new Line(10,10,10,10);
        line1.endXProperty().bind(pane.widthProperty().subtract(10));
        line1.endYProperty().bind(pane.heightProperty().subtract(10));
        line1.setStrokeWidth(5);                        //   设置直线的粗细
        line1.setStroke(Color.GREEN);                  //   设置直线的颜色
        pane.getChildren().add(line1);

        Line line2 = new Line(10,10,10,10);
        line2.startXProperty().bind(pane.widthProperty());
        line2.endYProperty().bind(pane.heightProperty());
        line2.setStrokeWidth(5);                        //   设置直线的粗细
        line2.setStroke(Color.GREEN);                  //   设置直线的颜色
        pane.getChildren().add(line2);

        //  Create a scene and place it in the stage
        Scene scene = new Scene(pane,400,300);
        Scene scene1 = new Scene(new LinePane(),400,300);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Title");
        primaryStage.show();

    }
}


class LinePane extends Pane{                     //    类的方法（放在构造函数中直接调用使用）
        public LinePane(){
            Line line1 = new Line(10,10,10,10);
            line1.endXProperty().bind(widthProperty().subtract(10));
            line1.endYProperty().bind(heightProperty().subtract(10));
            line1.setStrokeWidth(5);                        //   设置直线的粗细
            line1.setStroke(Color.GREEN);                  //   设置直线的颜色
            getChildren().add(line1);

            Line line2 = new Line(10,10,10,10);
            line2.startXProperty().bind(widthProperty());
            line2.endYProperty().bind(heightProperty());
            line2.setStrokeWidth(5);                        //   设置直线的粗细
            line2.setStroke(Color.GREEN);                  //   设置直线的颜色
            getChildren().add(line2);
        }
}
