package code_week15;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Polyline;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

public class exercise15_27 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();
        //  Create a scene
        Scene scene = new Scene(pane, 400, 100);

        Text text = new Text(20, 50, "Programming is fun");
        pane.getChildren().add(text);

        double textWidth = text.getBoundsInLocal().getWidth();     // 获取文本宽度像素值

        KeyFrame keyFrame = new KeyFrame(Duration.millis(30), event ->
        {
            if (text.getX() < pane.getWidth())
            {
                text.setX(text.getX() + 1);       // 右 移
            }
            else
            {
                text.setX(-textWidth);        //  重 新 从 左 边 出 现
            }
        });
        Timeline timeline = new Timeline(keyFrame);
        timeline.setCycleCount(Timeline.INDEFINITE);

        //  place scene in the stage
        primaryStage.setTitle("exercise15_27");
        primaryStage.setScene(scene);
        primaryStage.show();

        // 开始动画
        timeline.play();
        pane.setOnMousePressed(event -> timeline.pause());
        pane.setOnMouseReleased(event -> timeline.play());

    }
}


//                      获取文本宽度像素值 ： getBoundsInLocal().getWidth()



