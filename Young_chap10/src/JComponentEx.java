import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class JComponentEx extends JFrame{
	public JComponentEx() {
		// TODO Auto-generated constructor stub
		setTitle("JComponet 공통 메소드 예제)");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		
		JButton btn1= new JButton("for test");
		JButton btn2= new JButton("             disabled              ");
		JButton btn3= new JButton("getX(), getY()");
		
		btn1.setBackground(Color.BLACK);
		btn1.setForeground(Color.WHITE);
		btn2.setEnabled(false);
		btn3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				JButton b=(JButton)e.getSource();
				setTitle(b.getX()+","+b.getY());
				
			}
		});
		
		c.add(btn3);
		c.add(btn2);
		c.add(btn1);
		setSize(260,200);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JComponentEx();

	}

}
