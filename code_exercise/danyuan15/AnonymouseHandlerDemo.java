package java_code.danyuan15;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class AnonymouseHandlerDemo extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        //  Hold two buttons in an HBox
        HBox hBox = new HBox();
        hBox.setSpacing(10);               //  水 平 间 距
        hBox.setAlignment(Pos.CENTER);
        Button btnew = new Button("New");
        Button btopen = new Button("Open");
        Button btSave = new Button("Save");
        Button btPrint = new Button("Print");
        hBox.getChildren().addAll(btnew,btopen,btSave,btPrint);

        //  Create and register the handler
        //  匿 名 内 部 类
        btnew.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Process New");
            }
        });

        btopen.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Process Open");
            }
        });

        btSave.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Process Save");
            }
        });

        btPrint.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Process Print");
            }
        });

        //  lambda表达式
//        btnew.setOnAction((ActionEvent e)->{
//            System.out.println("Process New");
//        });
//
//        btopen.setOnAction((e)->{
//            System.out.println("Process Open");
//        });
//
//        btSave.setOnAction(e->{
//            System.out.println("Process Save");
//        });
//
//        btPrint.setOnAction(e-> System.out.println("Process Print"));


        //   Create a scene and place it in the stage
        Scene scene = new Scene(hBox,400,200);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Title");
        primaryStage.show();

    }
}

