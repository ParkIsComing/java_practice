import java.util.HashMap;
import java.util.Scanner;

public class HashMapDicEx {//hashmap�� put�� get  VS VECTOR�� ARRAYLIST�� add�� get

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> dic= new HashMap<String,String>();
		dic.put("aa", "��");
		dic.put("b", "��");
		dic.put("c", "��");
		
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.print("ã�� �ܾ�?:");
			String eng= scanner.next();
			if(eng.equals("exit")) {
				System.out.println("����");
				break;
			}
			String kor = dic.get(eng);
			if(kor==null)
				System.out.println(eng+"�� ����");
			else
				System.out.println(kor);
		}
		
		scanner.close();

	}

}
