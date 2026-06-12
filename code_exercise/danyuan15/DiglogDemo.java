package java_code.danyuan15;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextInputDialog;
import javafx.scene.layout.StackPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;

public class DiglogDemo extends Application {

    private Stage stage;
    private Media media;
    private MediaPlayer mediaPlayer;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage){
        stage = primaryStage;
        StackPane pane = new StackPane();
        Button button = new Button("对话框提示");
        button.setPrefSize(100,30);
        pane.getChildren().add(button);

        button.setOnAction(e->{
//            Showalert_info();
//            Showalert_warning();
//            Showalert_error();
//            Showalert_confirmation();
//            ShowTextinput();
            Showfilechooser();
        });


        //  Create a scene and place it in the stage
        Scene scene = new Scene(pane,400,400);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Title");
        primaryStage.show();
    }


    private void Showalert_info(){                                //  一 般 的 提 示 信 息
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("对话框");
        alert.setHeaderText("标题头");
//        alert.setHeaderText(null);                          // 不需要选择的项目，则将参数设置null或空字符串即可
        alert.setContentText("内容.....\n内容.....\n内容......");
//        alert.show();                                  //  show()方法则是显示出对话框后，立即执行后面的代码
        alert.showAndWait();                         //  showAndWait()表示关闭对话框之前程序不会执行后面的代码
    }


    private void Showalert_warning(){                           //  警 告 信 息
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle("对话框");
        alert.setHeaderText("标题头");
//        alert.setHeaderText(null);
        alert.setContentText("内容.....\n内容.....\n内容......");
//        alert.show();
        alert.showAndWait();
    }


    private void Showalert_error(){                            //  错 误 信 息
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("对话框");
        alert.setHeaderText("标题头");
//        alert.setHeaderText(null);
        alert.setContentText("内容.....\n内容.....\n内容......");
//        alert.show();
        alert.showAndWait();
    }


    private void Showalert_confirmation(){                      //  确 认 信 息
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("对话框");
        alert.setHeaderText(null);
        alert.setContentText("确定退出吗");
//        alert.showAndWait();

//        ButtonType buttonType = alert.getResult();                       //  ButtonType类型
//        if (buttonType == ButtonType.OK) System.out.println("退出");
//        if (buttonType == ButtonType.CANCEL) System.out.println("退出失败");

        // 自定义按钮
        ButtonType buttonType1 = new ButtonType("button1");
        ButtonType buttonType2 = new ButtonType("button2");
        ButtonType buttonType3 = new ButtonType("button3");
        alert.getButtonTypes().addAll(buttonType1,buttonType2,buttonType3);
//        alert.getButtonTypes().clear();                 // 清 空
        alert.showAndWait();

        if (alert.getResult() == ButtonType.OK) System.out.println("退出");
        if (alert.getResult() == ButtonType.CANCEL) System.out.println("退出失败");
        if (alert.getResult() == buttonType1) System.out.println("Button1 clicked");
        if (alert.getResult() == buttonType2) System.out.println("Button2 clicked");
        if (alert.getResult() == buttonType3) System.out.println("Button3 clicked");

    }

    private void ShowTextinput(){                      //  文 本 输 入 框

        TextInputDialog textInputDialog = new TextInputDialog("默认值");
        textInputDialog.setTitle("文本输入框");
        textInputDialog.setHeaderText("回答问题");
        textInputDialog.setContentText("我帅吗？");
        textInputDialog.showAndWait();

        String text = textInputDialog.getResult();                   // String类型
        System.out.println(text);
//        try {
//            if (text.equals("帅")) System.out.println("真诚实");
//        }
//        catch (NullPointerException ignored){          // 打开对话框又什么都不输入时会抛出 NullPointerException
//            ignored.printStackTrace();
//        }

    }


    private void Showfilechooser(){
        FileChooser fileChooser = new FileChooser();

        //   格 式 过 滤
        FileChooser.ExtensionFilter extensionFilter1 = new FileChooser.ExtensionFilter("Media",
                "*.mp3","*.mp4");
        FileChooser.ExtensionFilter extensionFilter2 = new FileChooser.ExtensionFilter("all file",
                "" + "*.*");
        fileChooser.getExtensionFilters().addAll(extensionFilter1,extensionFilter2);

        File file = fileChooser.showOpenDialog(stage);               //  打 开 （上 传 路 径）
//        File file = fileChooser.showSaveDialog(stage);            //  保 存 （上 传 路 径）

        try {
            media = new Media(file.toURI().toString());       //  视 频 （Media）
            System.out.println(file.toURI().toString());
            mediaPlayer = new MediaPlayer(media);
            mediaPlayer.play();             //  启 动 动 画
        }
        catch (NullPointerException ignorer){          // 打开文件选择框又什么都不选择时会抛出 NullPointerException
            ignorer.printStackTrace();
        }

    }


}
