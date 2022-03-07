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
			
			byte [] buf = new byte [1024*10];//10KB 크기 버퍼
			while(true) {
				int n=fi.read(buf);
				fo.write(buf,0,n);//buf[0]부터 n바이트 쓰기
				if(n<buf.length)
					break;
			}
			fi.close();
			fo.close();
			System.out.println(src.getPath()+"를 "+dest.getPath()+"로 복사했습니다.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("파일 복사 오류");
		}
		

	}

}
