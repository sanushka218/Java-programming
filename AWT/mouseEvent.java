import java.awt.*;
import java.awt.event.*;
class framemouse extends Frame implements MouseListener,MouseMotionListener
{
	Label l,l2;
	public framemouse()
	{
		super("mouse event");
		l=new Label("   ");
		l2=new Label("    ");
        setLayout(null);
        
        l2.setBounds(10,50,100,20);
        l.setBounds(10,80,100,20);
        add(l);
        add(l2);
        
        addMouseListener(this);
        addMouseMotionListener(this);
	}
	@Override
	public void mouseDragged(MouseEvent e) {
        l.setText("mouseDragged");		
		
	}
	@Override
	public void mouseMoved(MouseEvent e) {
        l.setText("mouseMoved");	
        l2.setText("("+e.getX()+" ,"+e.getY()+")");
		
	}
	@Override
	public void mouseClicked(MouseEvent e) {
          l.setText("mouse click");		
	}
	@Override
	public void mousePressed(MouseEvent e) {
        l.setText("mouse Pressed");		
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		 l.setText("mouse Released");	
	}
	@Override
	public void mouseEntered(MouseEvent e) {
        l.setText("mouse Entered");		
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
        l.setText("mouse Exited");		
		
	}
}
public class mouseEvent {

	public static void main(String[] args) {

		framemouse f=new framemouse();
		f.setSize(800,800);
		f.setVisible(true);
	}

}
