import java.awt.*;
import java.awt.event.*;
class framw extends Frame implements WindowListener
{
	Label l;
	public framw()
	{
		super("window");
		l=new Label("         ");
		setLayout(new FlowLayout());
		add(l);
		addWindowListener(this);
	}
	
	@Override
	public void windowOpened(WindowEvent e) {
		 l.setText("indowOpened");
	}
	@Override
	public void windowClosing(WindowEvent e) {
		 l.setText("windowClosing");
		 System.exit(0);
		
	}
	@Override
	public void windowClosed(WindowEvent e) {
		 l.setText("windowClosed");
		
	}
	@Override
	public void windowIconified(WindowEvent e) {
		 l.setText("windowIconified");
		
	}
	@Override
	public void windowDeiconified(WindowEvent e) {
		 l.setText("windowDeiconified");
		
	}
	@Override
	public void windowActivated(WindowEvent e) {
		 l.setText("windowActivated");
		
	}
	@Override
	public void windowDeactivated(WindowEvent e) {
		 l.setText("windowDeactivated");
		
	}
}
public class windowEvent {

	public static void main(String[] args) {

		framw f=new framw();
		f.setSize(500,500);
		f.setVisible(true);
	}

}
