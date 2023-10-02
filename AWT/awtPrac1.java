import java.awt.*;
class myframe extends Frame
{
	Label l;
	TextField tf;
	Button b;
	
	public myframe()
	{
		super("My app");
		setLayout(new FlowLayout());
		
		l=new Label("name");
		tf=new TextField(20);
		b=new Button("OK");
		
		add(l);
		add(tf);
		add(b);
	}
}
public class awtPrac1 {

	public static void main(String[] args) {

		myframe mf=new myframe();
		mf.setSize(400,400);
		mf.setVisible(true);
	}

}
