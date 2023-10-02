import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class chckR extends JFrame implements ActionListener
{
	JCheckBox c1,c2;
	JRadioButton r1,r2;
	JTextField tf;
	public chckR()
	{
	super("CHECK BOX & RADIO BUTTONS");
	setLayout(new FlowLayout());
	
	tf=new JTextField("demo text",20);
	tf.setBounds(10,20,100,80);
	
	c1=new JCheckBox("Bold");
	c1.setMnemonic(KeyEvent.VK_B);
	c2=new JCheckBox("Italic");
	c2.setMnemonic(KeyEvent.VK_I);
	
	r1=new JRadioButton("Upper");
	r2=new JRadioButton("Lower");
	ButtonGroup bg=new ButtonGroup();
	bg.add(r1);
	bg.add(r2);
	
	c1.addActionListener(this);
	c2.addActionListener(this);
	r1.addActionListener(this);
	r2.addActionListener(this);
	
	r1.setActionCommand("Upper");
	r2.setActionCommand("Lower");
	
	add(tf);
	add(c1);
	add(c2);
	add(r1);
	add(r2);
	
	}
	public void actionPerformed(ActionEvent e) {
      
		switch(e.getActionCommand())
		{
		case"Lower":tf.setText(tf.getText().toLowerCase());
				break;
		case "Upper": tf.setText(tf.getText().toUpperCase());
		break;
		}
		
		int b=0,i=0;
		if(c1.isSelected())b=Font.BOLD;
		if(c2.isSelected())i=Font.ITALIC;
		
		Font f=new Font("Times New Roman",b|i,15);
		tf.setFont(f);
	}
}
public class checkRadioButtons {

	public static void main(String[] args) {

		chckR c=new chckR();
		c.setSize(600,600);
		c.setVisible(true);
		c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
