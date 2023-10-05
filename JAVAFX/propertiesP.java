package application;

import javafx.application.*;
import javafx.stage.Stage;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.paint.*;
public class propertiesP extends Application
{

	@Override
	public void start(Stage stage) throws Exception
	{

		Button b=new Button("_click");
	    b.setTextFill(Color.PINK);	
	    b.setMnemonicParsing(true);
	    Tooltip tp=new Tooltip("click this button to save data");
	    b.setTooltip(tp);
	    //b.setStyle("-fx-border-color:yellow;-fx-background-color:cyan;");
	    Alert a=new Alert(AlertType.INFORMATION,"button is clicked");
	    b.setOnAction(e->a.show());
	    
		FlowPane fp=new FlowPane(b);
		
		Scene sc=new Scene(fp,400,400);
		stage.setScene(sc);
		stage.show();
	}
	
	public static void main(String[] args) {

		launch(args);
	}

	

}
