import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GraphicsDrawImageEx1 extends JFrame{
	public GraphicsDrawImageEx1() {
		// TODO Auto-generated constructor stub
		setTitle("���� ũ��� ���ϴ� ��ġ�� �̹��� �׸���");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new myPanel());
		
		setSize(300,400);
		setVisible(true);
	}
	
	class myPanel extends JPanel{
		ImageIcon icon= new ImageIcon("images/image0.jpg");//imageicon ��ü ����
		Image img = icon.getImage();//�̹��� �ε� 
		
		@Override
		protected void paintComponent(Graphics g) {
			// TODO Auto-generated method stub
			super.paintComponent(g);
			g.drawImage(img, 20, 20, this);
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GraphicsDrawImageEx1();

	}

}
