import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TextCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File src = new File("c:\\windows\\system.ini");//���� �������� ��ü�� �д� ��������
		File dest = new File("c:\\Temp\\system.txt");
		int c;
		try {
			FileReader fr = new FileReader(src);//�е縻�� �ϼ�
			FileWriter fw = new FileWriter(dest);
			while((c=fr.read())!=-1) {
				fw.write((char)c);
			}
			fr.close();//�������� �ݾƾ���~
			fw.close();//�ʵ� �ݾƾ���~
			System.out.println(src.getPath()+"�� "+dest.getPath()+"�� �����Ͽ����ϴ�." );
		
		}
		catch (IOException e) {
			// TODO: handle exception
			System.out.println("���Ϻ������");
		}

	}

}
