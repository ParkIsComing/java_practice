package pratice_chap3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class whatDay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n=0, remainder;
		do{
			System.out.println("������ �Է�:");
			try {
				
				n= scanner.nextInt();
			}
			catch(InputMismatchException e) {
				System.out.println("���! ���� �Է����� �ʾҽ��ϴ�.");
				scanner.next();//�Է½�Ʈ���� �ִ� ������ �ƴ� ��ū�� ������. �� ������ ���ѷ���
				continue;
			}
			
			
			  remainder= n%7;
			
			switch(remainder) {
			case 0:
				System.out.println("��");
				break;
			case 1:
				System.out.println("��");
				break;
			case 2:
				System.out.println("ȭ");
				break;
			case 3:
				System.out.println("��");
				break;
			case 4:
				System.out.println("��");
				break;
			case 5:
				System.out.println("��");
				break;
			case 6:
				System.out.println("��");
				break;
			}
			
			
		}while(!(n<0));
		System.out.println("���α׷��� �����մϴ�.");
		scanner.close();

	}
	

}
