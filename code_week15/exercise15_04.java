package code_week15;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class exercise15_04 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        BorderPane pane = new BorderPane();

        TextField Number1 = getTextField();
        TextField Number2 = getTextField();
        TextField Result = getTextField();
        HBox hBox1 = new HBox(10);
        hBox1.getChildren().addAll(new Label("Number 1: "),Number1,new Label("Number 2: "),Number2,
                new Label("Result : "),Result);
        pane.setCenter(hBox1);
        hBox1.setAlignment(Pos.CENTER);


        Button add = getButton("Add");
        Button subtract = getButton("Subtract");
        Button multiply = getButton("Multiply");
        Button divide = getButton("Divide");
        HBox hBox2 = new HBox(15);
        hBox2.getChildren().addAll(add,subtract,multiply,divide);
        pane.setBottom(hBox2);
        hBox2.setAlignment(Pos.CENTER);
        BorderPane.setMargin(hBox2,new Insets(40));


        //  设置按钮处理器（lambda表达式）
        add.setOnMouseClicked(event -> {
            try {
                double number1 = Double.parseDouble(Number1.getText());
                double number2 = Double.parseDouble(Number2.getText());
                double result = number1 + number2;
                Result.setText(String.valueOf(result));
            } catch (NumberFormatException e) {
                e.toString();
            }
        });

        subtract.setOnMouseClicked(event -> {
            try {
                double number1 = Double.parseDouble(Number1.getText());
                double number2 = Double.parseDouble(Number2.getText());
                double result = number1 - number2;
                Result.setText(String.valueOf(result));
            } catch (NumberFormatException e) {
                e.toString();
            }
        });

        multiply.setOnMouseClicked(event -> {
            try {
                double number1 = Double.parseDouble(Number1.getText());
                double number2 = Double.parseDouble(Number2.getText());
                double result = number1 * number2;
                Result.setText(String.valueOf(result));
            } catch (NumberFormatException e) {
                e.toString();
            }
        });

        divide.setOnMouseClicked(event -> {
            try {
                double number1 = Double.parseDouble(Number1.getText());
                double number2 = Double.parseDouble(Number2.getText());
                double result = number1 / number2;
                Result.setText(String.valueOf(result));
            } catch (NumberFormatException e) {
                e.toString();
            }
        });


        //  Create a scene and place it in the stage
        Scene scene = new Scene(pane,800,200);
        primaryStage.setTitle("exercise15_02");
        primaryStage.setScene(scene);
        primaryStage.setAlwaysOnTop(true);
        primaryStage.show();

    }

    private TextField getTextField(){               //  输 入 框
        TextField textField = new TextField();
        textField.setPrefColumnCount(7);
        return textField;
    }

    private Button getButton(String text){          //  按 钮
        Button button = new Button(text);
        button.setPrefWidth(90);
        return button;
    }

}
