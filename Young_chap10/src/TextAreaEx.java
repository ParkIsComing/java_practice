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
		setTitle("�ؽ�Ʈ���� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c =getContentPane();
		c.setLayout(new FlowLayout());
		c.add(new JLabel("�Է��� <enter>Ű �Է�"));
		c.add(tf);
		c.add(new JScrollPane(ta));//jtextarea����� jscrollpane�� �ٿ�����!!!!!!!!!!!
		
		tf.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub\
				JTextField t =(JTextField)e.getSource();//tf�� ���� actionlistener�� ���� �� t�� getsource�ϰ�
				ta.append(t.getText()+"\n");// t.getText�� textArea�� �ٿ�������
				t.setText("");//textarea�� �ٿ��ְ� ����
				
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
