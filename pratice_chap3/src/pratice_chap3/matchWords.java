package pratice_chap3;

import java.util.Scanner;

public class matchWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String eng[]= {"a", "b", "c","d","e"};
		String kor[]= {"��","��","��","��","��"};
		
		
		while(true) {
			System.out.println("���ĺ��� �Է��ϼ���");
			String alpha = scanner.nextLine();
			if(alpha.equals("exit"))
				break;
			for(int i=0;i<eng.length;i++) {
				if(eng[i].equals(alpha)) //������ �𸣰����� ==�� �ϸ� sysout����� �ȵ�.�ּҸ� ���ؼ� �ȵǴµ�.
					System.out.println(kor[i]);
						
			}
			
			
		}
	
		scanner.close();
	
	}

}
