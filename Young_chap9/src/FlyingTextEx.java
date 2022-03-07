import java.awt.Component;
import java.awt.Container;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class FlyingTextEx extends JFrame{
	private JLabel la= new JLabel("hello");
	private final int FLYING_UNIT =10;
	
	public FlyingTextEx() {
		// TODO Auto-generated constructor stub
		setTitle("flyingtext ex");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c= getContentPane();
		c.setLayout(null);
		la.setLocation(50,50);
		la.setSize(100,20);
		c.add(la);
		c.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				int keyCode= e.getKeyCode();
				switch(keyCode){
				case KeyEvent.VK_LEFT://가상키코드는 keyEvent클래스에 상수로 선언되어있음
					la.setLocation(la.getX()-FLYING_UNIT, la.getY());
					break;//까먹지마라..
				case KeyEvent.VK_RIGHT://가상키코드는 keyEvent클래스에 상수로 선언되어있음
					la.setLocation(la.getX()+FLYING_UNIT, la.getY());
					break;
				case KeyEvent.VK_UP://가상키코드는 keyEvent클래스에 상수로 선언되어있음
					la.setLocation(la.getX(), la.getY()-FLYING_UNIT);
					break;
				
				case KeyEvent.VK_DOWN://가상키코드는 keyEvent클래스에 상수로 선언되어있음
					la.setLocation(la.getX(), la.getY()+FLYING_UNIT);
					break;
					
				}
			}
		});
		
		setSize(300,300);
		setVisible(true);
		c.setFocusable(true);//키이벤트는 현재 포커스를 가진 컴포넌트만 받을 수 있음
		c.requestFocus();
		
		c.addMouseListener(new MouseAdapter() {//마우스로 컴포넌트 클릭할때 포커스 지정
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				Component c=(Component)e.getSource();
				c.setFocusable(true);
				c.requestFocus();
			}
		});
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new FlyingTextEx();

	}

}
