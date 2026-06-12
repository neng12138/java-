package code_week15;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.util.Random;

public class exercise15_19 extends Application {
    private long end_time;
    private long start_time;
    private int count;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();

        //  create a circle and place it in the pane
        Circle circle = new Circle(30);
        circle.setFill(Color.color(Math.random(),Math.random(),Math.random()));
        pane.getChildren().add(circle);


        // Create a scene and place it in the stage
        Scene scene = new Scene(pane,600,300);
        primaryStage.setScene(scene);
        primaryStage.setTitle("exercise15_19");
//        primaryStage.setAlwaysOnTop(true);
        primaryStage.show();

        //  create a start_time
        start_time = System.currentTimeMillis();

        Random random = new Random();
        double centerX = ( Math.random()*(pane.getWidth()-2*circle.getRadius()) ) + circle.getRadius();
        double centerY = ( Math.random()*(pane.getHeight()-2*circle.getRadius()) ) + circle.getRadius();
//        Double x = pane.getWidth()-2*circle.getRadius();
//        double centerX = random.nextInt(x.intValue())+circle.getRadius();
//        Double y = pane.getHeight()-2*circle.getRadius();
//        double centerY = random.nextInt(y.intValue())+circle.getRadius();
        circle.setCenterX(centerX);
        circle.setCenterY(centerY);


        circle.setOnMouseClicked(event -> {
            circle.setFill(Color.color(Math.random(),Math.random(),Math.random()));
            circle.setCenterX(( Math.random()*(pane.getWidth()-2*circle.getRadius()) ) + circle.getRadius());
            circle.setCenterY(( Math.random()*(pane.getHeight()-2*circle.getRadius()) ) + circle.getRadius());
            count++;
            if (count % 20 == 0){
                end_time = System.currentTimeMillis();
                ShowInfoDemo();
//                start_time = end_time;
            }
        });

    }

    private void ShowInfoDemo(){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("游戏时长");
        alert.setHeaderText(null);
        alert.setContentText("\t\t本次游戏的总时长 ： "+(end_time-start_time)/1000.0+"s");
        alert.showAndWait();     //  关闭弹窗后才执行下面的代码
        start_time = end_time;      //  更改当前的时间
    }

}


//              获取当前的时间 ：  System.currentTimeMills()   ->   默认以毫秒为单位

/*
                  常用：
                      ->   1. long start_time = System.currentTimeMills();

                      ->   2. long end_time = System.currentTimeMills();

                      ->   3. long time = (start_time - end_time)/1000.0;   （此时单位为秒）
 */



