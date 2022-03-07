package pratice_chap3;

import java.util.Scanner;

public class matchWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String eng[]= {"a", "b", "c","d","e"};
		String kor[]= {"가","나","다","라","마"};
		
		
		while(true) {
			System.out.println("알파벳을 입력하세요");
			String alpha = scanner.nextLine();
			if(alpha.equals("exit"))
				break;
			for(int i=0;i<eng.length;i++) {
				if(eng[i].equals(alpha)) //왜인지 모르겠지만 ==로 하면 sysout출력이 안됨.주소를 비교해서 안되는듯.
					System.out.println(kor[i]);
						
			}
			
			
		}
	
		scanner.close();
	
	}

}
