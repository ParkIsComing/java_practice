package practice_chap2;

import java.util.Scanner;

public class game369 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("1~99���� ���� �Է�:");
		int n = scanner.nextInt();
		
		int first = n/10;
		int second= n%10;
		
		if(first==0)
			first=1;
		if(second==0)
			second=1;
		
		if(first%3==0 && second%3==0)
			System.out.println("¦¦");
		else if((first%3==0&&second%3!=0)||(first%3!=0&&second%3==0))
			System.out.println("¦");
		else
			System.out.println("����");
		
		scanner.close();
	}

}
