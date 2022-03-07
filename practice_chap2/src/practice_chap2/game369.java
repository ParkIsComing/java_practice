package practice_chap2;

import java.util.Scanner;

public class game369 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("1~99»çÀÌ Á¤¼ö ÀÔ·Â:");
		int n = scanner.nextInt();
		
		int first = n/10;
		int second= n%10;
		
		if(first==0)
			first=1;
		if(second==0)
			second=1;
		
		if(first%3==0 && second%3==0)
			System.out.println("Â¦Â¦");
		else if((first%3==0&&second%3!=0)||(first%3!=0&&second%3==0))
			System.out.println("Â¦");
		else
			System.out.println("¾øÀ½");
		
		scanner.close();
	}

}
