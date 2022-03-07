import java.util.Scanner;

public class DivideByZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner= new Scanner(System.in);
		int dividend;
		int divisor;
		
		System.out.print("나뉨수를 입력:");
		dividend = scanner.nextInt();
		System.out.print("나누는 수를 입력:");
		divisor= scanner.nextInt();
		try {
			System.out.println(dividend+"를"+divisor+"로 나누면 몫은"+dividend/divisor+"입니다.");
		}
		catch(ArithmeticException e) {
			System.out.println("0으로 나눌 수 없음");
		}
		finally {
			scanner.close();
		}
		
		

	}

}
