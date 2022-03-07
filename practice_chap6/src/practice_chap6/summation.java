package practice_chap6;

import java.util.Scanner;
import java.util.StringTokenizer;

public class summation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String s= scanner.nextLine();
		StringTokenizer st = new StringTokenizer(s,"+");
		int sum=0;
		while(st.hasMoreTokens()) {
		s= st.nextToken();	
		sum+=Integer.parseInt(s.trim());
		}
		System.out.println("гую╨"+sum);
		scanner.close();

	}

}
