import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.TextField;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class TextFieldEx extends JFrame{
	public TextFieldEx() {
		// TODO Auto-generated constructor stub
		setTitle("텍스트필드 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		
		c.add(new JLabel("이름  "));
		c.add(new TextField(20)); //20열만큼의 텍스트필드(20*1)
		c.add(new JLabel("학과  "));
		c.add(new TextField("컴퓨터공학과",20));
		c.add(new JLabel("주소  "));
		c.add(new TextField("서울시 어쩌고",20));
		
		setSize(250,150);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TextFieldEx();

	}

}
