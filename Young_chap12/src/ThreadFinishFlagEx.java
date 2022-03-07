import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

class RandomThread extends Thread {
	private Container container;
	private boolean flag = false;

	public RandomThread(Container container) {
		// TODO Auto-generated constructor stub
		this.container = container;
	}

	void finish() {
		flag = true;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		while (true) {
			int x = ((int) (Math.random() * container.getWidth()));
			int y = ((int) (Math.random() * container.getHeight()));

			JLabel label = new JLabel("java");//���� �ȿ��� JLabel �� ��ü �����ؾ� ������ �������
			label.setSize(80, 30);
			label.setLocation(x, y);
			container.add(label);
			//���� �ٽ� ���鼭 ���� ������� ���̺��� ���ο� ��ġ�� �ٽ� �׷����� ������ ��ġ�� �ִ� �ڽ��� ����� ��������, while���� �ٽ� ���鼭 ��ġ �ٲ�ϱ�!!!!!!!!!!
			container.repaint();//�����̳ʿ� ���̸鼭 ����� �� �����ؼ� �ٽ� �׷�
			try {
				Thread.sleep(300);//0.3�� �� �ΰ� java jlabel ��ġ �ٲ�
				if (flag == true) {// ���콺�� ������ ������ Ŭ������finish() ȣ��Ǹ鼭 flag=true��
					container.removeAll();// �̰� �� �ϸ� �ִ� �� �� ������
					label.setText("finish");// �� �������� ���� ����� �׷��� setText�� �� �ɵ�
					label.setSize(80, 30);
					label.setLocation(100, 100);
					label.setForeground(Color.RED);
					container.add(label);
					// �θ�������Ʈ(container , �ڽ��� jLabel)�� repaint() ȣ�� ->  �θ������̳��� ��� ������ ����� �ڽ��� �ٽ� �׸�
					//-> ������Ʈ�� ���� ����� �������� ���� ����� ũ�⳪ ��ġ�� �׷���.
					container.repaint();//�ٲ���� �����ؼ� �ٽ� �׷�!
					return;
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				return;
			}

		}
	}
}

public class ThreadFinishFlagEx extends JFrame {
	private RandomThread th;
	public ThreadFinishFlagEx() {
		// TODO Auto-generated constructor stub
		setTitle("threadFinishEx ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		c.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				th.finish();
				

			}
		});

		setSize(300, 200);
		setVisible(true);
		
		th= new RandomThread(c);//�����̳� ���ڷ� �޾Ƽ� �̰����� ������ Ŭ�������� ���Ϸ���
		th.start();

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ThreadFinishFlagEx();

	}

}
