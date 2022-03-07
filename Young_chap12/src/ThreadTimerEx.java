import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

class TimerThread extends Thread{
	JLabel timerlabel;
	TimerThread(JLabel timerlabel){
		this.timerlabel=timerlabel;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		int n=0;
		while(true) {
			timerlabel.setText(Integer.toString(n));
			n++;
			try {
				Thread.sleep(1000);
			}
			catch (InterruptedException e) {
				return;
			}
		}
	}
}

public class ThreadTimerEx extends JFrame {
	public ThreadTimerEx() {
		// TODO Auto-generated constructor stub
		setTitle("Thread를 상속받은 타이머 스레드 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel timerlabel = new JLabel();
		c.add(timerlabel);
		
		TimerThread th = new TimerThread(timerlabel);//스레드 객체 생성
		
		setSize(250,150);
		setVisible(true);
		th.start();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ThreadTimerEx();

	}

}
