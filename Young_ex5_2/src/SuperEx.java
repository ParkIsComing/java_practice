class Point{
	private int x,y;
	public Point() {
		this.x=0;
		this.y=0;
	}
	public Point(int x, int y) {
		this.x=x;
		this.y=y;
		
	}
	public void showPoint() {
		System.out.println("("+x+","+y+")");
	}
}
	
class ColorPoint extends Point{//상속은 무조건 생성자 주의
	private String color;
	public ColorPoint(int x, int y, String color) {
		super(x,y);//line7로, 이거 없으면 기본생성자로 감
		this.color= color;
	}
	
	public void showColorPoint() {
		System.out.print(color);
		showPoint();
	}
}
public class SuperEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ColorPoint cp  = new ColorPoint(5, 6, "blue");
		cp.showColorPoint();

	}

}
