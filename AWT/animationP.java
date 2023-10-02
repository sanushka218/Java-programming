import java.awt.*;
import java.awt.event.*;
class framean extends Frame implements Runnable
{
	int x,y,tx,ty;
	
	public framean()	
	{
		x=100;
		y=100;
		tx=ty=1;
		Thread t=new Thread(this);
		t.start();	
	}
	public void paint(Graphics g)
	{
		g.setColor(Color.cyan);
		g.drawOval(x, y, 50, 50);
		g.fillOval(x, y, 50, 50);
	}
	@Override
	public void run() {

	while(true)
	{
		x+=tx;
		y+=ty;
		
			if(x<0 || x>550)
			{
			   tx=tx*(-1);
			}
			if(y<0 || y>450)
			{
				ty=ty*-1;
			}
			repaint();
			try {Thread.sleep(100);}catch(Exception e) {}
	   }
	}
}
public class animationP {

	public static void main(String[] args) {
		framean f=new framean();
		f.setSize(600,500);
		f.setVisible(true);

	}

}
