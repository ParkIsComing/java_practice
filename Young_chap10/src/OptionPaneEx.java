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
			add(inputBtn);//add�� ������� ��->���� ����
			
			add(confirmBtn);
			add(messageBtn);
			add(tf);
			
			
			
			
			inputBtn.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					String name = JOptionPane.showInputDialog("�̸��� �Է��ϼ���");//���̾�α� �޼���, ����â�� �ߴ� �����ðڽ��ϱ�?���� �޼�����
					if(name!=null)
						tf.setText(name);
					
				}
			});
			
			confirmBtn.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					//showConfirmDialog(���̾�αװ� ��µǴ� ���� ����(null�̸� ȭ���߾ӿ�), ���̾�α׸޼���, ���̾�α� Ÿ��Ʋ, ���̾�α� �ɼ�����)
					int result= JOptionPane.showConfirmDialog(null, "����Ұ���?", "confirm", JOptionPane.YES_NO_OPTION);
					if(result==JOptionPane.CLOSED_OPTION)//��, �ƴϿ� ���� ���� â�� ���� ���
						tf.setText("�� �׳� �ݾ�?");
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
					//showMessageDialong(���̾�α� ��� ��������(null�̸� ��ũ�� �߾ӿ�), ���̾�α� �޼���, ���̾�α� Ÿ��Ʋ(����), �޽���Ÿ��(�������� �ٲ��))
					JOptionPane.showMessageDialog(null, "�����ض�", "warning", JOptionPane.ERROR_MESSAGE);
					
				}
			});
		}
		
	}
	public OptionPaneEx() {
		// TODO Auto-generated constructor stub
		setTitle("�ɼ� �� ����");
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
