package code_week14;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.scene.input.MouseButton;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;


public class Exercise15_02_v2 extends Application {
    rectangleDemo rectangleDemo = new rectangleDemo();;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        BorderPane pane = new BorderPane();
        pane.setPadding(new Insets(30));

        pane.setCenter(rectangleDemo);
        pane.setBottom(getHBox());

        rectangleDemo.setOnMouseClicked(e -> {
            if (e.getButton() == MouseButton.PRIMARY){           //  鼠 标 左 键
                rectangleDemo.Rotate();
            }
            if (e.getButton() == MouseButton.SECONDARY){        //  鼠 标 右 键
                rectangleDemo.UnRotate();
            }
        });

        rectangleDemo.setOnKeyPressed(event -> {
            if (event.getCode() == KeyCode.LEFT){           //    " <- " 键
                rectangleDemo.Rotate();
            }
            if (event.getCode() == KeyCode.RIGHT){           //   “ -> ” 键
                rectangleDemo.UnRotate();
            }
        });


        // Create a scene and place it in the stage
        Scene scene = new Scene(pane,500,400);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Exercise15_02");
        primaryStage.setAlwaysOnTop(true);
        primaryStage.show();

        rectangleDemo.requestFocus();            //  获 取 焦 距

    }

    private HBox getHBox(){
        HBox hBox = new HBox(40);

        Button button1 = new Button("Rotate");
        button1.setPrefSize(100,40);
        button1.setOnAction(new EventHandler<ActionEvent>() {          //  匿名内部类
            @Override
            public void handle(ActionEvent event) {
                rectangleDemo.Rotate();
                rectangleDemo.requestFocus();
            }
        });

        Button button2 = new Button("Fill");
        button2.setPrefSize(100,40);
        button2.setOnAction(e -> {                            // lambda表达式
            rectangleDemo.RandomFill();
            rectangleDemo.requestFocus();
        });

        hBox.getChildren().addAll(button1,button2);
        hBox.setAlignment(Pos.CENTER);
        hBox.setPadding(new Insets(0,0,20,0));

        return hBox;
    }

}
