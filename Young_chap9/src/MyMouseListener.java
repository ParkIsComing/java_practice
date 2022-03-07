import java.awt.Container;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyMouseListener extends JFrame {
	private JLabel la = new JLabel("hello");
	
	public MyMouseListener() {
		// TODO Auto-generated constructor stub
		setTitle("mouse이벤트 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c=getContentPane();
		c.setLayout(null);
		c.addMouseListener(new mouselistener());
		la.setSize(50,20);
		la.setLocation(30,30);
		c.add(la);
		
		setSize(250,250);
		setVisible(true);
		
		}
	class mouselistener implements MouseListener{

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			int x=e.getX();
			int y=e.getY();
			la.setLocation(x,y);
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new MyMouseListener();
	}

}
