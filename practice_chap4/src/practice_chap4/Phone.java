package practice_chap4;

import java.util.Scanner;

public class Phone {
	private String name, tel;
	public Phone(String name, String tel) {
		this.name= name;
		this.tel=tel;
	}
	
	public String getName() {
		return name;
	}
	public String getTel() {
		return tel;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner= new Scanner(System.in);
		System.out.println("�̸��� ��ȭ��ȣ �Է�");
		String name1= scanner.nextLine();
		String tel1= scanner.nextLine();
		Phone person1 = new Phone(name1, tel1);
		System.out.println("�̸��� ��ȭ��ȣ �Է�");
		String name2= scanner.nextLine();
		String tel2= scanner.nextLine();
		Phone person2 = new Phone(name2, tel2);
		
		System.out.println(person1.getName()+"�� ��ȣ "+person1.getTel());
		System.out.println(person2.getName()+"�� ��ȣ "+person2.getTel());
		
		scanner.close();
	}

}
