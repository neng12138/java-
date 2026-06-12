package java_code.danyuan15;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;


public class ShowTimeline extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        Pane pane = new StackPane();
        Text text = new Text("Programming is fun");
        text.setFont(Font.font(35));
        text.setFill(Color.RED);
        pane.getChildren().add(text);

        Timeline animation = new Timeline(new KeyFrame(Duration.millis(500),e->{
            if (text.isVisible()){
                text.setVisible(false);
            }
            else text.setVisible(true);
        }));
        animation.setCycleCount(Timeline.INDEFINITE);
//        animation.setRate(1.1);
        animation.play();                                  //  设置 cycleCount() 和 play() 后才能启动动画


        //  设 置 处理 器 暂 停
//        pane.setOnMousePressed(e-> animation.pause());
//        pane.setOnMouseReleased(e -> animation.play());
        pane.setOnMouseClicked(e -> {
            if (animation.getStatus() == Animation.Status.RUNNING){
                animation.pause();
            }
            else animation.play();
        });


        //  create a scene and place it in the stage
        Scene scene = new Scene(pane,400,400);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Title");
        primaryStage.show();
    }
}
