package question4;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class keepscore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File dest= new File( "c:\\temp\\test.txt");
		Scanner scanner = new Scanner(System.in);
		System.out.println("���� �Է� ���α׷��Դϴ�.");
		try {
			FileWriter fw = new FileWriter(dest);
			while(true) {
				System.out.print("�̸� ���� >>");
				String line= scanner.nextLine();
				if(line.equals("stop")) {
					break;
				}
				fw.write(line);
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("���� ����");
		}
		
		
		
		
		System.out.println(dest.getPath()+"�� �����߽��ϴ�.");
		
		
		
			

		scanner.close();

	}

}
