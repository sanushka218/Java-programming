import javax.swing.*;
import javax.swing.event.*;
import java.awt.Color;
import java.awt.color.*;
class splitt extends JFrame implements ListSelectionListener
{
	JSplitPane sp;
	JList lt;
	JLabel l;
	splitt()
	{
		super("Split pane");
		String cols[]= {"RED","GREEN","BLUE","BLACK","YELLOW","MAGENTA","ORANGE"};
		lt=new JList(cols);
		lt.setSelectedIndex(0);
		lt.addListSelectionListener(this);
		JScrollPane jp=new JScrollPane(lt);
		
		l=new JLabel(" ");
		l.setBackground(Color.red);
		l.setOpaque(true);
		JScrollPane jp2=new JScrollPane(l);
		
		sp=new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,jp,jp2);
		sp.setDividerLocation(250);
		add(sp);
	}
	@Override
	public void valueChanged(ListSelectionEvent e) {
 
		String str= (String)lt.getSelectedValue();
		switch(str)
		{
		case "RED":l.setBackground(Color.red);
		break;
		case "GREEN":l.setBackground(Color.green);
		break;
		case "BLUE":l.setBackground(Color.BLUE);
		break;
		case "BLACK":l.setBackground(Color.BLACK);
		break;
		case "YELLOW":l.setBackground(Color.YELLOW);
		break;
		case "MAGENTA":l.setBackground(Color.MAGENTA);
		break;
		case "ORANGE":l.setBackground(Color.ORANGE);
		break;
		}
		
	}
}
public class spplitPane {

	public static void main(String[] args) {

		splitt s=new splitt();
		s.setSize(900,900);
		s.setVisible(true);
		s.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
