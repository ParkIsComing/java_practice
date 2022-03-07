import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuEx extends JFrame {
	public MenuEx() {
		// TODO Auto-generated constructor stub
		setTitle("menu 만들기 예제");
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
		mb.add(new JMenu("edit"));//edit안에 JMenuItem 따로 달 거 없으면 이렇게 바로 만들고 붙여도됨
		mb.add(new JMenu("source"));
		mb.add(new JMenu("project"));
		mb.add(new JMenu("run"));
		setJMenuBar(mb);//메뉴바를 프레임에 이렇게 붙임
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MenuEx();

	}

}
