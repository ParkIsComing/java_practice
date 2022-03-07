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
			fout.close();//키보드로부터 받은 문자를 파일에 저장
			
		}
		
		
		catch (IOException e) {
			System.out.println("입출력 오류");
		} 
		

//console에서 입력하고(엔터키로 줄바꿔도 됨) ctrl+Z누르면 커서 앞부분까지 txt에 적어줌.
	}

}
