package question3;

import java.awt.event.KeyListener;
import java.util.Scanner;

import javax.swing.JFrame;

public class ThreadTest extends JFrame{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner =new Scanner(System.in);
		System.out.println("�ƹ� Ű�� �Է�");
		String check;
		check=scanner.next();
		if(check!=null) {// �ش� �ڵ�� ����ڰ� �ƹ� ���ڳ� �Է��ϰ� Enter�� ġ�� ������ ��ü�� �����ϰ� ������
			Thread th= new Thread(new Runnable() {//Runnable �������̽��� �̿��ؼ� �����ϱ�
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
					while(true) {//������ڸ��� 1���� 10���� ����� �����ϴ� ������
						int i=0;
						System.out.print(i+" ");
						i++;
						if(i==11)
							break;
					}
					
					
				}
			});
			th.start();
		}
		
		
		
		
		

	}

}
