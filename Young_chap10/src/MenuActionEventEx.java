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
		setTitle("menu에 action리스너 만들기 예제");
		createMenu();
		//이미지라벨에 아무 이미지 아이콘 안 넣은채로 일단 컨텐츠팬에 붙여줌. 나중에 액션 발생하면 seticon으로 이미지아이콘 바꿀겨
		getContentPane().add(imgLabel, BorderLayout.CENTER);
		
		setSize(250,200);
		setVisible(true);
	}
	
	public void createMenu() {
		JMenuBar mb = new JMenuBar();
		JMenuItem [] menuItem = new JMenuItem[4];//원소들이 다 객체라서 또 생성해줘야함.
		
		String [] itemTitle = {"load", "hide", "reshow", "exit"};//menuItem 객체 생성할 때 넣어줄 이름 배열
		JMenu screenMenu = new JMenu("screen");
		
		menuActionLister listener = new menuActionLister();
		for(int i=0;i<menuItem.length;i++) {
			menuItem[i]= new JMenuItem(itemTitle[i]);
			menuItem[i].addActionListener(listener);
			screenMenu.add(menuItem[i]);// 메뉴아이템 생성해서 Jmenu에 붙여줘야함
			
		}
		
		mb.add(screenMenu);// JMenuBar에 JMenu 달기
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
