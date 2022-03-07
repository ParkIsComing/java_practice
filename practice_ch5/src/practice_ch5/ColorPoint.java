package practice_ch5;

class Point{
	private int x, y;
	public Point(int x, int y) {
		this.x=x;
		this.y=y;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	protected void move(int x, int y) {//첨에 객체 생성하면서 생성자로 초기에 설정한 위치 바꾸기 위한 메소드
		this.x=x;
		this.y=y;
	}
}
public class ColorPoint extends Point {
	public String color;

	public ColorPoint(int x, int y, String color) {
		super(x,y);
		this.color=color;
	}
	
	public void setColor(String color) {
		this.color=color;
	}
	
	public void setPoint(int x, int y) {//x,y 값을 바꾸겠다고 생성자를 건들릴수는 없는 노릇. 그래서 우리가 아까 move() 만든겨
		move(x,y);
	}
	
	public void show() {
		System.out.println(color+"색으로"+"("+getX()+","+getY()+")");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ColorPoint cp= new ColorPoint(5, 5, "yellow");
		cp.setPoint(10, 20);
		cp.setColor("green");
		cp.show();

	}

}
