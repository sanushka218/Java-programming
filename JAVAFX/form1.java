package application;

import javafx.application.*;
import javafx.geometry.Pos;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import java.util.*;
import java.io.*;

class customer
{
	private int custid;
	private String name;
	private String address;
	
	public customer(int c, String n, String a)
	{
		custid=c;
		name=n;
		address=a;
	}
	
	public int getID() {return custid;}
	public String getName() {return name;}
	public String getAddress() {return address;}
	public void setName(String n) {name=n;}
}


public class form1 extends Application
{
	int count=0;
	public void start(Stage stage) throws Exception 
	{
		HashMap<Integer, customer>hm=new HashMap<>();
		
		
		Font f=new Font("Times New Roman",20);
		
		Label l1=new Label("Customer ID");l1.setFont(f);
		Label l2=new Label("Name");l2.setFont(f);
		Label l3=new Label("Address");l3.setFont(f);
		
		ComboBox<Integer>cust=new ComboBox<>();
		cust.setStyle("-fx-font-size:20");
		
		TextField name=new TextField();name.setFont(f);
		TextField addr=new TextField();addr.setFont(f);
        name.setPrefColumnCount(15);
        addr.setPrefColumnCount(20);
        
        
        //ADDING LISTNER TO COMBO BOX SUCH THAT ON CLICKING THE CUSTID FROM THE DROP DOWN WE GET ALL THE DETAILS IN THE NAME,ADDR FIELD
        cust.valueProperty().addListener(e->{
			int c=cust.getValue();
			customer ct=hm.get(c);
			name.setText(ct.getName());
			addr.setText(ct.getAddress());
			
		});
        
        
        Button save=new Button("Save");save.setFont(f);
        save.setOnAction(e->{
        	customer c=new customer(cust.getValue(),name.getText(),addr.getText());
        	hm.put(count, c);
        	try(PrintStream ps=new PrintStream(new FileOutputStream("Customer.txt")))
        	{
        		for (customer ct:hm.values())
        		{
        			ps.println(ct.getID());//these are the get methods we made for customer class
        			ps.println(ct.getName());
        			ps.println(ct.getAddress());
        		}
        	}
        	catch(Exception ex) {
        		System.out.println(ex);
        	}
        	
        });
        
        
        Button create=new Button("Create");create.setFont(f);
        create.setOnAction(e->{
        	++count;
        	cust.getItems().add(count);
        	cust.setValue(count);
        	name.setText("");
        	addr.setText("");
        });
        
        HBox h1=new HBox();h1.setAlignment(Pos.CENTER);
        HBox h2=new HBox();h2.setAlignment(Pos.CENTER);
        HBox h3=new HBox();h3.setAlignment(Pos.CENTER);
        HBox h4=new HBox();h4.setAlignment(Pos.CENTER);

        h1.getChildren().addAll(l1,cust);
        h2.getChildren().addAll(l2,name);
        h3.getChildren().addAll(l3,addr);
        h4.getChildren().addAll(create,save);
        
        VBox vb=new VBox();
        vb.getChildren().addAll(h1,h2,h3,h4);
        vb.setAlignment(Pos.CENTER);
        
        //PULLING ALL DATA FROM FILE TO HASHMAP
        try(Scanner s=new Scanner(new FileInputStream("Customer.txt")))
    	{
    		int c;
    		String n,a;
    		while(s.hasNext())
    		{
    			c=s.nextInt();
    			n=s.next();
    			a=s.next();
    			hm.put(c,new customer(c,n,a));
    			if(c>count)count=c;
    			cust.getItems().add(c);
    		}
    	}
    	catch(Exception ex) {
    		System.out.println(ex);
    	}
    	
        
        
        Scene sc=new Scene(vb,500,500);
        stage.setScene(sc);
        stage.show();
	}
	

	public static void main(String[] args)
	{
          launch(args);
		
	}

	

}
