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
		System.out.println("�⺻ ������ ��� �ɷ���"+weapon.fire());
		weapon=new Cannon();// �޼ҵ� �������̵� �ϰ� ��
		System.out.println("������ ��� �ɷ���"+weapon.fire());//�׷��� Cannon.fire()�� ����

	}

}
