import java.util.HashMap;
import java.util.Scanner;
class Student{
	private int id;
	private String tel;
	public Student(int id, String tel) {
		// TODO Auto-generated constructor stub
		this.id=id;
		this.tel=tel;
	}
	
	public int getId() {
		return id;
	}
	public String getTel() {
		return tel;
	}
}

public class HashMapStudentEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Student> map = new HashMap<String, Student>();//key:name value:Student
		
		map.put("Park", new Student(1, "33485027"));
		map.put("Kim", new Student(2, "78945612"));
		map.put("Lee", new Student(3, "46568123"));
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("검색할 이름:");
			String name= scanner.nextLine();
			if(name.equals("exit")) {
				System.out.println("종료");
				break;
			}
			Student student = map.get(name);
			if(student==null)
				System.out.println(name+"은 없는 사람");
			else
				System.out.println("id: "+student.getId()+" tel:"+student.getTel());
			
		}
		scanner.close();
		
		

	}

}
