package java_code.danyuan15;

import javafx.animation.Animation;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.stage.Stage;

public class BallControlDemo extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        BallPane pane = new BallPane();

//        pane.setOnMousePressed(e-> pane.pause());
//        pane.setOnMouseReleased(e-> pane.play());
        pane.setOnMouseClicked(e->{                                //  设 置 鼠 标 事 件
            if (pane.getStatus() == Animation.Status.RUNNING){
                pane.pause();
            }
            else {
                pane.play();
            }
        });

        pane.setOnKeyPressed(e->{                         //  设 置 键 盘 事 件
            if (e.getCode() == KeyCode.J){
                pane.increaseSpeed();
            }
            if (e.getCode() == KeyCode.K){
                pane.decreaseSpeed();
            }
        });


        //  create a scene and place it in the stage
        Scene scene = new Scene(pane,400,300);
        primaryStage.setTitle("Title");
        primaryStage.setScene(scene);
        primaryStage.show();
        pane.requestFocus();
    }
}
