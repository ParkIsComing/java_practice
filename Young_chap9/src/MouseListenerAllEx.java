import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseListenerAllEx extends JFrame{
	private JLabel la= new JLabel("move");
	public MouseListenerAllEx() {
		// TODO Auto-generated constructor stub
		setTitle("MouseListener¿Í MouseMotionListener ¿¹Á¦");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c= getContentPane();
		c.setLayout(null);
		la.setSize(80,20);
		la.setLocation(100,81);
		c.add(la);
		myMouselistenere listener = new myMouselistenere();
		c.addMouseListener(listener);
		c.addMouseMotionListener(listener);
		
		setSize(320,200);
		setVisible(true);
		
		
		
	}
	
	class myMouselistenere implements MouseListener, MouseMotionListener{

		@Override
		public void mouseDragged(MouseEvent e) {
			// TODO Auto-generated method stub
			la.setText("mouseDragged(" + e.getX() + "," + e.getY() + "");
		}

		@Override
		public void mouseMoved(MouseEvent e) {
			// TODO Auto-generated method stub
			la.setText("mouseMoved(" + e.getX() + "," + e.getY() + "");

			
		}

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			la.setText("mousePressed(" + e.getX() + "," + e.getY() + "");
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			la.setText("mouseReleased(" + e.getX() + "," + e.getY() + "");
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			Component c= (Component)e.getSource();
			c.setBackground(Color.CYAN);
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
		Component c= (Component)e.getSource();
			c.setBackground(Color.YELLOW);
			
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MouseListenerAllEx();

	}

}
