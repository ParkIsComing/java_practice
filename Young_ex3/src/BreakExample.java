import java.util.Scanner;

public class BreakExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("exit�� �Է��ϸ� ����");
		
		while(true) {
			System.out.print(">>");
			String text = scanner.nextLine();//���ڿ� ���� �̷��� ��� ���� ���� �ǳ���.
			if(text.equals("exit"))
				break;

		}
		System.out.println("����");
		scanner.close();

	}

}
