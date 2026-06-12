package java_code.danyuan14;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class ShowHBoxVBoxPane extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        //  Create a border pane
        BorderPane pane = new BorderPane();

        //  Place nodes in the pane
        pane.setTop(getHBox());
        pane.setLeft(getVBox());

        //  Create a scene and place it in the stage
        Scene scene = new Scene(pane,400,300);
        primaryStage.setTitle("Title");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    private HBox getHBox(){               //  内部类
        HBox hBox = new HBox(15);
        hBox.setPadding(new Insets(15,15,15,15));
        hBox.getChildren().add(new Button("OK"));
        hBox.getChildren().add(new Button("Cancel"));
        hBox.setStyle("-fx-background-color: #4ad9cd;-fx-alignment: center");
//        Image image = new Image("file:image.jpg");
//        ImageView imageView = new ImageView(image);
//        hBox.getChildren().add(imageView);
        return hBox;
    }


    private VBox getVBox(){              // 内部类
        VBox vBox = new VBox(15);
        vBox.setPadding(new Insets(15,5,15,5));
        Label course = new Label("Course");
        course.setFont(new Font(20));
        vBox.getChildren().add(course);

        Label[] labels = new Label[]{
                new Label("CSCI 1301"),new Label("CSCI 1302"),new Label("CSCI 1303")
        };

        for (Label label : labels){
            label.setFont(new Font(20));
            vBox.getChildren().add(label);
            VBox.setMargin(label,new Insets(0,0,0,15));
        }
        vBox.setStyle("-fx-background-color: #b6bbb6");

        return vBox;
    }

}
