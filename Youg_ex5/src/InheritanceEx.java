class Person{
	private int weight;
	int age;
	protected int height;
	public String name;
	
	public void setWeight(int weight) {
		this.weight= weight;
		
	}
	public int getWeight() {
		return weight;
	}
}

class Student extends Person{
	public void set() {
		age=30;
		name="ȫ�浿";
		height=175;
		setWeight(99);//private��� weight�� setWeight()�� ��������
	}
}
public class InheritanceEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student S= new Student();
		S.set();

	}

}
