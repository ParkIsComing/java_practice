import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BinaryCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File src = new File("c:\\Temp\\minhyuk.jfif");
		File dest = new File("c:\\Temp\\cutie.jfif");
		
		int c;
		try {
			FileInputStream fi = new FileInputStream(src);
			FileOutputStream fo = new FileOutputStream(dest);
			while((c=fi.read())!=-1) {
				fo.write((byte)c);
			}
			fi.close();
			fo.close();
			System.out.println(src.getPath()+"�� "+dest.getPath()+"�� �����Ͽ����ϴ�.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("���� ���� ����");
		}

	}

}
