import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class InnnerClassListener extends JFrame{
	public InnnerClassListener() {
		// TODO Auto-generated constructor stub
		setTitle("����Ŭ������ ���� �̺���");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c= getContentPane();
		c.setLayout(new FlowLayout());
		JButton btn = new JButton("action");
		btn.addActionListener(new mylistener());
		c.add(btn);
		
		setSize(350,150);
		setVisible(true);
	}
	
	class mylistener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			JButton b= (JButton)e.getSource();//�̺�Ʈ e���� getsource()�Ҷ��� ������������ ���� ����ȯ
			if(b.getText().equals("action"))
				b.setText("�׼�");
			else
				b.setText("action");
			
			InnnerClassListener.this.setTitle(b.getText());
			
		}
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new InnnerClassListener();

	}

}
