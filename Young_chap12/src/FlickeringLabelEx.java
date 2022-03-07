 import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

class FlickeringLable extends JLabel implements Runnable {
	private long delay;

	public FlickeringLable(String text, long delay) {//JLabel�� �� ���̶� ���� �������� ���ڷ� ����.
		// TODO Auto-generated constructor stub
		super(text);//�� Ŭ������ jframe�� �޾Ƽ� settitle�� �ȵǳ���. 
		this.delay = delay;
		setOpaque(true);
		Thread th = new Thread(this);//runnable ��ӹ��� Ŭ�������� ��ü �����ϰ� �����ϴ� �� ���ϸ� ����Ŭ���� �����ڿ��� �ΰ� ����� �ΰ� �����ؾ��ϴ�
		th.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int n = 0;
		while (true) {
			if (n == 0)// n�� 0�̸� yellow��
				setBackground(Color.YELLOW);
			else//n�� �̸� pink��
				setBackground(Color.PINK);

			if (n == 0)//�����Ϸ��� �ٲ����ϴ� n�� 0�̸� 1�� �ٲ㼭 �ٽ� ��ũ�� �ٲ��
				n = 1;
			else//vice versa
				n = 0;

			try {
				Thread.sleep(delay);//delay��ŭ�� �������� �����̱�. delay�� Ŭ���� ��ü �����Ҷ����� ���ڷ� ����
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				return;
			}
		}

	}

}

public class FlickeringLabelEx extends JFrame {
	public FlickeringLabelEx() {
		// TODO Auto-generated constructor stub
		setTitle("flickeringlabel ex");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		//JLable�� flick ����. �����̴� ���� 0.5��
		FlickeringLable fLabel = new FlickeringLable("flicks", 500);
		
		JLabel label= new JLabel("no flicks");
		//JLable�� here to ����. �����̴� ���� 0.3��
		FlickeringLable fLabel2= new FlickeringLable("here too", 300);
		
		c.add(fLabel);
		c.add(label);
		c.add(fLabel2);
		

		setSize(300, 150);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new FlickeringLabelEx();

	}

}
