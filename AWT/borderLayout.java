import java.awt.*;
import java.awt.event.*;
class frame8 extends Frame
{
	Button b1,b2,b3,b4,b5,b6;
	
	public frame8()
	{
		b1=new Button("one");
		b2=new Button("two");
		b3=new Button("three");
		b4=new Button("four");
		b5=new Button("five");
		b6=new Button("six");
		
		add(b1,BorderLayout.NORTH);
		//add(b2,BorderLayout.EAST);
		add(b3,BorderLayout.WEST);
		add(b4,BorderLayout.SOUTH);
		add(b5,BorderLayout.CENTER);
		//add(b6);
		
		Panel p=new Panel();
		p.setLayout(new GridLayout(3,1));
		p.add(new Button("hi"));
		p.add(new Button("bye"));
		p.add(new Button("try"));
        add(p,BorderLayout.EAST);
	}
}

public class borderLayout {

	public static void main(String[] args) {

		frame8 f =new frame8();
		f.setSize(400,400);
		f.setVisible(true);
	}

}
