import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class IndepClassListener extends JFrame{
	public IndepClassListener() {
		// TODO Auto-generated constructor stub
		setTitle("����Ŭ������ �̺�Ʈ �����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		JButton btn = new JButton("action");
		btn.addActionListener(new myActionListener());
		c.add(btn);
		
		
		setSize(350,150);
		setVisible(true);
	}
	
	
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new IndepClassListener();
	}

}

class myActionListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton b = (JButton)e.getSource();
		if(b.getText().equals("action"))
			b.setText("�׼�");
		else
			b.setText("action");
		
	}
}
