import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader in =null;
		try {
			in=new FileReader("c:\\windows\\system.ini"); //���� ���°͵� �������� ���ɼ� ���� �׷��� try catch"
			int c;
			while((c=in.read())!=-1) {
				System.out.print((char)c);
			}
			in.close();
			
		}
		catch (IOException e) {
			// TODO: handle exception
			System.out.println("����¿���");
		}

	}

}
