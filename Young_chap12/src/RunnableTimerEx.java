import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

class TimerRunnable implements Runnable{//runnable �������̽�  ->> implements!!!!!!!!!!
	JLabel timerlabel;
	public TimerRunnable(JLabel timerlabel) {//timerlabel �޴� ������
		// TODO Auto-generated constructor stub
		this.timerlabel =timerlabel;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		int n=0;//ī���Ͱ� �ʱ�ȭ
		while(true) {
			timerlabel.setText(Integer.toString(n));//setText�ϱ� string���� �ٲ��
			n++;
			try {//run �� �� try-catch�� ���!!
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
		setTitle("Runnable�� ������ Ÿ�̸� ������ ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c= getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel timerlabel = new JLabel();
		timerlabel.setFont(new Font("Gothic", Font.ITALIC, 80));
		c.add(timerlabel);
		TimerRunnable runnable = new TimerRunnable(timerlabel);//���ʺ� ��ӹ��� Ŭ���� ��ü ����
		Thread th = new Thread(runnable);//������ ��ü ����  !!����!!
		
		setSize(250,150);
		setVisible(true);
		th.start();//������ ����~~~~~~~~~~~~~~~~~~``
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new RunnableTimerEx();

	}

}
