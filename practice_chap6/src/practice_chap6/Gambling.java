package practice_chap6;

public class Gambling {
	public static void main(String[] args) {
		int [] n = new int[3];

		while(true) {
			for(int i=0;  i<n.length; i++) {
				n[i] = (int)(Math.random()*3 + 1);
				// 1���� 3������ ���� �����ؼ� �迭�� �ִ� ����. ���� 0.0�̻� 1.0 �̸��� ������ double���� ��ȯ�ϹǷ� int�� ����ȯ
				System.out.print(n[i]+"\t");
			}
			System.out.println();
			
			if(n[0] == n[1] && n[1] == n[2]) {
				System.out.print("����");
				break;
			}
		}
	}

}
