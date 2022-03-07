import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class RadioButtonEx extends JFrame {
	public RadioButtonEx() {
		// TODO Auto-generated constructor stub
		setTitle("라디오버튼 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		
		ButtonGroup g = new ButtonGroup();//버튼 그룹 객체 생성
		
		JRadioButton apple = new JRadioButton("사과");
		JRadioButton pear = new JRadioButton("배",true);
		JRadioButton cherry = new JRadioButton("체리");
		
		g.add(cherry);//버튼그룹에 3개의 라디오버튼 삽입
		g.add(apple);
		g.add(pear);
		
		//컨테이너에도 라디오버튼 따로 붙여야함
		c.add(apple);//컨테이너에 붙이는 순서대로 정렬
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
