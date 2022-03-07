import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CheckBoxItemEventEx extends JFrame {

	private JCheckBox[] fruits = new JCheckBox[3];//jcheckbox로 배열만들면 원소도 각자 객체이므로 이따 new해줘야
	private String[] names = { "사과", "배", "체리" };
	private JLabel sumLabel;

	public CheckBoxItemEventEx() {
		// TODO Auto-generated constructor stub
		setTitle("체크박스와 ItemEvent 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		c.add(new JLabel("사과 100,배 500, 체리 2000"));
		MyItemListener listener = new MyItemListener();// fruits[i]마다 리스너 생성하면 sum 연동x
		// 그래서 forloop 돌기 전에 리스너 객체 생성해줌
		for (int i = 0; i < fruits.length;i++) {
			fruits[i] = new JCheckBox(names[i]);//배열로 String 넣어줘도 됨. 그냥 배열인덱스로 이름 가져가네.
			fruits[i].setBorderPainted(true);
			c.add(fruits[i]);
			fruits[i].addItemListener(listener);//같은 리스너로 달아줘야 연동됨
		}

		sumLabel = new JLabel("현재 0원입니다.");
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

			sumLabel.setText("현재 " + sum + "원입니다.");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new CheckBoxItemEventEx();
	}

}
