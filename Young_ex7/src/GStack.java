
public class GStack<T> {
	int tos;
	Object [] stck;
	public GStack() {
		// TODO Auto-generated constructor stub
		tos =0;
		stck = new Object[10];
	}
	
	public void push(T item) {//push함수
		if(tos==10)//꽉차면 리턴
			return;
		stck[tos]=item;
		tos++;
	}
	
	public T pop() {
		if(tos==0)
			return null;
		tos--;
		return (T)stck[tos]; //첨에 배열을 Object타입으로 선언했으니까 T로 형변환 해야지 T타입으로pop하는 함수니까
	}

}
