package practice_chap4;
class Circle{
	private int radius;
	public Circle(int radius) {//��ü ���鶧 �ѹ��� ������ �����ϴ� �޼ҵ�
		// TODO Auto-generated constructor stub
		this.radius=radius;
	}
	public int getRadius() {//�ٸ� ������ ������ �ʿ��Ҷ� �޾ƿ��� �� �޼ҵ�
		return this.radius;
	}
	public void setRadius(int radius) {//��ü�� ������� ������ �ٲ� �� ���� �޼ҵ�
		this.radius=radius;
	}
}

class CircleManager{
	static void copy(Circle src, Circle des) {//src�� des�� ����
		des.setRadius(src.getRadius());// src ������!�� des ������!�� ����
	}
	static boolean equals(Circle a, Circle b) {
		if(a.getRadius()== b.getRadius())
			return true;
		else
			return false;
	}
}
public class StaticTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle pizza = new Circle(5);
		Circle waffle = new Circle(1);
		
		boolean res = CircleManager.equals(pizza, waffle);
		if(res==true)
			System.out.println("���ڿ� ���� ũ�� ����");
		else
			System.out.println("���ڿ� ���� ũ�� �ٸ�");
		
		CircleManager.copy(pizza, waffle);
		res = CircleManager.equals(pizza, waffle);
		if(res==true)
			System.out.println("���ڿ� ���� ũ�� ����");
		else
			System.out.println("���ڿ� ���� ũ�� �ٸ�");

	}

}
