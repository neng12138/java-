package java_code.danyuan14;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ShowText extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        //  Create a pane to hold the texts
        Pane pane = new Pane();
        pane.setPadding(new Insets(10));

        Text text1 = new Text(20,20,"Programming is fun");
        text1.setFont(Font.font("Courier", FontWeight.BOLD, FontPosture.ITALIC,25));
        pane.getChildren().add(text1);


        Text text2 = new Text(60,60,"Programming is fun\nDisplag text");
        text2.setFont(new Font(15));
//        text2.setFont(Font.font("Courier", FontWeight.BOLD, FontPosture.ITALIC,15));
        pane.getChildren().add(text2);


        Text text3 = new Text(20,100,"Programming is fun\nDisplag text");
        text3.setFont(new Font(20));
        text3.setFill(Color.RED);
        text3.setUnderline(true);                //  设置下划线
        text3.setStrikethrough(true);           //   设置删除线
        pane.getChildren().add(text3);


        //  Create a scene and place it in the stage
        Scene scene = new Scene(pane,400,300);
        primaryStage.setTitle("Title");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
