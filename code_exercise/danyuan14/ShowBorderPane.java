package java_code.danyuan14;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class ShowBorderPane extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        //  Create a border pane
        BorderPane pane = new BorderPane();

        //  Place nodes in the pane
        pane.setTop(new CustomPane("top"));
        pane.setRight(new CustomPane("right"));
        pane.setBottom(new CustomPane("bottom"));
        pane.setLeft(new CustomPane("left"));
        pane.setCenter(new CustomPane("center"));

        //  Create a custom pane to hold a label in the center of the pane
        Scene scene = new Scene(pane,400,300);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Title");
        primaryStage.show();

    }
}


class CustomPane extends StackPane{          //  外 部 类
    CustomPane(String title){
        getChildren().add(new Label(title));
        setStyle("-fx-border-color: red;");
        setPadding(new Insets(11,12,13,14));
    }
}
