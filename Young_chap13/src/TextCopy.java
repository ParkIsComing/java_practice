import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TextCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File src = new File("c:\\windows\\system.ini");//파일 읽을때는 객체로 읽단 가져오고
		File dest = new File("c:\\Temp\\system.txt");
		int c;
		try {
			FileReader fr = new FileReader(src);//읽든말든 하쇼
			FileWriter fw = new FileWriter(dest);
			while((c=fr.read())!=-1) {
				fw.write((char)c);
			}
			fr.close();//열었으면 닫아야지~
			fw.close();//너도 닫아야지~
			System.out.println(src.getPath()+"를 "+dest.getPath()+"로 복사하였습니다." );
		
		}
		catch (IOException e) {
			// TODO: handle exception
			System.out.println("파일복사오류");
		}

	}

}
