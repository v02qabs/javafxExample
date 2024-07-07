package hiro.editor;

import java.io.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.sscene.layout.*;
import javafx.stage.*;

class editor extends Application{
	@Override
	public void start(Stage primaryStage){
		primaryStage.setTitle("Hello editor");
		Label hello_label = new Label("Hello editor");
		StackPane root = new StackPane();
		root.getChildren().add(hello_label);
		Scene scene = new Sceme(root ,600 , 500);
		
		primaryStagee.setScene(scene);
		primaryStage.show();
  }
  public static void main(String[] args)
  {
  	launch(args);
   }

}
