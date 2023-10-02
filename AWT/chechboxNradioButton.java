import java.awt.*;
import java.awt.event.*;
class frame2 extends Frame implements ItemListener
{
	Label l;
	Checkbox c1,c2,c3;
	CheckboxGroup cb;
	public frame2()
	{
		super("Checkbox demo");
		
		l=new Label(" Nothing is selected ");
		
		cb=new CheckboxGroup();
		
		c1=new Checkbox("Java",false,cb);
		c2=new Checkbox("Python",false,cb);
		c3=new Checkbox("C++",false,cb);

		c1.addItemListener(this);
		c2.addItemListener(this);
		c3.addItemListener(this);

		setLayout(new FlowLayout());
		
		add(l);
		add(c1);
		add(c2);
		add(c3);
	}
	
	@Override
	public void itemStateChanged(ItemEvent e) {

		String str="";
		if(c1.getState())
		{
			str=str+" "+c1.getLabel();
		}
		if(c2.getState())
		{
			str=str+" "+c2.getLabel();
		}
		if(c3.getState())
		{
			str=str+" "+c3.getLabel();
		}
		if(str.isEmpty())
		{
			str="Nothing is selected";
		}
		l.setText(str);
	}
}
public class chechboxNradioButton {

	public static void main(String[] args) {

		frame2 f=new frame2();
		f.setSize(400,400);
		f.setVisible(true);
		
	}

}
