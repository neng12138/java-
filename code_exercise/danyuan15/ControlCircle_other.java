package java_code.danyuan15;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class ControlCircle_other extends Application {
    private final CirclePane pane = new CirclePane();

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        HBox hBox = new HBox();
        hBox.setSpacing(10);
        hBox.setPadding(new Insets(10));
        hBox.setAlignment(Pos.CENTER);
        Button btnEnlarge = new Button("Enlarge");
        Button btnShrink = new Button("Shrink");
        hBox.getChildren().add(btnEnlarge);
        hBox.getChildren().add(btnShrink);

        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(pane);
        borderPane.setBottom(hBox);
        BorderPane.setAlignment(hBox, Pos.CENTER);

        // Create a scene and place it in the stage
        Scene scene = new Scene(borderPane, 300, 250);
        primaryStage.setTitle("ControlCircle"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage

        //事件驱动响应-------------------------------------------------

        //事件处理类EnlargeHandler为外部类
        btnEnlarge.setOnAction(new EnlargeHandler(pane));

        //事件处理类ShrinkHandler为内部类
        btnShrink.setOnAction(new ShrinkHandler());

        //匿名内部类的用法
//    btnShrink.setOnAction(new EventHandler<ActionEvent>() {
//      @Override
//      public void handle(ActionEvent event) {
//        pane.shrink();
//      }
//    });

        //lambda的用法
//    EventHandler<ActionEvent> handler = e ->pane.shrink();
//    btShrink.setOnAction(handler);

//        btnShrink.setOnAction(e -> {
//            pane.shrink();
//        });


    }

    class ShrinkHandler implements EventHandler<ActionEvent> {       //  内部类
        @Override
        public void handle(ActionEvent event) {
            pane.shrink();
        }
    }

}

class EnlargeHandler implements EventHandler<ActionEvent> {         //  外部类
    private CirclePane pane;               //  外部类要引用对象（麻烦）

    public EnlargeHandler(){}
    public EnlargeHandler(CirclePane pane) {
        this.pane = pane;
    }

    @Override
    public void handle(ActionEvent event) {
        pane.enlarge();
    }
}


//class CirclePane extends StackPane {
//    private Circle circle = new Circle(50);
//
//    public CirclePane() {
//        this.getChildren().add(circle);
//        circle.setStroke(Color.BLUE);
//        circle.setFill(Color.WHITE);
//    }
//
//    public void enlarge() {
//        circle.setRadius(circle.getRadius() + 2);
//    }
//
//    public void shrink() {
//        circle.setRadius(circle.getRadius() > 2 ? circle.getRadius() - 2 : circle.getRadius());
//    }
//}