import java.awt.*;
import java.awt.event.*;
class frame3 extends Frame implements TextListener,ActionListener
{
	Label l1,l2;
	TextField tf;
	public frame3()
	{
		super("text field demo");
		l1= new Label("No text is entered yet");
		l2=new Label("enter key is not yet hit");
		tf=new TextField(20);
		
		
		tf.setEchoChar('*');
		tf.addTextListener(this);
		tf.addActionListener(this);
		
	     setLayout(new FlowLayout());
	     
	     add(l1);
	     add(tf);
	     add(l2);  
	     
	}
	@Override
	public void actionPerformed(ActionEvent e) {

		l2.setText(tf.getText());
	}
	@Override
	public void textValueChanged(TextEvent e) {

		l1.setText(tf.getText());
	}
}
public class textFieldP1 {

	public static void main(String[] args) {
		frame3 f=new frame3();
		f.setSize(400,400);
		f.setVisible(true);

	}

}
