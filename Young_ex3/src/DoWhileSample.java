
public class DoWhileSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char a = 'a';
		
		do {
			System.out.print(a);
			a=(char)(a+1);//강제형변환
			

	}while(a<='z');

}
}
