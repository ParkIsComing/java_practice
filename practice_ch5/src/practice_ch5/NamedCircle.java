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
		super(radius); //�����Ϸ��� ���� Ŭ������ �⺻ �����ڿ� ���� �ڵ����� ����Ŭ������ �⺻ �����ڿ� ¦�� ����
		this.name= name;
		
	}
	
	public void show() {
		System.out.println(name+", ������="+getRadius());
		//radius��ü�� public�̶� �̷��� getRadius()�޼ҵ�� ������
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NamedCircle w= new NamedCircle(5, "waffle");
		w.show();

	}

}
