import javax.swing.*; 
import java.awt.*;
import javax.swing.event.*;
//SLIDER AND PROGRESS BAR
class jsliider extends JFrame implements ChangeListener
{
	JSlider sl;
	JPanel p1,p2;
	JProgressBar pb;
	
	int w=50;
	jsliider()
	{
		sl=new JSlider(JSlider.HORIZONTAL,0,100,50);
		sl.setMajorTickSpacing(10);
		sl.setMinorTickSpacing(1);
		sl.setPaintTicks(true);
		sl.setPaintLabels(true);
		
		pb=new JProgressBar(SwingConstants.HORIZONTAL,0,100);
		pb.setString("0%");
		pb.setStringPainted(true);
		pb.setIndeterminate(false);
		
		p1=new JPanel()
				{
			public void paintComponent(Graphics g)
			{
				g.drawOval(100, 100, w, w);
			}
				};
		
			p2=new JPanel();
			p2.add(pb);
			
			add(sl, BorderLayout.NORTH);
			add(p1, BorderLayout.CENTER);
			add(p2, BorderLayout.SOUTH);
			
			sl.addChangeListener(this);
		
	}
	@Override
	public void stateChanged(ChangeEvent e) {

		w=sl.getValue();
		p1.repaint();
		pb.setString(w+"%");
		pb.setValue(w);
	}
	
}
public class sliider {

	public static void main(String[] args) {

		jsliider j=new jsliider();
		j.setSize(600,600);
		j.setVisible(true);
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
