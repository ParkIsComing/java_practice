import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class RadioButtonEx extends JFrame {
	public RadioButtonEx() {
		// TODO Auto-generated constructor stub
		setTitle("������ư ����� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		
		ButtonGroup g = new ButtonGroup();//��ư �׷� ��ü ����
		
		JRadioButton apple = new JRadioButton("���");
		JRadioButton pear = new JRadioButton("��",true);
		JRadioButton cherry = new JRadioButton("ü��");
		
		g.add(cherry);//��ư�׷쿡 3���� ������ư ����
		g.add(apple);
		g.add(pear);
		
		//�����̳ʿ��� ������ư ���� �ٿ�����
		c.add(apple);//�����̳ʿ� ���̴� ������� ����
		c.add(cherry);
		c.add(pear);
		
		setSize(250,150);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new RadioButtonEx();

	}

}
