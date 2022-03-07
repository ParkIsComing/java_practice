import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class NullContainerEx extends JFrame {
	public NullContainerEx() {
		// TODO Auto-generated constructor stub
		setTitle("null container ex");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c= getContentPane();
		c.setLayout(null);
		
		JLabel la= new JLabel("press button");
		la.setLocation(130,50);//��ġ�� ������ ���ϰ� ���̱�
		la.setSize(200,20);
		
		c.add(la);
		
		for(int i=0;i<=9;i++) {
			JButton b= new JButton(Integer.toString(i));//��ư���� String�� ��������
			b.setLocation(i*15, i*15);
			b.setSize(50,20);
			c.add(b);
		}
		
		setSize(300,200);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new NullContainerEx();

	}

}
