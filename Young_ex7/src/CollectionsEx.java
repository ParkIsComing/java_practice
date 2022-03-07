import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class CollectionsEx {//LinkedList는 add랑 get 사용
	static void printList(LinkedList<String> I) {
		Iterator<String> iterator = I.iterator();
		while(iterator.hasNext()) {
			String e= iterator.next();
			String separator;
			if(iterator.hasNext())//다음꺼가 있으면 ->넣고
				separator="->";
			else//다음꺼가 없으면(마지막 요소이면) 줄바꿈
				separator="\n";
			System.out.print(e+separator);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> myList = new LinkedList<String>();
		myList.add("트랜스포머");
		myList.add("코난");
		myList.add("아바타");
		myList.add("듄");
		myList.add(0, "라라랜드");
		myList.add(2, "매트릭스");
		
		Collections.sort(myList);
		printList(myList);
		
		Collections.reverse(myList);
		printList(myList);
		
		int index= Collections.binarySearch(myList, "아바타");
		System.out.println("아바타는 "+index+"번째 요소입니다.");
	}

}
