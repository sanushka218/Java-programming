import javax.swing.*;
import javax.swing.event.*;
import java.awt.Color;
import java.awt.color.*;
class tabb extends JFrame implements ListSelectionListener
{
	JSplitPane sp;
	JList lt;
	JLabel l;
	tabb()
	{
		super("Tab pane");
		String cols[]= {"RED","GREEN","BLUE","BLACK","YELLOW","MAGENTA","ORANGE"};
		lt=new JList(cols);
		lt.setSelectedIndex(0);
		lt.addListSelectionListener(this);
		JScrollPane jp=new JScrollPane(lt);
		
		l=new JLabel(" ");
		l.setBackground(Color.red);
		l.setOpaque(true);
		JScrollPane jp2=new JScrollPane(l);
		
		JTabbedPane jt=new JTabbedPane();
		jt.addTab("Color", jp);
		jt.addTab("Labels", jp2);
		add(jt);
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
public class tabbbedPane {

	public static void main(String[] args) {
		tabb t=new tabb();
		t.setSize(500,500);
		t.setVisible(true);
		t.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
