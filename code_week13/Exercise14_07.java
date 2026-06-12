package code_week13;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.File;
import java.util.Random;

public class Exercise14_07 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        HBox pane = new HBox(20);
        pane.setAlignment(Pos.CENTER);
        pane.setPadding(new Insets(20));


        Random random = new Random();
        for (int i = 0; i < 3; i++) {
            int x = random.nextInt(52) + 1 ;
            String filename = "card/"+x+".png";

            pane.getChildren().add(new select_pk(filename));
        }

        Scene scene = new Scene(pane,1000,600);
        primaryStage.setTitle("Title");
        primaryStage.setScene(scene);
        primaryStage.setAlwaysOnTop(true);
        primaryStage.show();
    }
}

class select_pk extends StackPane {
    File file;

    public select_pk(String filename){
        file = new File(Exercise14_07.class.getResource("").getPath()+filename);
        Image image = new Image(file.toURI().toString());
        ImageView imageView = new ImageView(image);
        getChildren().add(imageView);
        imageView.setFitWidth(300);
        imageView.setFitHeight(360);
    }
}
