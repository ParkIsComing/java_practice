package practice_chap6;


import java.util.Scanner;
import java.util.StringTokenizer;

public class CountTokens {
	
	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			String s = scanner.nextLine();
			if(s.equals("exit")) {
				System.out.println("종료합니다..");
				break;
			}
			StringTokenizer st = new StringTokenizer(s, " ");
			
			int n = st.countTokens();
			System.out.println("어절 개수는 " + n);
		}
		scanner.close();
	}
}
