import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
class sspin extends JFrame implements ActionListener, ListSelectionListener, ChangeListener
{
	JComboBox cb;
	JList li;
	JSpinner sp1,sp2;
	JTextField tf;
	
	sspin()
	{
		super("Spinner Demo");
		String cont[]= {"India","Usa","UK","Australia","Canada"};
		String mon[]= {"Jan","Feb","March","April","May","June","July","August","Sep","Oct","Nov","Dec"};
		String days[]= {"Mon","Tue","Wed","Thur","Fri","Sat","Sun"};
		
		cb=new JComboBox(cont);
		li=new JList(mon);
		li.setVisibleRowCount(5);
		tf=new JTextField(20);
		
		sp1=new JSpinner(new SpinnerNumberModel(1,1,31,1));
		sp2= new JSpinner(new SpinnerListModel(days));
		
		setLayout(new FlowLayout());
		
		add(cb);
		add(sp1);
		add(sp2);
		add(new JScrollPane(li));
		add(tf);
		
		cb.addActionListener(this);
		li.addListSelectionListener(this);
		sp2.addChangeListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		tf.setText((String)cb.getSelectedItem());
	}

	@Override
	public void valueChanged(ListSelectionEvent e) {
			tf.setText((String)li.getSelectedValue());
	}

	@Override
	public void stateChanged(ChangeEvent e) {

	    tf.setText((String)sp2.getValue());
	}
}
public class spinner {

	public static void main(String[] args) {

		sspin s=new sspin();
		s.setSize(400,400);
		s.setVisible(true);
		s.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
