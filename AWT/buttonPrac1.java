import java.awt.*;
import java.awt.event.*;
class frame1 extends Frame implements ActionListener
{
	int count=0;
	Label l;
	Button b;
	public frame1()
	{
		super("button demo");
		l=new Label("    "+count);
		b=new Button("click");
		
		setLayout(new FlowLayout());
		add(l);
		add(b);
		
		b.addActionListener(this);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {

		count++;
		l.setText("   "+count);
	}
}
public class buttonPrac1 {

	public static void main(String[] args) {
 
		frame1 f=new frame1();
		f.setSize(400,400);
		f.setVisible(true);

	}

}
