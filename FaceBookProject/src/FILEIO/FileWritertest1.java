package FILEIO;

import java.io.File;
import java.io.IOException;

public class FileWritertest1 {

	public static void main(String[] args) throws IOException {
		
		
		//File
		
		
		   //File f= new File("abc.txt");
		//System.out.println(f.exists());
		
		//f.createNewFile();
		//System.out.println(f.exists());
		
		File f= new File("Training");
		//f.mkdir();
		
		File f1=new File(f,"test444.txt");
		f1.createNewFile();
		
		

	}

}
