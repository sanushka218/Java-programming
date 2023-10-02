import java.awt.*;
import java.awt.event.*;
class windowadapter extends WindowAdapter
{
	public void windowClosing(WindowEvent e)
	{
		System.exit(0);
	}
}
class frameA extends Frame
{
	public frameA()
	{
		super("adapter");
		addWindowListener(new windowadapter());
	}
		
}
public class adaptarClass {

	public static void main(String[] args) {
		
       frameA f=new frameA();
       f.setSize(500,500);
       f.setVisible(true);
	}

}
