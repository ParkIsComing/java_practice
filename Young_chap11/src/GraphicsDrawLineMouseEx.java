import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GraphicsDrawLineMouseEx extends JFrame{
	public GraphicsDrawLineMouseEx() {
		// TODO Auto-generated constructor stub
		setTitle("마우스로 여러 개의 선 그리기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new myPanel());
		setSize(300,300);
		setVisible(true);
	}
	
	class myPanel extends JPanel{
		Vector<Point> vstart =new Vector<Point>();
		Vector<Point> vend =new Vector<Point>();
		public myPanel() {
			// TODO Auto-generated constructor stub
			addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent e) {
					// TODO Auto-generated method stub
				Point startp = e.getPoint();
				vstart.add(startp);
				}
				
				@Override
				public void mouseReleased(MouseEvent e) {
					// TODO Auto-generated method stub
					Point endp= e.getPoint();
					vend.add(endp);
					repaint();
				}
			});
			
		}
		
		@Override
		protected void paintComponent(Graphics g) {
			// TODO Auto-generated method stub
			super.paintComponent(g);
			g.setColor(Color.BLUE);
			for(int i=0; i<vstart.size(); i++) {
				Point s= vstart.elementAt(i);
				Point e = vend.elementAt(i);
				g.drawLine((int)s.getX(), (int)s.getY(), (int)e.getX(), (int)e.getY());
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GraphicsDrawLineMouseEx();

	}

}
