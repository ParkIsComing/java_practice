import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte []b= new byte[6];// ����ִ� byte �迭 ���� ����
		
		try {
			FileInputStream fin = new FileInputStream("c:\\Temp\\test.out");// fileinputstream����
			int n=0, c;
			//fin���� �о�°� -1�� �ƴҶ����� ���� �� byte������ �ٲ㼭 b[n]�� ����(n�� 0���� ��������ϰ� ���� �ڿ� �ϳ��� ������Ŵ)
			while((c=fin.read())!=-1){
				b[n]=(byte)c;
				n++;
				
			}
			System.out.println("c:\\Temp\\test.out���� ���� �迭�� ����մϴ�.");
			
			for(int i=0;i<b.length;i++) {//�迭 ���̸�ŭ b�迭 ���
				System.out.print(b[i]+" ");
			}
			System.out.println();
			
			fin.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
		}
		

	}

}
