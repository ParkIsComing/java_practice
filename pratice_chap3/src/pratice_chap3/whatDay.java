package pratice_chap3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class whatDay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n=0, remainder;
		do{
			System.out.println("정수를 입력:");
			try {
				
				n= scanner.nextInt();
			}
			catch(InputMismatchException e) {
				System.out.println("경고! 수를 입력하지 않았습니다.");
				scanner.next();//입력스트림에 있는 정수가 아닌 토큰을 버린다. 안 버리면 무한루프
				continue;
			}
			
			
			  remainder= n%7;
			
			switch(remainder) {
			case 0:
				System.out.println("일");
				break;
			case 1:
				System.out.println("월");
				break;
			case 2:
				System.out.println("화");
				break;
			case 3:
				System.out.println("수");
				break;
			case 4:
				System.out.println("목");
				break;
			case 5:
				System.out.println("금");
				break;
			case 6:
				System.out.println("토");
				break;
			}
			
			
		}while(!(n<0));
		System.out.println("프로그램을 종료합니다.");
		scanner.close();

	}
	

}
