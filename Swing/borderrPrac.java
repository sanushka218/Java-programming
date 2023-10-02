import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
class bbp extends JFrame
{
	JLabel l;
	JTextField tf;
	JButton b;
	JPanel p;
	public bbp()
	{
		super("BORDERS");
		setLayout(new FlowLayout());
		
		l=new JLabel("Name");
		tf=new JTextField(20);
		b=new JButton("OK");
		p=new JPanel();
		
		p.add(l);
		p.add(tf);
		p.add(b);
		
		Border br=BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.blue),"Login", TitledBorder.CENTER,TitledBorder.TOP);
		p.setBorder(br);
		p.setBackground(Color.lightGray);
		add(p);
	}
}
public class borderrPrac {

	public static void main(String[] args) {
		bbp p=new bbp();
		p.setSize(600,600);
		p.setVisible(true);
		p.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
