import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;

import javax.swing.JFrame;
import javax.swing.JLabel;

class myLabel extends JLabel{
	int barSize =0;
	int maxBarSize;
	public myLabel(int maxBarSize) {
		// TODO Auto-generated constructor stub
		this.maxBarSize= maxBarSize;
	}
	
	@Override
	public void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		g.setColor(Color.MAGENTA);
		int width = (int)(((double)(this.getWidth()))/maxBarSize*barSize);
		if(width==0)
			return;
		g.fillRect(0, 0, width, this.getHeight());
	}
	
	synchronized void fill() {
		if(barSize==maxBarSize) {
			try {
				wait();//������ wait�� ���� �ִ� ���� �׷��� try-catch!
			}
			catch (InterruptedException e) {
				return;
		
			}
		}
			barSize++;
			repaint();
			notify();//������ �����
		}
	
	
	synchronized void consume() {
		if(barSize==0) {
			try {
				wait();
			}
			
			catch (InterruptedException e) {
				// TODO: handle exception
				return;
			}
		}
			barSize--;
			repaint();
			notify();
	}
	
}
	
class ConsumerThread extends Thread{
	private myLabel bar;
	
	public ConsumerThread(myLabel bar) {
		// TODO Auto-generated constructor stub
		this.bar=bar;
		
	}
	
	@Override
	public void run() {//������ ������ ���ؾ���
		// TODO Auto-generated method stub
		while(true) {
			try {
				sleep(200);
				bar.consume();
			}
			catch (InterruptedException e) {
				// TODO: handle exception
				return;
			}
		}
	}
}

public class TabAndThreadEx extends JFrame{
	private myLabel bar= new myLabel(100);

	
	
	public TabAndThreadEx(String title) {
		// TODO Auto-generated constructor stub
		setTitle("������ �ǽ�");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c= getContentPane();
		c.setLayout(null);
		bar.setBackground(Color.ORANGE);//���������� �����
		
		bar.setOpaque(true);
		bar.setLocation(20,50);
		bar.setSize(300,20);
		c.add(bar);
		
		c.addKeyListener(new KeyAdapter() {
			public void keyPressed(java.awt.event.KeyEvent e) {
				bar.fill();//key������ �� �����ϵ��� fill()ȣ��
			};
		}
		);
		
		setSize(350,200);
		setVisible(true);
		
		c.setFocusable(true);
		c.requestFocus();
		ConsumerThread th = new ConsumerThread(bar);
		th.start();
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TabAndThreadEx("�ƹ��ų� ���� ���� �� ä���");//�����ڿ� ���ڷ� string title�ް� �ص����� �־��

	}

}
