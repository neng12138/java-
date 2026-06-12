package java_code.danyuan14;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


public class ShowAnchorPane extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {


        AnchorPane pane = new AnchorPane();                // AnchorPane : 锚定布局 （锚定类似于绳子）
        Button b1 = new Button("ok");
        Button b2 = new Button("cancel");
        b1.setPrefSize(100,30);
        b2.setPrefSize(100,30);


        pane.getChildren().addAll(b1,b2);
        AnchorPane.setLeftAnchor(b1,50.0);                //  锚定左边
        AnchorPane.setTopAnchor(b1,50.0);                //  锚定上面
        AnchorPane.setRightAnchor(b2,50.0);             //  锚定右边
        AnchorPane.setBottomAnchor(b2,50.0);           //  锚定下面
        //  如 果 锚 定 多 个 方 向 会 使 按 钮 变 形


        //  create a scene and place it in the stage
        Scene scene = new Scene(pane,400,400);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Title");
        primaryStage.show();
        primaryStage.setAlwaysOnTop(true);


    }
}
