import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class OptionPaneEx extends JFrame{
	
	class myPanel extends Panel{
		
		
		JButton inputBtn = new JButton("input name");
		JTextField tf = new JTextField(10);
		JButton confirmBtn =new JButton("confirm");
		JButton messageBtn = new JButton("message");
		
		
		public myPanel() {
			// TODO Auto-generated constructor stub
			setBackground(Color.LIGHT_GRAY);
			add(inputBtn);//add한 순서대로 왼->오로 붙음
			
			add(confirmBtn);
			add(messageBtn);
			add(tf);
			
			
			
			
			inputBtn.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					String name = JOptionPane.showInputDialog("이름을 입력하세요");//다이얼로그 메세지, 선택창에 뜨는 닫으시겠습니까?같은 메세지임
					if(name!=null)
						tf.setText(name);
					
				}
			});
			
			confirmBtn.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					//showConfirmDialog(다이얼로그가 출력되는 범위 지정(null이면 화면중앙에), 다이얼로그메세지, 다이얼로그 타이틀, 다이얼로그 옵션종류)
					int result= JOptionPane.showConfirmDialog(null, "계속할거임?", "confirm", JOptionPane.YES_NO_OPTION);
					if(result==JOptionPane.CLOSED_OPTION)//예, 아니오 선택 없이 창을 닫은 경우
						tf.setText("왜 그냥 닫아?");
					else if(result==JOptionPane.YES_OPTION)
						tf.setText("yes");
					else
						tf.setText("no");
					
					
				}
			});
			
			messageBtn.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					//showMessageDialong(다이얼로그 출력 범위지정(null이면 스크린 중앙에), 다이얼로그 메세지, 다이얼로그 타이틀(제목), 메시지타입(아이콘이 바뀌넹))
					JOptionPane.showMessageDialog(null, "조심해라", "warning", JOptionPane.ERROR_MESSAGE);
					
				}
			});
		}
		
	}
	public OptionPaneEx() {
		// TODO Auto-generated constructor stub
		setTitle("옵션 팬 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c =getContentPane();
		c.setLayout(new FlowLayout());
		c.add(new myPanel());
	
		
		
		setSize(500,200);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new OptionPaneEx();

	}

}
