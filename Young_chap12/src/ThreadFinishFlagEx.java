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

			JLabel label = new JLabel("java");//루프 안에서 JLabel 새 객체 생성해야 여러개 만들어짐
			label.setSize(80, 30);
			label.setLocation(x, y);
			container.add(label);
			//루프 다시 돌면서 새로 만들어질 레이블은 새로운 위치에 다시 그려지만 이전의 위치에 있던 자신의 모양이 남아있음, while루프 다시 돌면서 위치 바뀌니까!!!!!!!!!!
			container.repaint();//컨테이너에 붙이면서 변경된 거 적용해서 다시 그려
			try {
				Thread.sleep(300);//0.3초 텀 두고 java jlabel 위치 바뀜
				if (flag == true) {// 마우스로 누르면 스레드 클래스의finish() 호출되면서 flag=true됨
					container.removeAll();// 이거 안 하면 있던 거 안 지워짐
					label.setText("finish");// 다 지웠으니 새로 만들기 그래서 setText는 안 될듯
					label.setSize(80, 30);
					label.setLocation(100, 100);
					label.setForeground(Color.RED);
					container.add(label);
					// 부모컴포넌트(container , 자식은 jLabel)의 repaint() 호출 ->  부모컨테이너의 모든 내용을 지우고 자식을 다시 그림
					//-> 컴포넌트의 이전 모양이 지워지고 새로 변경된 크기나 위치에 그려짐.
					container.repaint();//바뀐사항 적용해서 다시 그려!
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
		
		th= new RandomThread(c);//컨테이너 인자로 받아서 이것저것 스레드 클래스에서 붙일려고
		th.start();

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ThreadFinishFlagEx();

	}

}
