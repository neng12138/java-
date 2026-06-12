package code_week13;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.Random;

public class Exercise14_02 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        GridPane pane = new GridPane();
        pane.setGridLinesVisible(true);

        Random random = new Random();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int find = random.nextInt(3);

                if (find==0) pane.add(new Circle_demo(),j,i);
                else if (find==1) pane.add(new Line_demo(),j,i);
                else pane.add(new Blank_demo(),j,i);
            }
        }
        pane.setAlignment(Pos.CENTER);

        Scene scene = new Scene(pane,400,400);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Show");
        primaryStage.show();
    }
}

class Blank_demo extends StackPane{
    private Circle circle = new Circle(25);

    public Blank_demo(){
        circle.setFill(Color.WHITE);
        circle.setStroke(Color.WHITE);
        circle.setStrokeWidth(10);
        getChildren().add(circle);
        setPadding(new Insets(10,10,10,10));
    }
}

class Circle_demo extends StackPane{
    private Circle circle = new Circle(25);

    public Circle_demo(){
        circle.setFill(Color.WHITE);
        circle.setStroke(Color.BLACK);
        circle.setStrokeWidth(10);
        getChildren().add(circle);
        setPadding(new Insets(10,10,10,10));
    }
}

class Line_demo extends StackPane {
    private Line line1 = new Line(0,0,45,45);
    private Line line2 = new Line(0,45,45,0);

    public Line_demo(){

        line1.setStrokeWidth(15);
        line1.setStroke(Color.BLACK);

        line2.setStrokeWidth(15);
        line2.setStroke(Color.BLACK);

        getChildren().addAll(line1,line2);


    }
}
