import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.TextField;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class TextFieldEx extends JFrame{
	public TextFieldEx() {
		// TODO Auto-generated constructor stub
		setTitle("�ؽ�Ʈ�ʵ� ����� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		
		c.add(new JLabel("�̸�  "));
		c.add(new TextField(20)); //20����ŭ�� �ؽ�Ʈ�ʵ�(20*1)
		c.add(new JLabel("�а�  "));
		c.add(new TextField("��ǻ�Ͱ��а�",20));
		c.add(new JLabel("�ּ�  "));
		c.add(new TextField("����� ��¼��",20));
		
		setSize(250,150);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TextFieldEx();

	}

}
