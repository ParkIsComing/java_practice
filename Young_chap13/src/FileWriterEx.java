import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileWriterEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputStreamReader in = new InputStreamReader(System.in);
		FileWriter fout = null;
		int c;
		try {
			fout=new FileWriter("c:\\Temp\\test.txt");
			while((c=in.read())!=-1) {
				fout.write(c);
			}
			in.close();
			fout.close();//Ű����κ��� ���� ���ڸ� ���Ͽ� ����
			
		}
		
		
		catch (IOException e) {
			System.out.println("����� ����");
		} 
		

//console���� �Է��ϰ�(����Ű�� �ٹٲ㵵 ��) ctrl+Z������ Ŀ�� �պκб��� txt�� ������.
	}

}
