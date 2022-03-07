package practice_chap6;

public class Gambling {
	public static void main(String[] args) {
		int [] n = new int[3];

		while(true) {
			for(int i=0;  i<n.length; i++) {
				n[i] = (int)(Math.random()*3 + 1);
				// 1에서 3까지의 난수 생성해서 배열에 넣는 루프. 원래 0.0이상 1.0 미만의 임의의 double값을 반환하므로 int로 형변환
				System.out.print(n[i]+"\t");
			}
			System.out.println();
			
			if(n[0] == n[1] && n[1] == n[2]) {
				System.out.print("성공");
				break;
			}
		}
	}

}
