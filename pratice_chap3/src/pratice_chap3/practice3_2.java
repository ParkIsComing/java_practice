package pratice_chap3;

import java.util.Scanner;

public class practice3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수를 10개 입력>>");
		int a[]=new int [10];
		
		for(int i=0; i<10; i++) {
			int n= scanner.nextInt();
			a[i] = n;
			
			
		}
		
		for(int i = 0; i<10;i++) {
			if(a[i]%3==0)
				System.out.print(a[i]+" ");
			
		}
		
		scanner.close();

	}

}
