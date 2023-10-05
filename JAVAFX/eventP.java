package application;

import javafx.application.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.scene.layout.*;


public class eventP extends Application implements EventHandler<ActionEvent>
{

	int count=0;
	Button b;
	public void start(Stage stage) throws Exception
	{
      b=new Button("Click");
      b.setOnAction(this);
      /*
       using lambda exp
       b.setOnAction(e-> {count++; b.setText(""+count);});
       */
      b.setPrefSize(100, 30);
      
      FlowPane fp=new FlowPane(b);
      
      Scene sc=new Scene(fp,400,400);
      stage.setScene(sc);
      stage.show();
		
	}
	@Override
	public void handle(ActionEvent ae)
	{
		count++;
		b.setText(""+count);
		
	}
	public static void main(String[] args) 
	{

		launch(args);
	}

}
