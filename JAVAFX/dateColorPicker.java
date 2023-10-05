package application;

import javafx.application.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import java.io.*;
import java.util.*;

public class dateColorPicker extends Application
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
	   
	    DatePicker dp=new DatePicker();
	    dp.setShowWeekNumbers(true);
	    dp.setOnAction(e->{
	    	ta.setText("DATE: "+dp.getValue()+"\n"+ta.getText());
	    });
	    
	    ColorPicker cp=new ColorPicker();
	    cp.setOnAction(e->
	    {
	    	ta.setStyle("-fx-text-fill:#"+cp.getValue().toString().substring(2,8));
	    	ta.setText(cp.getValue()+"\n"+ta.getText());
	         });
	    
	    Button b=new Button("Open file");
	    b.setOnAction(e->
	    {
	    	FileChooser fc=new FileChooser();
	    	java.io.File f=fc.showOpenDialog(stage);
	    	
	    	try(Scanner sc=new Scanner(new FileInputStream(f))){
	    		String str="";
	    		while(sc.hasNext())
	    		{
	    			str=str+sc.nextLine()+"\n";
	    			ta.setText(str);
	    		}
	    	}
	    	catch(Exception ex) {}
	    	
	    	
	    });
	    VBox vb=new VBox();
	    vb.getChildren().addAll(ta,sl,dp,cp,b);
	    vb.setAlignment(Pos.TOP_CENTER);
	    
	    Scene sc=new Scene(vb,500,500);
	    stage.setScene(sc);
	    stage.show();
	}
	
	public static void main(String[] args) {
        launch(args);
	}

	
	

}
