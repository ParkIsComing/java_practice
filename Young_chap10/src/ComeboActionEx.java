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
	JLabel imgLabel = new JLabel(images[0]);//처음에 사과 imageicon을 jlabel에 붙여서 나오게
	
	public ComeboActionEx() {
		// TODO Auto-generated constructor stub
		setTitle("콤보박스 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		
		
		JComboBox<String> combo =new JComboBox<String>(fruits);//jcombobox 생성하고 거기에 과일 string배열 붙이기
		c.add(combo);
		c.add(imgLabel);
		
	//콤보 박스에 아이템 선택이 변경되면 호출된다.
		combo.addActionListener(new ActionListener() {//섬세한 게 안 따질거면 actionlistener가 무난~
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JComboBox<String> cb =(JComboBox<String>)e.getSource();// action이벤트가 발생한 콤보박스 알아내기
				int index=cb.getSelectedIndex();//콤보박스에서 뭐 선택했는지 알려면 이렇게 두 과정을 거쳐서 몇번째꺼를 선택했는지 알아야
				imgLabel.setIcon(images[index]);// 그 인덱스의 이미지아이콘을 JLabel에 출력
				
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
