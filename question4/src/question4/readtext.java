package question4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class readtext {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File src = new File("c:\\temp\\test.txt"); 
		int c;
		FileReader fr;
		try {
			fr = new FileReader(src);
			while((c=fr.read())!=-1) {
				System.out.print((char)c);
			}
			
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	
		

	}

}
