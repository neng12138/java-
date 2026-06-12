package java_code.danyuan14;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class ShowFlowPane extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        //   Create a pane and set its properties
        FlowPane pane = new FlowPane();
        pane.setPadding(new Insets(11,12,13,14));
        pane.setHgap(5);
        pane.setVgap(5);
        pane.setAlignment(Pos.CENTER);            //  将面板设置为上下居中
//        pane.setOrientation(Orientation.VERTICAL);          //   设置为垂直方向放置


        //  Place nodes in the pane
        pane.getChildren().addAll(new Label("First Name:"),new TextField(),new Label("MI:"));
        TextField textField = new TextField();      //  文 本 输 入 框
        textField.setPrefColumnCount(1);
        pane.getChildren().addAll(textField,new Label("Last Name:"),new TextField());


        //  Create a scene and place it in the stage
        Scene scene = new Scene(pane,800,400);
        primaryStage.setTitle("Title");
        primaryStage.setScene(scene);   //  Place the scene int the stage
        primaryStage.show();     //  Display the stage

    }
}
