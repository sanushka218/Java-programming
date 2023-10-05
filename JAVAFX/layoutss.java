package application;

import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;

public class layoutss extends Application
{

	public void start(Stage stage) throws Exception {
		
		Button b1=new Button("One");		
		Button b2=new Button("Two");
		Button b3=new Button("Three");
		Button b4=new Button("Four");
		Button b5=new Button("Five");
		//FLOWPANE
//		FlowPane root=new FlowPane();
//		root.getChildren().addAll(b1,b2,b3,b4,b5);
//		root.setHgap(10);
//		root.setVgap(10);
		
		//TILEPANE
//		TilePane root=new TilePane();
//		root.getChildren().addAll(b1,b2,b3,b4,b5);
		
		
		//BORDERPANE
//		BorderPane root=new BorderPane();
//		root.setTop(b1);
//		root.setBottom(b2);
//		root.setLeft(b3);
//		root.setRight(b4);
//		root.setCenter(b5);
		
		//GRIDPANE
		GridPane root=new GridPane();
		root.add(b1, 0, 0);
		root.add(b2, 1, 1);
		root.add(b3, 2,2);
		root.add(b4, 3,3);
		root.add(b5, 4,4);

		Scene sc=new Scene(root,400,400);
		stage.setScene(sc);
		stage.show();

	}
	
	public static void main(String[] args) {
		launch(args);
}

}
