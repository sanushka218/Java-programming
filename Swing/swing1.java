import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class frame1 extends JFrame implements ActionListener
{
	JLabel l;
	JButton b;
	int count=0;
	frame1()
	{
		super("swing demo");
		setLayout(new FlowLayout());
		l=new JLabel("clicked "+count+" times");
		b=new JButton("click");
		add(new JButton("cancel"));
		add(l);
		add(b);
		b.addActionListener(this);
		getRootPane().setDefaultButton(b);
	    // b.setIcon(new ImageIcon("D:/Mini project/WEB-D/personal project/media/2022-11-05 (15).png"));
	    l.setToolTipText("counter");
	}
	@Override
	public void actionPerformed(ActionEvent e) {
          count++;
          l.setText("clicked "+count+" times");
	}
}
public class swing1 {

	public static void main(String[] args) {
        frame1 f=new frame1();
        f.setSize(500,500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
