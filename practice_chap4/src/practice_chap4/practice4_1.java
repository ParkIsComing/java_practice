package practice_chap4;

public class practice4_1 {
	
	private String title;
	public practice4_1(String title) {
		this.title=title;
		
	}
	public String getTitle() {
		return title;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		practice4_1 mysong = new practice4_1("let it go");
		practice4_1 yoursong = new practice4_1("������Ÿ��");
		System.out.println("�� �뷡��"+mysong.getTitle());
		System.out.println("���� �뷡��"+yoursong.getTitle());

	}

}
