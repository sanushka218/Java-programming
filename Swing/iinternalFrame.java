import javax.swing.*;
import java.awt.event.*;
class inf extends JInternalFrame
{
	static int count=0;
	JTextArea ta;
	JScrollPane sp;
	inf()
	{
		super("document"+(++count),true,true,true);
		
		ta=new JTextArea();
		sp=new JScrollPane(ta);
		add(sp);
		
		JMenuBar mb=new JMenuBar();
		JMenu file=new JMenu("File");
		JMenuItem m1=new JMenuItem("save");
		
		file.add(m1);
		mb.add(file);
		setJMenuBar(mb);
		
		setSize(300,300);
		setLocation(50,50);
		setVisible(true);
	}
	
}
class exf extends JFrame implements ActionListener
{
	JDesktopPane jp;
	exf()
	{
		super("Internal Frame demo");
		jp=new JDesktopPane();
		setContentPane(jp);
		
		JMenuBar mb=new JMenuBar();
		JMenu d= new JMenu("document");
		JMenuItem it=new JMenuItem("new");
		
		d.add(it);
		mb.add(d);
		setJMenuBar(mb);
		
		it.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {

		inf intf=new inf();
		jp.add(intf);
	}
}
public class iinternalFrame {

	public static void main(String[] args) {

		exf i=new exf();
		i.setSize(900,900);
		i.setVisible(true);
		i.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
