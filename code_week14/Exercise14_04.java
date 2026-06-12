package code_week14;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Exercise14_04 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        //  Create a Hbox
        HBox pane = new HBox(5);
        pane.setAlignment(Pos.CENTER);
        pane.setPadding(new Insets(5));

        Label[] labels = {new Label("TimesRomes"),new Label("bold"),new Label("italic"),
        new Label("bold"),new Label("TimesRomes")};

        for (Label label : labels){
            pane.getChildren().add(label);
            label.setFont(new Font(22));
            label.setTextFill(Color.color(Math.random(),Math.random(),Math.random(),Math.random()));
            label.setRotate(90);
        }


        // Create a scene and place it in the stage
        Scene scene = new Scene(pane,500,400);
        primaryStage.setAlwaysOnTop(true);
        primaryStage.setTitle("Exercise14_04");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
