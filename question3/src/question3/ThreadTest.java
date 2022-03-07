package question3;

import java.awt.event.KeyListener;
import java.util.Scanner;

import javax.swing.JFrame;

public class ThreadTest extends JFrame{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner =new Scanner(System.in);
		System.out.println("아무 키나 입력");
		String check;
		check=scanner.next();
		if(check!=null) {// 해당 코드는 사용자가 아무 문자나 입력하고 Enter를 치면 스레드 객체를 생성하고 실행함
			Thread th= new Thread(new Runnable() {//Runnable 인터페이스를 이용해서 개발하기
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
					while(true) {//실행되자마자 1부터 10까지 출력후 종료하는 스레드
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
