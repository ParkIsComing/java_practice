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
	protected void move(int x, int y) {//÷�� ��ü �����ϸ鼭 �����ڷ� �ʱ⿡ ������ ��ġ �ٲٱ� ���� �޼ҵ�
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
	
	public void setPoint(int x, int y) {//x,y ���� �ٲٰڴٰ� �����ڸ� �ǵ鸱���� ���� �븩. �׷��� �츮�� �Ʊ� move() �����
		move(x,y);
	}
	
	public void show() {
		System.out.println(color+"������"+"("+getX()+","+getY()+")");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ColorPoint cp= new ColorPoint(5, 5, "yellow");
		cp.setPoint(10, 20);
		cp.setColor("green");
		cp.show();

	}

}
