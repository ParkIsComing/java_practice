import java.util.Scanner;

public class BreakExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("exit를 입력하면 종료");
		
		while(true) {
			System.out.print(">>");
			String text = scanner.nextLine();//문자열 받음 이렇게 계속 새로 만들어도 되나봄.
			if(text.equals("exit"))
				break;

		}
		System.out.println("종료");
		scanner.close();

	}

}
