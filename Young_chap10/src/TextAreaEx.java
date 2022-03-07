import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TextAreaEx extends JFrame {
	JTextField tf = new JTextField(20);
	JTextArea ta = new JTextArea(7,20);
	
	public TextAreaEx() {
		// TODO Auto-generated constructor stub
		setTitle("텍스트영역 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c =getContentPane();
		c.setLayout(new FlowLayout());
		c.add(new JLabel("입력후 <enter>키 입력"));
		c.add(tf);
		c.add(new JScrollPane(ta));//jtextarea만들고 jscrollpane에 붙여야함!!!!!!!!!!!
		
		tf.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub\
				JTextField t =(JTextField)e.getSource();//tf에 붙인 actionlistener로 받은 거 t에 getsource하고
				ta.append(t.getText()+"\n");// t.getText를 textArea에 붙여버리기
				t.setText("");//textarea에 붙여주고 비우기
				
			}
		});
		
		setSize(500,300);
		setVisible(true);
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TextAreaEx();

	}

}
