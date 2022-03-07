import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CheckBoxItemEventEx extends JFrame {

	private JCheckBox[] fruits = new JCheckBox[3];//jcheckbox�� �迭����� ���ҵ� ���� ��ü�̹Ƿ� �̵� new�����
	private String[] names = { "���", "��", "ü��" };
	private JLabel sumLabel;

	public CheckBoxItemEventEx() {
		// TODO Auto-generated constructor stub
		setTitle("üũ�ڽ��� ItemEvent ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		c.add(new JLabel("��� 100,�� 500, ü�� 2000"));
		MyItemListener listener = new MyItemListener();// fruits[i]���� ������ �����ϸ� sum ����x
		// �׷��� forloop ���� ���� ������ ��ü ��������
		for (int i = 0; i < fruits.length;i++) {
			fruits[i] = new JCheckBox(names[i]);//�迭�� String �־��൵ ��. �׳� �迭�ε����� �̸� ��������.
			fruits[i].setBorderPainted(true);
			c.add(fruits[i]);
			fruits[i].addItemListener(listener);//���� �����ʷ� �޾���� ������
		}

		sumLabel = new JLabel("���� 0���Դϴ�.");
		c.add(sumLabel);

		setSize(250, 200);
		setVisible(true);

	}

	class MyItemListener implements ItemListener {
		private int sum = 0;

		@Override
		public void itemStateChanged(ItemEvent e) {
			// TODO Auto-generated method stub
			if (e.getStateChange() == ItemEvent.SELECTED) {
				if (e.getItem() == fruits[0])
					sum += 100;
				else if (e.getItem() == fruits[1])
					sum += 500;
				else
					sum += 20000;

			} 
			else {
				if (e.getItem() == fruits[0])
					sum -= 100;
				else if (e.getItem() == fruits[1])
					sum -= 500;
				else
					sum -= 20000;
			}

			sumLabel.setText("���� " + sum + "���Դϴ�.");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new CheckBoxItemEventEx();
	}

}