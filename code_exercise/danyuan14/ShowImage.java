package java_code.danyuan14;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.File;

public class ShowImage extends Application {

  public static void main(String[] args) {
    launch(args);
  }

  @Override
  public void start(Stage primaryStage) {

    // Create a pane to hold the image views
    Pane pane = new StackPane();

    //Image的构造方法中参数是url，加上 file: 才是工作目录下的相对路径
    Image image = new Image("file:image.jpg");
//    File file = new File("image.jpg");
//    Image image = new Image(file.toURI().toString());              //   File类转为 URL的字符串形式


    //    获得当前classpath路径 :
    System.out.println(this.getClass().getResource("/").getPath());
    // 我们使用相对classpath的相对路径，即 /加上后续路径，表现出来的形式其实是个绝对路径

    // 也可以直接使用相对路径
//    Image image = new Image(ShowImage.class.getResourceAsStream("image.jpg"));
//    Image image = new Image(this.getClass().getResourceAsStream("image.jpg"));

    ImageView iv = new ImageView(image);
    iv.setFitHeight(400);
    iv.setFitWidth(650);

    //         属 性 绑 定
    iv.fitWidthProperty().bind(pane.widthProperty());
    iv.fitHeightProperty().bind(pane.heightProperty());

    pane.getChildren().add(iv);

    // Create a scene and place it in the stage
    Scene scene = new Scene(pane,600,600);
    primaryStage.setTitle("ShowImage"); // Set the stage title
    primaryStage.setScene(scene); // Place the scene in the stage
    primaryStage.setAlwaysOnTop(true);
    primaryStage.show(); // Display the stage
  }
}
