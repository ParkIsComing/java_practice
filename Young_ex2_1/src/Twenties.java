import java.util.Scanner;

public class Twenties {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("������ �Է��϶�");
		int age =scanner.nextInt();
		if((age>=20)&(age<30)) {
			System.out.print("20���Դϴ�.");
			System.out.println("��¼���..");
		}
		
		else
			System.out.println("20�� �ƴ�");
		
		scanner.close();
		

	}

}
