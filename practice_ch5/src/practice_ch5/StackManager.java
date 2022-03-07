package practice_ch5;

import java.util.Scanner;

interface StackInterface {
	int length();
	String pop();
	boolean push(String ob);
}

class StringStack implements StackInterface{
	private String [] element;
	private int index;
	public StringStack(int capacity) {// 생성자. 인자로 용량 받음
		element = new String[capacity]; //선언 생성 따로
		index = 0;//단어 수 세는 인덱스
				}
	@Override
	public int length() {
		// TODO Auto-generated method stub
		return index;
	}
	@Override
	public String pop() {
		// TODO Auto-generated method stub
		if(index==0)
			return null;
		index--;
		return element[index];
	}
	@Override
	public boolean push(String ob) {
		// TODO Auto-generated method stub
		if(index==element.length)// 스택 꽉차면 false리턴
			return false; //스택 꽉차면 쫓아낼라고 일부러 리턴타입을 boolean으로 한겨
		element[index++]=ob; // 꽉 안 찼으면 다음 칸에 인자로 받은 단어 넣기
		return true;
	}
	}

public class StackManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringStack s= new StringStack(10);
		Scanner scanner= new Scanner(System.in);
		
		System.out.print(">>");
		for(int i=0; i<5;i++) {
			String text = scanner.next();
			// next()는 다음 토큰을 문자열로 리턴, nextline()은 '\n'을 포함한 한 라인을 읽고 '\n'을 버린 나머지만 문자열로 리턴
			s.push(text);
		}
		
		int count = s.length();
		for(int i=0; i<count; i++)
			System.out.print(s.pop()+" ");
		
		scanner.close();

	}

}
