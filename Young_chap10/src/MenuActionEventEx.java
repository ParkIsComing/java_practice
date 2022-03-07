import java.awt.BorderLayout;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuActionEventEx extends JFrame {
	private JLabel imgLabel = new JLabel();
	public MenuActionEventEx() {
		// TODO Auto-generated constructor stub
		setTitle("menu�� action������ ����� ����");
		createMenu();
		//�̹����󺧿� �ƹ� �̹��� ������ �� ����ä�� �ϴ� �������ҿ� �ٿ���. ���߿� �׼� �߻��ϸ� seticon���� �̹��������� �ٲܰ�
		getContentPane().add(imgLabel, BorderLayout.CENTER);
		
		setSize(250,200);
		setVisible(true);
	}
	
	public void createMenu() {
		JMenuBar mb = new JMenuBar();
		JMenuItem [] menuItem = new JMenuItem[4];//���ҵ��� �� ��ü�� �� �����������.
		
		String [] itemTitle = {"load", "hide", "reshow", "exit"};//menuItem ��ü ������ �� �־��� �̸� �迭
		JMenu screenMenu = new JMenu("screen");
		
		menuActionLister listener = new menuActionLister();
		for(int i=0;i<menuItem.length;i++) {
			menuItem[i]= new JMenuItem(itemTitle[i]);
			menuItem[i].addActionListener(listener);
			screenMenu.add(menuItem[i]);// �޴������� �����ؼ� Jmenu�� �ٿ������
			
		}
		
		mb.add(screenMenu);// JMenuBar�� JMenu �ޱ�
		setJMenuBar(mb);
		
	}
	
	class menuActionLister implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String cmd = e.getActionCommand();
			switch(cmd){
				case "load":
					if(imgLabel.getIcon()!=null)
						return;
					imgLabel.setIcon(new ImageIcon("images/apple.jpg"));
					break;
				case "hide":
					imgLabel.setVisible(false);
					break;
				case "reshow":
					imgLabel.setVisible(true);
					break;
				case "exit":
					System.exit(0);
					break;
						
			}
			
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MenuActionEventEx();

	}

}
