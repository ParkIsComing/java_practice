import java.util.InputMismatchException;
import java.util.Scanner;

public class InputException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수 3개 입력");
		int sum=0, n=0;
		
		for(int i=0;i<3;i++) {
			System.out.print(i+">>");
			try {
				n=scanner.nextInt();
			}
			catch(InputMismatchException e) {
				System.out.println("정수가 아닙니다. 다시 입력");
				scanner.next();//입력 스트림에 있는 정수가 아닌 토큰을 버린다.
				i--;//인덱스가 증가하지 않도록 미리 감소
				continue;//다음 루프 가자~
			}
			sum+=n;
		}
		System.out.println("합은"+sum);
		scanner.close();

	}

}
