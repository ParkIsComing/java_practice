class Weapon{
	protected int fire() {
		return 1;
	}
}

class Cannon extends Weapon{
	protected int fire() {
		return 10;
	}
}
public class Overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Weapon weapon;
		weapon = new Weapon();
		System.out.println("기본 무기의 살상 능력은"+weapon.fire());
		weapon=new Cannon();// 메소드 오버라이딩 하게 됨
		System.out.println("대포의 살상 능력은"+weapon.fire());//그래서 Cannon.fire()로 간겨

	}

}
