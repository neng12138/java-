package java_code.danyuan15;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.scene.input.MouseButton;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class ControlCircleWithMouseAndKey extends Application {
    private CirclePane circlePane;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        //  Hold two buttons in an HBox
        HBox hBox = new HBox();
        hBox.setSpacing(10);
        hBox.setAlignment(Pos.CENTER);
        Button btenlarge = new Button("Enlarge");
        Button btshrink = new Button("Shrink");
        hBox.getChildren().addAll(btenlarge,btshrink);

        //  Create and register the handler
        circlePane = new CirclePane();
        //   按 钮 按 完 要 重 新 获 取 输 入 焦 点  requestFocus()
        btenlarge.setOnAction(e -> {circlePane.enlarge(); circlePane.requestFocus();});    //  按钮放大
        btshrink.setOnAction(e -> {circlePane.shrink(); circlePane.requestFocus();});      //  按钮缩小

        circlePane.setOnKeyPressed(e -> {
            if (e.getCode() == KeyCode.J) circlePane.enlarge();                //  J键放大
            else if (e.getCode() == KeyCode.K) circlePane.shrink();           //  k键缩小
        });

        circlePane.setOnMouseClicked(e -> {
            if (e.getButton() == MouseButton.PRIMARY) circlePane.enlarge();              //  鼠标左键放大
            else if (e.getButton() == MouseButton.SECONDARY) circlePane.shrink();        //  鼠标右键缩小
        });


        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(circlePane);
        borderPane.setBottom(hBox);
        BorderPane.setAlignment(hBox,Pos.CENTER);
        BorderPane.setMargin(hBox,new Insets(15));

        //  Create a scene and place it in the stage
        Scene scene = new Scene(borderPane,400,300);
        primaryStage.setTitle("Title");
        primaryStage.setScene(scene);
        primaryStage.show();

        circlePane.requestFocus();              //   获 取 输 入 焦 点

    }
}
