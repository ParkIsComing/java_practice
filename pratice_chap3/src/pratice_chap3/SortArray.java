package pratice_chap3;

import java.util.Scanner;

public class SortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n[]= new int [10];
		System.out.print("정수 10개 입력>>");
		
		for(int i=0;i<n.length;i++) {
			n[i]=scanner.nextInt();
		}
		
		
		for(int i=0; i<n.length; i++) {//버블소팅
			for(int j=i; j<n.length; j++) {
				if(n[i]>n[j]) {
					int tmp = n[i];
					n[i]=n[j];
					n[j]=tmp;
				}
			}
		}
		
		for(int i=0; i<n.length;i++) {
			System.out.print(n[i]+" ");
		}
		scanner.close();

	}

}
