import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapScoreEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> scoreMap=new HashMap<String,Integer>();
		scoreMap.put("�ϴ�", 97);
		scoreMap.put("����", 88);
		scoreMap.put("����", 98);
		scoreMap.put("����", 70);
		scoreMap.put("����", 99);
		
		System.out.println("HashMap�� ��Ұ���:"+scoreMap.size());
		
		Set<String> keys= scoreMap.keySet();// key���ڿ��� ���� ���� set�÷��� ����
		Iterator<String> it=keys.iterator();
		
		while(it.hasNext()) {
			String name = it.next();
			int score=scoreMap.get(name);
			System.out.println(name+":"+score);
		}
		

	}

}
