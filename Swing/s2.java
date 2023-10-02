import javax.swing.*;
import java.awt.*;
import java.text.*;
import java.text.NumberFormat;
import java.util.Locale;
import java.awt.event.*;
import javax.swing.text.NumberFormatter;
class frame2 extends JFrame 
{
	frame2(){
		JTextField tf=new JTextField(15);
		
		DateFormat df=new SimpleDateFormat("dd/MM/yyyy");
		JFormattedTextField tf2=new JFormattedTextField(df);
	     tf2.setColumns(20);
	     tf2.setValue(0);
	     
	     NumberFormat nf=NumberFormat.getInstance();
	     NumberFormatter ntf=new NumberFormatter(nf);		
	     JFormattedTextField tf3=new JFormattedTextField(ntf);
		 ntf.setAllowsInvalid(false);
	      ntf.setMaximum(10000);
		 tf3.setColumns(20);
		 tf3.setValue(0);
		 
	      JTextArea ta=new JTextArea(30,30);


		setLayout(new FlowLayout());
	     add(tf);
	     add(tf2);
	     add(tf3);
	     add(ta);
	
	}
}
public class s2 {

	public static void main(String[] args) {

		frame2 f=new frame2();
        f.setSize(500,500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
