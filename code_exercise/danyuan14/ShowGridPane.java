package java_code.danyuan14;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class ShowGridPane extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        //  Create a pane and set its properties
        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);
        pane.setPadding(new Insets(11,12,13,14));
        pane.setHgap(5);      // 水 平 间 距
        pane.setVgap(5);     // 垂 直 间 距

        //  Place nodes in the pane
        pane.add(new Label("First Name:"),0,0);
        pane.add(new TextField(),1,0);
        pane.add(new Label("MI:"),0,1);
        pane.add(new TextField(),1,1);
        pane.add(new Label("Last Name:"),0,2);
        pane.add(new TextField(),1,2);

        Button button = new Button("Add Name");
        pane.add(button,1,3);
        GridPane.setHalignment(button, HPos.RIGHT);            //   单元格内水平向右
        GridPane.setValignment(button, VPos.CENTER);          //   单元格内竖直方向居中

        //  Create a scene and place it in the pane
        Scene scene = new Scene(pane,400,300);
        primaryStage.setTitle("Title");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
