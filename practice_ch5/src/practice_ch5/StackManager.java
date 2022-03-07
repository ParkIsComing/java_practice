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
	public StringStack(int capacity) {// ������. ���ڷ� �뷮 ����
		element = new String[capacity]; //���� ���� ����
		index = 0;//�ܾ� �� ���� �ε���
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
		if(index==element.length)// ���� ������ false����
			return false; //���� ������ �ѾƳ���� �Ϻη� ����Ÿ���� boolean���� �Ѱ�
		element[index++]=ob; // �� �� á���� ���� ĭ�� ���ڷ� ���� �ܾ� �ֱ�
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
			// next()�� ���� ��ū�� ���ڿ��� ����, nextline()�� '\n'�� ������ �� ������ �а� '\n'�� ���� �������� ���ڿ��� ����
			s.push(text);
		}
		
		int count = s.length();
		for(int i=0; i<count; i++)
			System.out.print(s.pop()+" ");
		
		scanner.close();

	}

}
