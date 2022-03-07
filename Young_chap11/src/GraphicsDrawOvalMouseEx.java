import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GraphicsDrawOvalMouseEx extends JFrame {
	public GraphicsDrawOvalMouseEx() {
		// TODO Auto-generated constructor stub
		setTitle("마우스 드래깅으로 타원 그리기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new myPanel());
		setSize(300,300);
		setVisible(true);
		
	}

	class myPanel extends JPanel{
		Point start = null;
		Point end=null;//좌표 받는용
		public myPanel() {
			// TODO Auto-generated constructor stub
			myMouseListener listener = new myMouseListener();
			addMouseListener(listener);
			addMouseMotionListener(listener);
		}
		class myMouseListener extends MouseAdapter{
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				start = e.getPoint();
			}
			
			@Override
			public void mouseDragged(MouseEvent e) {
				// TODO Auto-generated method stub
				end=e.getPoint();
				repaint();//다시 그려지게 이때 paintcomponent는 호출됨
			}
	}
		
		@Override
		protected void paintComponent(Graphics g) {
			// TODO Auto-generated method stub
			super.paintComponent(g);
			if(start==null)//타원이 안 만들어짐
				return;
			g.setColor(Color.BLUE);
			int x=Math.min(start.x, end.x);
			int y=Math.min(start.y, end.y);
			int width=Math.abs(start.x-end.x);
			int height = Math.abs(start.y-end.y);
			g.drawOval(x, y, width, height);
			
		}
	
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GraphicsDrawOvalMouseEx();

	}

}
