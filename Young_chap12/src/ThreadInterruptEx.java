import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

class TimerRunnable1 implements Runnable {
	private JLabel timerLabel = new JLabel();

	public TimerRunnable1(JLabel timerLabel) {
		// TODO Auto-generated constructor stub
		this.timerLabel = timerLabel;

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int n = 0;
		while (true) {
			timerLabel.setText(Integer.toString(n));
			n++;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				return;
			}

		}

	}
}

public class ThreadInterruptEx extends JFrame {
	public Thread th;
	public ThreadInterruptEx() {
		// TODO Auto-generated constructor stub
		setTitle("threadInterruptEx 예졔");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		JLabel timerLabel = new JLabel();
		TimerRunnable1 runnable = new TimerRunnable1(timerLabel);
		th=new Thread(runnable);//스레드 생성 start해야 시작함
		c.add(timerLabel);
		
		JButton btn = new JButton("kill timer");
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				th.interrupt();//스레드 강제 종료
				JButton b = (JButton)e.getSource();
				b.setEnabled(false);
				
			}
		});
		
		c.add(btn);
		setSize(300,170);
		setVisible(true);
		
		th.start();//빼먹지마라!!!!!!!!11

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ThreadInterruptEx();

	}

}
