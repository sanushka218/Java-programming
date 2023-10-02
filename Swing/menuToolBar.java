import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.awt.image.*;
class mtb extends JFrame
{
	JToolBar tb;
	JButton b1,b2,b3,b4,b5,b6,b7;
	JTextArea ta;
	
	mtb()
	{
		super("MENU & TOOLBAR");
		tb=new JToolBar();
		
	
		b1=new JButton(new ImageIcon(new ImageIcon("D:/WEB-D/personal project/media/Cool wallpaper.png").getImage().getScaledInstance(100, 100, java.awt.Image.SCALE_DEFAULT)));
		b2=new JButton(new ImageIcon(new ImageIcon("D:/WEB-D/personal project/media/download (1).png").getImage().getScaledInstance(100, 100, java.awt.Image.SCALE_DEFAULT)));
		b3=new JButton(new ImageIcon(new ImageIcon("D:/WEB-D/personal project/media/2023-02-04 (2).png").getImage().getScaledInstance(100, 100, java.awt.Image.SCALE_DEFAULT)));
		b4=new JButton(new ImageIcon(new ImageIcon("D:/WEB-D/personal project/media/2022-11-05 (9).png").getImage().getScaledInstance(100, 100, java.awt.Image.SCALE_DEFAULT)));
		b5=new JButton(new ImageIcon(new ImageIcon("D:/WEB-D/personal project/media/2023-02-03 (3).png").getImage().getScaledInstance(100, 100, java.awt.Image.SCALE_DEFAULT)));
		b6=new JButton(new ImageIcon(new ImageIcon("D:/WEB-D/personal project/media/Gabe.png").getImage().getScaledInstance(100, 100, java.awt.Image.SCALE_DEFAULT)));
		b7=new JButton(new ImageIcon(new ImageIcon("D:/WEB-D/personal project/media/wallpaper para pc de brooklyn 99.png").getImage().getScaledInstance(100, 100, java.awt.Image.SCALE_DEFAULT)));
		
		tb.add(b1);
		tb.add(b2);tb.add(b3);tb.add(b4);
		tb.add(new JToolBar.Separator());
		tb.add(b5);tb.add(b6);tb.add(b7);
		 
		
		ta=new JTextArea();
		JScrollPane jp=new JScrollPane(ta);
	
		add(tb,BorderLayout.NORTH);
		add(jp,BorderLayout.CENTER);
	
		
	}
}
public class menuToolBar {

	public static void main(String[] args) {

		mtb m=new mtb();
		m.setSize(1000,1000);
		m.setVisible(true);
		m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
