
public class GStack<T> {
	int tos;
	Object [] stck;
	public GStack() {
		// TODO Auto-generated constructor stub
		tos =0;
		stck = new Object[10];
	}
	
	public void push(T item) {//push�Լ�
		if(tos==10)//������ ����
			return;
		stck[tos]=item;
		tos++;
	}
	
	public T pop() {
		if(tos==0)
			return null;
		tos--;
		return (T)stck[tos]; //÷�� �迭�� ObjectŸ������ ���������ϱ� T�� ����ȯ �ؾ��� TŸ������pop�ϴ� �Լ��ϱ�
	}

}
