package question1;

import java.util.HashMap;
import java.util.Scanner;

public class givemoney {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		HashMap<String, Double> students = new HashMap<String, Double>();

		String name;
		Double score, standard;
		String namelisted[] = new String[5];
		int i;
		for (i = 0; i < 5; i++) {
			System.out.print("이름과 학점>>");
			name = scanner.next();
			namelisted[i] = name;
			score = scanner.nextDouble();
			students.put(name, score);
		}

		System.out.print("장학생 선발 학점 기준 입력>> ");
		standard = scanner.nextDouble();

		System.out.print("장학생 명단 : ");
		for (i = 0; i < 5; i++) {
			double x;
			x = students.get(namelisted[i]);
			if (x > standard)
				System.out.print(namelisted[i] + " ");

		}

		scanner.close();
	}

}
