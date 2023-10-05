package application;

import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.image.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import java.io.*;

public class tabpaane extends Application
{
	public void start(Stage stage) throws Exception {
		ImageView iv1=null;
		ImageView iv2=null;
		ImageView iv3=null;
		iv1=new ImageView(new Image(new FileInputStream("D:/media/954eaef3-c1f9-4ce5-a768-0599c06316d8.png")));
		iv2=new ImageView(new Image(new FileInputStream("D:/media/0f6c2877-7363-40ea-a7e8-384de4623786.png")));		
		iv3=new ImageView(new Image(new FileInputStream("D:/media/eva_vanassche on instagram  uploaded by @eva_vanassche.png")));
		
		ScrollPane sp1=new ScrollPane(iv1);
		ScrollPane sp2=new ScrollPane(iv2);
		ScrollPane sp3=new ScrollPane(iv3);
		
		Tab t1=new Tab("B99",sp1);
		Tab t2=new Tab("Office",sp2);
		Tab t3=new Tab("Quotes",sp3);
		
		TabPane root=new TabPane();
		root.getTabs().addAll(t1,t2,t3);
		Scene sc=new Scene(root,500,500);
		stage.setScene(sc);
		stage.show();
		
	}
	public static void main(String[] args) {
		launch(args);

	}

}
