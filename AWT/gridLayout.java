import java.awt.*;
import java.awt.event.*;
class frame9 extends Frame
{
	Button b1,b2,b3,b4,b5,b6;
	
	public frame9()
	{
		b1=new Button("one");
		b2=new Button("two");
		b3=new Button("three");
		b4=new Button("four");
		b5=new Button("five");
		b6=new Button("six");
		
		setLayout(new GridLayout(2,3));
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
	
	}
}
public class gridLayout {

	public static void main(String[] args) {

		frame9 f =new frame9();
		f.setSize(400,400);
		f.setVisible(true);
	}

}
