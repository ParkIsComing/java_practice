import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte []b= new byte[6];// 비어있는 byte 배열 선언 생성
		
		try {
			FileInputStream fin = new FileInputStream("c:\\Temp\\test.out");// fileinputstream생성
			int n=0, c;
			//fin에서 읽어온게 -1이 아닐때까지 읽은 걸 byte형으로 바꿔서 b[n]에 넣음(n은 0부터 쓰기시작하고 넣은 뒤에 하나씩 증가시킴)
			while((c=fin.read())!=-1){
				b[n]=(byte)c;
				n++;
				
			}
			System.out.println("c:\\Temp\\test.out에서 읽은 배열을 출력합니다.");
			
			for(int i=0;i<b.length;i++) {//배열 길이만큼 b배열 출력
				System.out.print(b[i]+" ");
			}
			System.out.println();
			
			fin.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
		}
		

	}

}
