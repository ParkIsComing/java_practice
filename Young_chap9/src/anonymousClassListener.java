import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class anonymousClassListener extends JFrame{
	public anonymousClassListener() {
		// TODO Auto-generated constructor stub
		setTitle("�͸�Ŭ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		Container c= getContentPane();
		c.setLayout(new FlowLayout());
		JButton btn = new JButton("action");
		c.add(btn);//�׻� ������Ʈ ����� ���̱�
		btn.addActionListener(new ActionListener() {//�͸�Ŭ����
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JButton b=(JButton)e.getSource();
				if(b.getText().equals("action"))
					b.setText("�׼�");
				else
					b.setText("action");
				setTitle(b.getText());
				
			}
		});
		
		setSize(400,200);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new anonymousClassListener();

	}

}
