import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GraphicsDrawLineEx extends JFrame{
	public GraphicsDrawLineEx() {
		// TODO Auto-generated constructor stub
		setTitle("drawLine사용예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(200,150);
		setVisible(true);
		
	}
	
	class myPanel extends JPanel{
		@Override
		protected void paintComponent(Graphics g) {
			// TODO Auto-generated method stub
			super.paintComponent(g);
			g.setColor(Color.RED);
			g.drawLine(20, 20, 100, 100);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GraphicsDrawLineEx();

	}

}
