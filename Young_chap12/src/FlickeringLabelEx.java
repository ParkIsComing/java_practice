 import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

class FlickeringLable extends JLabel implements Runnable {
	private long delay;

	public FlickeringLable(String text, long delay) {//JLabel에 들어갈 글이랑 간격 몇초인지 인자로 받음.
		// TODO Auto-generated constructor stub
		super(text);//이 클래스는 jframe안 받아서 settitle은 안되나봄. 
		this.delay = delay;
		setOpaque(true);
		Thread th = new Thread(this);//runnable 상속받은 클래스에서 객체 생성하고 시작하는 거 안하면 메인클래스 생성자에서 두개 만들고 두개 시작해야하니
		th.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int n = 0;
		while (true) {
			if (n == 0)// n이 0이면 yellow로
				setBackground(Color.YELLOW);
			else//n이 이면 pink로
				setBackground(Color.PINK);

			if (n == 0)//깜빡일려면 바뀌어야하니 n이 0이면 1로 바꿔서 다시 핑크로 바뀌게
				n = 1;
			else//vice versa
				n = 0;

			try {
				Thread.sleep(delay);//delay만큼의 간격으로 깜빡이기. delay는 클래스 객체 생성할때마다 인자로 받음
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
		
		//JLable에 flick 들어가게. 깜빡이는 간격 0.5초
		FlickeringLable fLabel = new FlickeringLable("flicks", 500);
		
		JLabel label= new JLabel("no flicks");
		//JLable에 here to 들어가게. 깜빡이는 간격 0.3초
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
