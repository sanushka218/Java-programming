import java.awt.*;
import java.awt.event.*;
class frameM extends Frame
{
	Menu file,sub;
	MenuBar mb;
	MenuItem open,save,close,closeall;
	CheckboxMenuItem auto;
	TextField tf;
	
	public frameM()
	{
		super("menu demo");
		open=new MenuItem("open");
		save=new MenuItem("save");
		close=new MenuItem("close");
		closeall=new MenuItem("closeall");
     
		auto=new CheckboxMenuItem("auto save");
        file=new Menu("file");
        sub=new Menu("close");
        
        file.add(open);
        file.add(save);
        file.add(sub);
        file.add(auto);
        
        sub.add(close);
        sub.add(closeall);
        
        mb=new MenuBar();
        mb.add(file);
        setMenuBar(mb);
        
        tf=new TextField(20);
        setLayout(new FlowLayout());
        add(tf);
        
        open.addActionListener((ActionEvent e)->tf.setText("open"));
        save.addActionListener((ActionEvent e)->tf.setText("save"));
        close.addActionListener((ActionEvent e)->tf.setText("close"));
        closeall.addActionListener((ActionEvent e)->tf.setText("closeall"));

        auto.addItemListener((ItemEvent e)->
        {
        if(auto.getState())
        	tf.setText("Auto on");
        else tf.setText("auto off");
        });
	}
	
}
public class menuP1 {

	public static void main(String[] args) {
		frameM f=new frameM();
		f.setSize(500,500);
		f.setVisible(true);

	}

}
