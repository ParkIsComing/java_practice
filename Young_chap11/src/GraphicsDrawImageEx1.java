import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GraphicsDrawImageEx1 extends JFrame{
	public GraphicsDrawImageEx1() {
		// TODO Auto-generated constructor stub
		setTitle("원본 크기로 원하는 위치에 이미지 그리기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new myPanel());
		
		setSize(300,400);
		setVisible(true);
	}
	
	class myPanel extends JPanel{
		ImageIcon icon= new ImageIcon("images/image0.jpg");//imageicon 객체 생성
		Image img = icon.getImage();//이미지 로딩 
		
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
