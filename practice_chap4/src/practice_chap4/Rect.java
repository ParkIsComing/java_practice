package practice_chap4;

import java.util.Scanner;

public class Rect {
	private int width, height;
	public Rect(int width, int height) {
		// TODO Auto-generated constructor stub
		this.width = width;
		this.height= height;
	}
	
	public int getArea() {
		return width*height;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Rect r[]= new Rect[4];
		
		for(int i=0; i<r.length ;i++) {
			System.out.print(i+1);
			System.out.print(" �ʺ�� ����>>");
			int width = scanner.nextInt();
			int height = scanner.nextInt();
			r[i]= new Rect(width, height);//��ü�迭�� �迭�� ũ�⸸ŭ ��ü�� �����Ͽ� ���۹迭�� �ϳ��� ������
			
		}
		System.out.println("�����Ͽ����ϴ�.");
		int sum=0;
		for( int i=0; i<r.length;i++)
			sum+= r[i].getArea();
		
		System.out.println("�簢���� ��ü ����"+sum);
		scanner.close();
	}

}
