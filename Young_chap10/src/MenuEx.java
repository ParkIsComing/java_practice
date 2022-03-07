import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuEx extends JFrame {
	public MenuEx() {
		// TODO Auto-generated constructor stub
		setTitle("menu ����� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		createMenu();
		
		setSize(250,200);
		setVisible(true);
	}
	
	public void createMenu() {
		JMenuBar mb= new JMenuBar();
		JMenu screenMenu = new JMenu("screen");
		
		screenMenu.add(new JMenuItem("load"));
		screenMenu.add(new JMenuItem("hide"));
		screenMenu.add(new JMenuItem("reshow"));
		screenMenu.addSeparator();
		screenMenu.add(new JMenuItem("exit"));
		
		mb.add(screenMenu);
		mb.add(new JMenu("edit"));//edit�ȿ� JMenuItem ���� �� �� ������ �̷��� �ٷ� ����� �ٿ�����
		mb.add(new JMenu("source"));
		mb.add(new JMenu("project"));
		mb.add(new JMenu("run"));
		setJMenuBar(mb);//�޴��ٸ� �����ӿ� �̷��� ����
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MenuEx();

	}

}
