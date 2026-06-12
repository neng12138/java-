package java_code.danyuan15;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class KeyEventDemo extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        //  Create a pane and set its properties
        Pane pane = new Pane();
        Text text = new Text(100,100,"I");
        text.setFill(Color.RED);
        text.setFont(Font.font(25));

        pane.getChildren().add(text);
        text.setOnKeyPressed(e -> {               //  Shift切为英文
            switch (e.getCode()){
                case W: text.setY(text.getY()-10);break;           //  控制向上
                case S: text.setY(text.getY()+10);break;          //  控制向下
                case A: text.setX(text.getX()-10);break;         //   控制向左
                case D: text.setX(text.getX()+10);break;        //  控制向右
                default:
                    if (Character.isLetterOrDigit(e.getText().charAt(0)))
                        text.setText(e.getText());
            }
        });

        //  Create a scene and place it in the stage
        Scene scene = new Scene(pane,400,300);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Title");
        primaryStage.show();

        text.requestFocus();           //     获 得 输 入 焦 点 （ 否则没办法直接控制 ）

    }
}
