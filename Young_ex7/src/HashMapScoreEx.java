import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapScoreEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> scoreMap=new HashMap<String,Integer>();
		scoreMap.put("하니", 97);
		scoreMap.put("제시", 88);
		scoreMap.put("혜진", 98);
		scoreMap.put("지수", 70);
		scoreMap.put("민지", 99);
		
		System.out.println("HashMap의 요소개수:"+scoreMap.size());
		
		Set<String> keys= scoreMap.keySet();// key문자열을 가진 집합 set컬렉션 리턴
		Iterator<String> it=keys.iterator();
		
		while(it.hasNext()) {
			String name = it.next();
			int score=scoreMap.get(name);
			System.out.println(name+":"+score);
		}
		

	}

}
