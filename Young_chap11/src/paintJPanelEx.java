import java.awt.Color;
import java.awt.Graphics;
import java.awt.Panel;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class paintJPanelEx extends JFrame {
	public paintJPanelEx() {
		// TODO Auto-generated constructor stub
		setTitle("JPanle의 paintComponent() 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new myPanel()); //내가 만든 패널 붙이기
		
		setSize(250,200);
		setVisible(true);
	}
	
	class myPanel extends JPanel{
		@Override
		protected void paintComponent(Graphics g) {
			// TODO Auto-generated method stub
			super.paintComponent(g);
			g.setColor(Color.BLUE);
			g.drawRect(10, 10, 50, 50);//시작점 x좌표, 시작점 y좌표, 더할값둘
			g.drawRect(50, 50, 50, 50);
		
			g.setColor(Color.MAGENTA);
			g.drawRect(90, 90, 50, 50);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new paintJPanelEx();

	}

}
