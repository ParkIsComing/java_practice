import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class LabelEx extends JFrame {
	public LabelEx() {
		// TODO Auto-generated constructor stub
		setTitle("레이블 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c= getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel textlabel = new JLabel("timothee");
		
		ImageIcon timothee = new ImageIcon("images/timothee.jfif");
		JLabel imagelabel = new JLabel(timothee);
		
		ImageIcon icon = new ImageIcon("images/icon.gif");
		JLabel label = new JLabel("call", icon, SwingConstants.CENTER);// 
		
		c.add(textlabel);
		c.add(imagelabel);
		c.add(label);
		
		setSize(700,1000);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new LabelEx();

	}

}
