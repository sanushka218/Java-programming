import java.awt.*;
import java.awt.event.*;
class frame10 extends Frame
{
	Button b1,b2,b3,b4,b5,b6;
	
	public frame10()
	{
		b1=new Button("one");
		b2=new Button("two");
		b3=new Button("three");
		b4=new Button("four");
		b5=new Button("five");
		b6=new Button("six");
		
		GridBagLayout gb=new GridBagLayout();
		GridBagConstraints gbc=new GridBagConstraints();
		
		setLayout(gb);
		
		gbc.gridx=1;
		gbc.gridy=1;
		add(b1,gbc);
		
		gbc.gridx=3;
		gbc.gridy=1;
		add(b2,gbc);
		
		gbc.gridx=2;
		gbc.gridy=2;
		add(b3,gbc);
		
		gbc.gridx=1;
		gbc.gridy=3;
		add(b4,gbc);
		
		gbc.gridx=3;
		gbc.gridy=3;
		add(b5,gbc);
		
		gbc.gridx=2;
		gbc.gridy=4;
		add(b6,gbc);
	
	}
}
public class gridbagLayout {

	public static void main(String[] args) {
	  
		frame10 f =new frame10();
		f.setSize(400,400);
		f.setVisible(true);

	}

}
