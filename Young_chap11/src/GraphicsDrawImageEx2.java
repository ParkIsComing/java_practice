import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GraphicsDrawImageEx2 extends JFrame {
	public GraphicsDrawImageEx2() {
		// TODO Auto-generated constructor stub
		setTitle("패널 크기에 맞춰 이미지 그리기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new myPanel());
		
		setSize(200,300);
		setVisible(true);
	}
	class myPanel extends JPanel{
		ImageIcon icon = new ImageIcon("images/image0.jpg");
		Image img = icon.getImage();
		
		@Override
		protected void paintComponent(Graphics g) {
			// TODO Auto-generated method stub
			super.paintComponent(g);
			g.drawImage(img, 0, 0, getWidth(), getHeight(), this);//패널의 폭 getwidth() 높이 getheight()
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GraphicsDrawImageEx2();

	}

}
