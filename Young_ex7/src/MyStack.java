
public class MyStack {//GStack<T>�� �ٸ� ���Ϸ� �̹� ��������
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GStack<String> stringStack = new GStack<String>();
		stringStack.push("a");
		stringStack.push("b");
		stringStack.push("c");
		for(int i=0;i<3;i++)
			System.out.println(stringStack.pop());
		
		GStack<Integer> intStack = new GStack<Integer>();
		intStack.push(1);
		intStack.push(3);
		intStack.push(5);
		
		for(int i=0;i<3;i++)
			System.out.println(intStack.pop());

	}

}
