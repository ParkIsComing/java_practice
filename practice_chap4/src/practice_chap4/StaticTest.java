package practice_chap4;
class Circle{
	private int radius;
	public Circle(int radius) {//객체 만들때 한번에 반지름 설정하는 메소드
		// TODO Auto-generated constructor stub
		this.radius=radius;
	}
	public int getRadius() {//다른 곳에서 반지름 필요할때 받아오는 용 메소드
		return this.radius;
	}
	public void setRadius(int radius) {//객체로 만들어진 반지름 바꿀 때 쓰는 메소드
		this.radius=radius;
	}
}

class CircleManager{
	static void copy(Circle src, Circle des) {//src를 des에 복사
		des.setRadius(src.getRadius());// src 반지름!을 des 반지름!에 복사
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
			System.out.println("피자와 와플 크기 같음");
		else
			System.out.println("피자와 와플 크기 다름");
		
		CircleManager.copy(pizza, waffle);
		res = CircleManager.equals(pizza, waffle);
		if(res==true)
			System.out.println("피자와 와플 크기 같음");
		else
			System.out.println("피자와 와플 크기 다름");

	}

}
