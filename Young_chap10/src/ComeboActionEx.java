import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ComeboActionEx extends JFrame {
	String [] fruits = {"apple","banna","mango"};
	ImageIcon [] images = {new ImageIcon("images/apple.jpg"),new ImageIcon("images/banana.jpg"),
			new ImageIcon("images/mango.jpg")};
	JLabel imgLabel = new JLabel(images[0]);//ó���� ��� imageicon�� jlabel�� �ٿ��� ������
	
	public ComeboActionEx() {
		// TODO Auto-generated constructor stub
		setTitle("�޺��ڽ� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		
		
		JComboBox<String> combo =new JComboBox<String>(fruits);//jcombobox �����ϰ� �ű⿡ ���� string�迭 ���̱�
		c.add(combo);
		c.add(imgLabel);
		
	//�޺� �ڽ��� ������ ������ ����Ǹ� ȣ��ȴ�.
		combo.addActionListener(new ActionListener() {//������ �� �� �����Ÿ� actionlistener�� ����~
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JComboBox<String> cb =(JComboBox<String>)e.getSource();// action�̺�Ʈ�� �߻��� �޺��ڽ� �˾Ƴ���
				int index=cb.getSelectedIndex();//�޺��ڽ����� �� �����ߴ��� �˷��� �̷��� �� ������ ���ļ� ���°���� �����ߴ��� �˾ƾ�
				imgLabel.setIcon(images[index]);// �� �ε����� �̹����������� JLabel�� ���
				
			}
		});
		
		setSize(300,250);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ComeboActionEx();

	}

}
