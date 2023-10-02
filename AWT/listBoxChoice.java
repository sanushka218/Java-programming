import java.awt.*;
import java.awt.event.*;
class frame5 extends Frame
{
	List l;
	Choice c;
	TextArea t;
	
	public frame5()
	{
		l=new List(5,true);
		c=new Choice();
		t=new TextArea(20,30);
		
		handler5 h=new handler5();
		
		l.add("monday");
		l.add("tuesday");
		l.add("wednesday");
		l.add("thursday");
		l.add("friday");
		l.add("satday");
		l.add("sunday");
		
		c.add("jan");
		c.add("feb");
		c.add("march");
		c.add("april");
		
		setLayout(new FlowLayout());
		
		add(l);
		add(c);
		add(t);
		
		l.addItemListener(h);
		c.addItemListener(h);
		l.addActionListener(h);

	}
	class handler5 implements ItemListener, ActionListener
	{

		@Override
		public void itemStateChanged(ItemEvent e) {

			if(e.getSource()==l)
			{
				t.setText(l.getSelectedItem());
			}
			else
				t.setText(c.getSelectedItem());
		}

		@Override
		public void actionPerformed(ActionEvent e) {

			String list[]=l.getSelectedItems();
			String txt="";
			for(String x:list)
			{
				txt=txt+x+"\n";
			}
			t.setText(txt);
		}
		
	}
}
public class listBoxChoice {

	public static void main(String[] args) {
		frame5 f=new frame5();
		f.setSize(400,400);
		f.setVisible(true);

	}

}
