
public class ThreadMainEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long id= Thread.currentThread().getId();
		String name= Thread.currentThread().getName();
		int priority = Thread.currentThread().getPriority();//스레드 우선순위 받는 거
		Thread.State s= Thread.currentThread().getState();
		
		System.out.println("현재 스레드 이름="+name);
		System.out.println("현재 스레드 ID="+id);
		System.out.println("현재 스레드 우선 순위값="+priority);
		System.out.println("현재 스레드 상태="+s);

	}

}
