import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte [] b= {7,51,3,4,-1,24};
		
		FileOutputStream fout;
		try {
			fout = new FileOutputStream("c:\\Temp\\test.out");
			for(int i=0;i<b.length;i++)
				fout.write(b[i]);
			fout.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			
			
		}
		System.out.println("c:\\Temp\\test.out을 저장하였습니다.");
		
		
		
		
	}

}
