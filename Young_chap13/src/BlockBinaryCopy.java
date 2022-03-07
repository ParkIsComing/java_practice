import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BlockBinaryCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File src = new File("c:\\Temp\\timothee.jfif");
		File dest = new File("c:\\Temp\\lovely.jfif");
		
		try {
			FileInputStream fi = new FileInputStream(src);
			FileOutputStream fo = new FileOutputStream(dest);
			
			byte [] buf = new byte [1024*10];//10KB ũ�� ����
			while(true) {
				int n=fi.read(buf);
				fo.write(buf,0,n);//buf[0]���� n����Ʈ ����
				if(n<buf.length)
					break;
			}
			fi.close();
			fo.close();
			System.out.println(src.getPath()+"�� "+dest.getPath()+"�� �����߽��ϴ�.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("���� ���� ����");
		}
		

	}

}
