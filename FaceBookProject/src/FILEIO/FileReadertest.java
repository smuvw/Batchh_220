package FILEIO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadertest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileReader fr=new FileReader("abc.txt");
		
		BufferedReader br=new BufferedReader(fr);
		
		String s = br.readLine();
		
		while(s !=null ){
			
			System.out.println(s);
			s=br.readLine();
		}
		
		
		
			/*int i =fr.read();
			
			while(i !=-1){
				System.out.println((char)i);
				i=fr.read();
			}*/

		fr.close();
	}

}
