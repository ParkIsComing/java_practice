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
		
		setTitle("리스트 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c= getContentPane();
		c.setLayout(new FlowLayout());
		
		JList<String> strlist = new JList<String>(fruits);
		c.add(strlist);
		
		JList<ImageIcon> imagelist = new JList<ImageIcon>(images);
		//위에서 images 안 넣고 imagelist.setListDate(images); 더해서 두 줄에 걸쳐서 넣어도 괜찮음
		c.add(imagelist);
		
		JList<String> scrollList = new JList<String>(fruits);
		c.add(new JScrollPane(scrollList));//그냥 scrollpane아니고 jscrollpane임
		
		setSize(300,300);
		setVisible(true);
	
		

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ListEx();

	}

}
