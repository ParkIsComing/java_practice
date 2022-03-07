interface PhoneInterface{//인터페이스에는
	final int TIMEOUT =10000;//상수
	void sendCall();//추상메소드
	void receiveCall();
	default void printLogo(){//default 메소드 넣을 수 있음
		System.out.println("**phone**");
	}
	

}

class Calc{
	public int calculator(int x, int y) {
		return x+y;
	}
}
class SamsungPhone extends Calc implements PhoneInterface{

	@Override
	public void sendCall() {
		// TODO Auto-generated method stub
		System.out.println("ring~");
	}

	@Override
	public void receiveCall() {
		// TODO Auto-generated method stub
		System.out.println("전화옴");
		
	}
	
	public void flash() {
		System.out.println("flash on");
	}
	
	public void schedule() {
		System.out.println("일정 관리");
	}
	
}
public class InterfaceEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SamsungPhone phone = new SamsungPhone();
		phone.printLogo();
		phone.sendCall();
		phone.receiveCall();
		phone.flash();
		System.out.println("3과 5를 더하면"+phone.calculator(3, 5));
		phone.schedule();

	}

}