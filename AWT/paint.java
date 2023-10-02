import java.awt.*;
import java.awt.event.*;

class frameP extends Frame
{
    int x=0,y=0;
    
    frameP()
    {
        super("Painting Demo");
        
        addMouseMotionListener(new MouseAdapter(){
         public void mouseMoved(MouseEvent me)
         {
             x=me.getX();
             y=me.getY();
             repaint();
         }
    });
        
   }
    public void paint(Graphics g)
    {
        g.setColor(Color.MAGENTA);
        g.setFont(new Font("Luminari",Font.BOLD,30));
        g.drawString("Hello", x, y);
    }
}
public class paint {

	public static void main(String[] args) {
	   frameP p=new frameP();
	   p.setSize(500,500);
	   p.setVisible(true);

	}

}
