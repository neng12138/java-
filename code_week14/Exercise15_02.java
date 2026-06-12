package code_week14;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Exercise15_02 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        BorderPane pane = new BorderPane();

        rectangleDemo rectangleDemo = new rectangleDemo();
        pane.setCenter(rectangleDemo);

        Button button1 = new Button("Rotate");
        button1.setPrefSize(100,40);
        pane.setBottom(button1);

        button1.setOnAction(new EventHandler<ActionEvent>() {          //  匿名内部类
            @Override
            public void handle(ActionEvent event) {
                rectangleDemo.Rotate();
            }
        });
//        button1.setOnAction(event -> {            //  lambda表达式
//            rectangleDemo.Rotate();
//        });

        pane.setPadding(new Insets(30));
        BorderPane.setMargin(button1,new Insets(30));
        BorderPane.setAlignment(button1,Pos.CENTER);


        // Create a scene and place it in the stage
        Scene scene = new Scene(pane,500,400);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Exercise15_02");
        primaryStage.setAlwaysOnTop(true);
        primaryStage.show();

    }
}


class rectangleDemo extends StackPane{
    private final Rectangle rectangle = new Rectangle();

    rectangleDemo(){
        rectangle.setWidth(170);
        rectangle.setHeight(80);
        rectangle.setStrokeWidth(7);
        rectangle.setFill(Color.WHITE);              //  默认黑色
        rectangle.setStroke(Color.BLACK);           //  默认无边框
        getChildren().add(rectangle);
    }

    public void Rotate(){
        rectangle.setRotate(rectangle.getRotate()+15);
    }

    public void UnRotate(){
        rectangle.setRotate(rectangle.getRotate()-15);
    }

    public void RandomFill(){
        rectangle.setFill(Color.color(Math.random(),Math.random(),Math.random()));
        rectangle.setStroke(Color.color(Math.random(),Math.random(),Math.random()));
    }

}

