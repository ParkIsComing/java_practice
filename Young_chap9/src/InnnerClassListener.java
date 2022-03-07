import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class InnnerClassListener extends JFrame{
	public InnnerClassListener() {
		// TODO Auto-generated constructor stub
		setTitle("내부클래스를 쓰는 이벤ㅌ");
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
			JButton b= (JButton)e.getSource();//이벤트 e에서 getsource()할때는 뭐가져올지에 따라서 형변환
			if(b.getText().equals("action"))
				b.setText("액션");
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
