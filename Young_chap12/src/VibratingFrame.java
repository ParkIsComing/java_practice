import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

import javax.swing.JFrame;

public class VibratingFrame extends JFrame implements Runnable{//������ ������ implements Runnable~
	//���ÿ� jframe�� ���Ŵϱ� extends jFrame implements Runnable
	Thread th;
	public VibratingFrame() {
		// TODO Auto-generated constructor stub
		setTitle("�����ϴ� ������ �����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(200,200);
		setLocation(300,300);
		setVisible(true);
		
		getContentPane().addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				if(!th.isAlive())//������ ������� ������
					return;//����
				th.interrupt();//��������� ����! ������ ���� ����
			}
		});
		
		th=new Thread(this);
		th.start();
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		Random r=new Random();
		while(true) {
			try {
				Thread.sleep(20);
			}
			catch (InterruptedException e) {
				return;
			
			}
			
			int x= getX()+r.nextInt()%5;//0.2�ʸ��� ��ǥ �����ϰ� �̾Ƽ� ���� ���� ��ó�� ���̰�
			int y= getY()+r.nextInt()%5;
			setLocation(x,y);
		}
	}
	

	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new VibratingFrame();

	}

}
