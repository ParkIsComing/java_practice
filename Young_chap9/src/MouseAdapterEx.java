import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;


public class MouseAdapterEx extends JFrame {
	private JLabel la= new JLabel("hello");
	public MouseAdapterEx() {
		// TODO Auto-generated constructor stub
		setTitle("mouse이벤트 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c= getContentPane();
		c.setLayout(null);
		la.setSize(50,20);
		la.setLocation(30,30);
		c.addMouseListener(new MyMouseAdapter());//붙이는 위치 주의
		c.add(la);
		
		setSize(250,250);
		setVisible(true);
	}
	
	class MyMouseAdapter extends MouseAdapter{
		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			int x=e.getX();
			int y=e.getY();
			la.setLocation(x,y);
		}
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MouseAdapterEx();

	}

}
