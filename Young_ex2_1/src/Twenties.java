import java.util.Scanner;

public class Twenties {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("나이을 입력하라");
		int age =scanner.nextInt();
		if((age>=20)&(age<30)) {
			System.out.print("20대입니다.");
			System.out.println("어쩌라고..");
		}
		
		else
			System.out.println("20대 아님");
		
		scanner.close();
		

	}

}
