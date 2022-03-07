import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

import javax.swing.JFrame;

public class VibratingFrame extends JFrame implements Runnable{//스레드 쓸려면 implements Runnable~
	//동시에 jframe도 쓸거니까 extends jFrame implements Runnable
	Thread th;
	public VibratingFrame() {
		// TODO Auto-generated constructor stub
		setTitle("진동하는 프레임 만들기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(200,200);
		setLocation(300,300);
		setVisible(true);
		
		getContentPane().addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				if(!th.isAlive())//스레드 살아있지 않으면
					return;//리턴
				th.interrupt();//살아있으면 멈춰! 스레드 강제 종료
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
			
			int x= getX()+r.nextInt()%5;//0.2초마다 좌표 랜덤하게 뽑아서 ㅈㄴ 흔드는 것처럼 보이게
			int y= getY()+r.nextInt()%5;
			setLocation(x,y);
		}
	}
	

	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new VibratingFrame();

	}

}
