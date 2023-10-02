import java.awt.*;
import java.awt.event.*;
class frame4 extends Frame
{
	TextArea ta;
	TextField tf;
	Label l;
	Button b;
	
	public frame4()
	{
		l=new Label("No text Entered");
		ta=new TextArea(10,30);
		tf=new TextField(20);
		b=new Button("click");
		
		handler4 h=new handler4();
		
		b.addActionListener(h);
		
		setLayout(new FlowLayout());
		add(ta);
		add(l);
		add(tf);
		add(b);
	}
	
	class handler4 implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e) {

			//l.setText(ta.getSelectedText());
			//ta.append(tf.getText());
		     ta.insert(tf.getText(), ta.getCaretPosition());
		}
		
	}
}
public class textArea {

	public static void main(String[] args) {

		frame4 f=new frame4();
		f.setSize(400,400);
		f.setVisible(true);
	}

}
