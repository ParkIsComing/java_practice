import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GraphicsColorFontEx extends JFrame{
	public GraphicsColorFontEx() {
		// TODO Auto-generated constructor stub
		setTitle("���ڿ�, color font, font ��뿹��");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new myPanel());
		
		setSize(300,300);
		setVisible(true);
	}
	
	class myPanel extends JPanel{
		@Override
		protected void paintComponent(Graphics g) {
			// TODO Auto-generated method stub
			super.paintComponent(g);
			g.setColor(Color.BLUE);
			g.drawString("�ڹ� ���巷", 30, 30);
			
			g.setColor(new Color(255,0,0));//�̷��� new�� ���μ��� ���� colorŬ����,fontŬ���� ������
			g.setFont(new Font("Arial", Font.ITALIC,30));
			g.drawString("wanna sleep", 30, 70);
			g.setColor(new Color(0x00ff00ff));
			for(int i=0;i<4;i++) {
				g.setFont(new Font("Jokerman", Font.ITALIC, i*10));
				g.drawString("hello", 30, 60+i*40);
				
			}
			
		
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GraphicsColorFontEx();

	}

}
