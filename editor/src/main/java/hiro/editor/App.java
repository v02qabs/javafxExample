package hiro.editor;

import javafx.application.Application;
import javafx.scene.Scene; 
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.input.KeyCode;
import javafx.stage.Stage;
import javafx.scene.layout.HBox;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.Scene;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.MenuItem;
import javafx.scene.text.Font;
public class App extends Application {

    @Override
    public void start(Stage primaryStage) {
        // ウィンドウのタイトルを設定
        primaryStage.setTitle("Hello, JavaFX!");
		StackPane root = new StackPane();
        // ボタンを作成
        Button button1 = new Button("Button1");
       	TextField host_name = new TextField();
       	ContextMenu popup = new ContextMenu();
    		MenuItem item1 = new MenuItem("ようこそ");
    		popup.getItems().addAll(item1);  
    		            Font font = Font.loadFont(getClass().getResourceAsStream("/usr/share/fonts/myfonts/myfonts.ttf"), 20);
		  	        item1.setStyle("-fx-font-family: '" + font.getFamily() + "'; -fx-font-size: 20;");
        // レイアウトを設定
        HBox hbox = new HBox(10);
        hbox.getChildren().addAll(button1, host_name);

        // シーンを作成
        Scene scene = new Scene(root, 300, 200);
		   		  scene.addEventFilter(KeyEvent.KEY_PRESSED, event ->{
    		  	if(event.isControlDown() && event.getCode() == KeyCode.SPACE){
                popup.show(root, primaryStage.getX() + 100, primaryStage.getY() + 100);
                event.consume();
            }
        }); 
        // シーンをステージに設定
        primaryStage.setScene(scene);

        // ステージを表示
        primaryStage.show();
    }

    public static void main(String[] args) {
        // JavaFXアプリケーションを起動
        launch(args);
    }
   
}

