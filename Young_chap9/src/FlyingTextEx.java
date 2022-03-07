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
				case KeyEvent.VK_LEFT://����Ű�ڵ�� keyEventŬ������ ����� ����Ǿ�����
					la.setLocation(la.getX()-FLYING_UNIT, la.getY());
					break;//���������..
				case KeyEvent.VK_RIGHT://����Ű�ڵ�� keyEventŬ������ ����� ����Ǿ�����
					la.setLocation(la.getX()+FLYING_UNIT, la.getY());
					break;
				case KeyEvent.VK_UP://����Ű�ڵ�� keyEventŬ������ ����� ����Ǿ�����
					la.setLocation(la.getX(), la.getY()-FLYING_UNIT);
					break;
				
				case KeyEvent.VK_DOWN://����Ű�ڵ�� keyEventŬ������ ����� ����Ǿ�����
					la.setLocation(la.getX(), la.getY()+FLYING_UNIT);
					break;
					
				}
			}
		});
		
		setSize(300,300);
		setVisible(true);
		c.setFocusable(true);//Ű�̺�Ʈ�� ���� ��Ŀ���� ���� ������Ʈ�� ���� �� ����
		c.requestFocus();
		
		c.addMouseListener(new MouseAdapter() {//���콺�� ������Ʈ Ŭ���Ҷ� ��Ŀ�� ����
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
