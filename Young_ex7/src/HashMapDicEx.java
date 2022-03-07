import java.util.HashMap;
import java.util.Scanner;

public class HashMapDicEx {//hashmap은 put과 get  VS VECTOR과 ARRAYLIST는 add와 get

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> dic= new HashMap<String,String>();
		dic.put("aa", "ㄱ");
		dic.put("b", "ㅂ");
		dic.put("c", "ㅋ");
		
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.print("찾을 단어?:");
			String eng= scanner.next();
			if(eng.equals("exit")) {
				System.out.println("종료");
				break;
			}
			String kor = dic.get(eng);
			if(kor==null)
				System.out.println(eng+"는 없음");
			else
				System.out.println(kor);
		}
		
		scanner.close();

	}

}
