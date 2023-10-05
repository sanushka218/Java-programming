package application;

import javafx.application.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.Font;

public class textAreaSlider extends Application
{
    
    
	public void start(Stage stage) throws Exception 
	{
		TextArea ta=new TextArea();
	    ta.setPrefColumnCount(100);
	    ta.setPrefRowCount(20);
	    
	    Slider sl=new Slider(10,50,10);
	    sl.setMajorTickUnit(5);
	    sl.setShowTickMarks(true);
	    sl.valueProperty().addListener(e->ta.setFont(Font.font(sl.getValue())));
	    
	    VBox vb=new VBox();
	    vb.getChildren().addAll(ta,sl);
	    
	    Scene sc=new Scene(vb,500,500);
	    stage.setScene(sc);
	    stage.show();
	}
	public static void main(String[] args) {

		launch(args);
	}

	

}
