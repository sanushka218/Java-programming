import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class jp extends JFrame implements ActionListener
{
	JRadioButton r1,r2,r3;
	JLayeredPane lp;
	JLabel l1,l2,l3,l4;
	
	jp()
	{
		r1=new JRadioButton("red");
		r2=new JRadioButton("blue");
		r3=new JRadioButton("green");
		ButtonGroup bg=new ButtonGroup();
		bg.add(r1);
		bg.add(r2);
		bg.add(r3);
		r1.addActionListener(this);
		r2.addActionListener(this);
		r3.addActionListener(this);
		
		JPanel p1=new JPanel();
		p1.add(r1);
		p1.add(r2);
		p1.add(r3);
		
		l1=new JLabel("Red");
		l1.setBounds(10,10,200,200);
		l1.setBackground(Color.red);
		l1.setOpaque(true);
		
		l2=new JLabel("blue");
		l2.setBounds(50,50,250,250);
		l2.setBackground(Color.blue);
		l2.setOpaque(true);
		
		l3=new JLabel("green");
		l3.setBounds(70,70,300,300);
		l3.setBackground(Color.green);
		l3.setOpaque(true);
		
		l4=new JLabel(" ");
		l4.setBounds(100,100,50,50);
		l4.setBackground(Color.black);
		l4.setOpaque(true);
		
		lp=new JLayeredPane();
		lp.add(l1,new Integer(0));
		lp.add(l2, new Integer(1));
		lp.add(l3, new Integer(2));
		lp.add(l4, new Integer(3));
 
		add(p1,BorderLayout.NORTH);
		add(lp, BorderLayout.CENTER);
		
		addMouseMotionListener(new MouseAdapter()
				{
					public void mouseMoved(MouseEvent me)
					{
						l4.setLocation(me.getX(),me.getY());
					}
				});
		
	}
	
	public void actionPerformed(ActionEvent e) {
		
		if(r1.isSelected())lp.setLayer(l4,1);
		if(r2.isSelected())lp.setLayer(l4,2);
		if(r3.isSelected())lp.setLayer(l4,3);
	}
	
}
public class layerredPane {

	public static void main(String[] args) {
		jp j=new jp();
		j.setSize(700,700);
		j.setVisible(true);
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
