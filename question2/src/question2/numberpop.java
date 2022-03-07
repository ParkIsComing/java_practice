package question2;

import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

class randomThread extends Thread{
	private Container container;
	
}

public class numberpop extends JFrame {
	public numberpop() {
		// TODO Auto-generated constructor stub
		setTitle("Ten 레이블 클릭");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		
		ClickNumber clickclick =new ClickNumber();
		c.addMouseListener(clickclick);
		

		setSize(500, 500);
		setVisible(true);
	}

	class ClickNumber extends MouseAdapter {
		private JLabel numberlabel;
		private int count=0, num;

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
			
			
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new numberpop();

	}

}
