package java_code.danyuan15;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class ControlCircle extends Application {
    private CirclePane circle;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        //  Hold two button in an HBox
        HBox pane = new HBox();
        pane.setSpacing(10);
        Button button1 = new Button("放大");
        Button button2 = new Button("缩小");
        pane.getChildren().addAll(button1,button2);
        pane.setAlignment(Pos.CENTER);

        //  Create a register the handle
        button1.setOnAction(new EnlargeHandler());         //  关联（注册）时要传一个处理器（监视器）的对象实例
        button2.setOnAction(new ShrinkHandler());

        //  lambda表达式
//        button1.setOnAction((ActionEvent e)->{
//            circle.enlarge();
//        });
//        button2.setOnAction((ActionEvent e)->{
//            circle.shrink();
//        });

        BorderPane borderPane = new BorderPane();
        circle = new CirclePane();
        borderPane.setCenter(circle);
        borderPane.setBottom(pane);
        borderPane.setPadding(new Insets(10,10,10,10));
        BorderPane.setMargin(borderPane,new Insets(10,10,10,10));
//        BorderPane.setAlignment(pane, Pos.CENTER);

        //  Create a scene and place it in the stage
        Scene scene  = new Scene(borderPane,400,300);
        primaryStage.setTitle("Title");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    class EnlargeHandler implements EventHandler<ActionEvent>{             //  内部类

        @Override
        public void handle(ActionEvent event) {
            circle.enlarge();
        }
    }

    class ShrinkHandler implements EventHandler<ActionEvent>{              //  内部类

        @Override
        public void handle(ActionEvent event) {
            circle.shrink();
        }
    }

}


class CirclePane extends StackPane{
    private final Circle circle = new Circle(60);            //  shape的 Circle类

    public CirclePane(){
        getChildren().add(circle);
        circle.setStroke(Color.BLACK);
        circle.setFill(Color.WHITE);
    }

    public void enlarge(){
        circle.setRadius(circle.getRadius()+2);
    }

    public void shrink(){
        circle.setRadius(circle.getRadius()>2?circle.getRadius()-2:circle.getRadius());
    }

}
