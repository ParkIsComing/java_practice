package practice_ch5;
class Circle{
	private int radius;
	public Circle(int radius) {
		this.radius=radius;
	}
	public int getRadius() {
		return radius;
	}
}
public class NamedCircle extends Circle{
	private String name;
	public NamedCircle(int radius, String name) {
		super(radius); //컴파일러는 서브 클래스의 기본 생성자에 대해 자동으로 슈퍼클래스의 기본 생성자와 짝을 맺음
		this.name= name;
		
	}
	
	public void show() {
		System.out.println(name+", 반지름="+getRadius());
		//radius자체는 public이라서 이렇게 getRadius()메소드로 얻어오기
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NamedCircle w= new NamedCircle(5, "waffle");
		w.show();

	}

}
