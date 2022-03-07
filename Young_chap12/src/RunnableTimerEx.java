import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

class TimerRunnable implements Runnable{//runnable 인터페이스  ->> implements!!!!!!!!!!
	JLabel timerlabel;
	public TimerRunnable(JLabel timerlabel) {//timerlabel 받는 생성자
		// TODO Auto-generated constructor stub
		this.timerlabel =timerlabel;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		int n=0;//카운터값 초기화
		while(true) {
			timerlabel.setText(Integer.toString(n));//setText니까 string으로 바꿔야
			n++;
			try {//run 쓸 땐 try-catch문 써라!!
				Thread.sleep(1000);
			}
			catch (InterruptedException e) {
				return;
			}
		}
	}
}

public class RunnableTimerEx extends JFrame{
	public RunnableTimerEx() {
		// TODO Auto-generated constructor stub
		setTitle("Runnable을 구현한 타이머 스레드 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c= getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel timerlabel = new JLabel();
		timerlabel.setFont(new Font("Gothic", Font.ITALIC, 80));
		c.add(timerlabel);
		TimerRunnable runnable = new TimerRunnable(timerlabel);//러너블 상속받은 클래스 객체 생성
		Thread th = new Thread(runnable);//스레드 객체 생성  !!주의!!
		
		setSize(250,150);
		setVisible(true);
		th.start();//무조건 시작~~~~~~~~~~~~~~~~~~``
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new RunnableTimerEx();

	}

}
