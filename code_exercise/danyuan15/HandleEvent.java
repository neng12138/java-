package java_code.danyuan15;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class HandleEvent extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        //  Create a pane and set its properties
        HBox pane = new HBox();
        pane.setAlignment(Pos.CENTER);

        Button button1 = new Button("Ok");
        button1.setOnAction(new OKHandleClass());            //  关联 OKHandleClass事件
//        OKHandleClass handle1 = new OKHandleClass();
//        button1.setOnAction(handle1);
        Button button2 = new Button("CANCEL");
        button2.setOnAction(new CancelHandleClass());             //  关联 CancelHandleClass事件
//        CancelHandleClass handle2 = new CancelHandleClass();
//        button2.setOnAction(handle2);


        pane.getChildren().addAll(button1,button2);
        pane.setPadding(new Insets(10,10,10,10));
//        HBox.setMargin(pane,new Insets(5,5,5,5));
        pane.setSpacing(15);               //  设 置 水 平 间 隔


        //   Create scene and place it in the stage
        Scene scene = new Scene(pane,400,300);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Title");
        primaryStage.show();

    }
}


class OKHandleClass implements EventHandler<ActionEvent>{                //  事 件 处 理 器（外部类）

    @Override
    public void handle(ActionEvent event) {
        System.out.println("OK button clicked");
    }
}

class CancelHandleClass implements EventHandler<ActionEvent>{                //  事 件 处 理 器（外部类）

    @Override
    public void handle(ActionEvent event) {
        System.out.println("CANCEL button clicked");
    }
}


