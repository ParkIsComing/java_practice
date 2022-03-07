import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class anonymousClassListener extends JFrame{
	public anonymousClassListener() {
		// TODO Auto-generated constructor stub
		setTitle("익명클래스");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		Container c= getContentPane();
		c.setLayout(new FlowLayout());
		JButton btn = new JButton("action");
		c.add(btn);//항상 컴포넌트 만들면 붙이기
		btn.addActionListener(new ActionListener() {//익명클래스
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JButton b=(JButton)e.getSource();
				if(b.getText().equals("action"))
					b.setText("액션");
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
