import java.awt.Color;
import java.awt.Graphics;
import java.awt.Panel;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class paintJPanelEx extends JFrame {
	public paintJPanelEx() {
		// TODO Auto-generated constructor stub
		setTitle("JPanle�� paintComponent() ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new myPanel()); //���� ���� �г� ���̱�
		
		setSize(250,200);
		setVisible(true);
	}
	
	class myPanel extends JPanel{
		@Override
		protected void paintComponent(Graphics g) {
			// TODO Auto-generated method stub
			super.paintComponent(g);
			g.setColor(Color.BLUE);
			g.drawRect(10, 10, 50, 50);//������ x��ǥ, ������ y��ǥ, ���Ұ���
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
