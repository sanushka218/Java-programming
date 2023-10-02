import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class frame4 extends JFrame
{
	JCheckBox c1,c2;
	JRadioButton r1,r2;
	JTextField t;
	
	frame4()
	{
		super("demo");
		t=new JTextField("demo",20);
		t.setBounds(10,20,100,80);
		
		c1=new JCheckBox("bold");
		c1.setMnemonic(KeyEvent.VK_B);
	}
}
public class checkNradio {

	public static void main(String[] args) {
		frame4 f=new frame4();
        f.setSize(500,500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
