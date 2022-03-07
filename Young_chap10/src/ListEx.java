import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.ScrollPane;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;

public class ListEx extends JFrame {
	String [] fruits = {"apple","banna","kiwi","mango","pear","peach","berry","strawberry","blueberry"};
	ImageIcon [] images= {new ImageIcon("images/icon1.png"),new ImageIcon("images/icon2.png"),
			new ImageIcon("images/icon3.png"),new ImageIcon("images/icon4.png")};
	
	public ListEx() {
		// TODO Auto-generated constructor stub
		
		setTitle("����Ʈ ����� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c= getContentPane();
		c.setLayout(new FlowLayout());
		
		JList<String> strlist = new JList<String>(fruits);
		c.add(strlist);
		
		JList<ImageIcon> imagelist = new JList<ImageIcon>(images);
		//������ images �� �ְ� imagelist.setListDate(images); ���ؼ� �� �ٿ� ���ļ� �־ ������
		c.add(imagelist);
		
		JList<String> scrollList = new JList<String>(fruits);
		c.add(new JScrollPane(scrollList));//�׳� scrollpane�ƴϰ� jscrollpane��
		
		setSize(300,300);
		setVisible(true);
	
		

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ListEx();

	}

}
