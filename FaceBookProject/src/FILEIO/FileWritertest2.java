package FILEIO;

import java.io.File;

public class FileWritertest2 {

	public static void main(String[] args) {
		
		File f=new File("Training");
		
		//System.out.println(f.getAbsolutePath());
	String[] s=f.list();
	
	 for (String s1:s) {
		 System.out.println(s1);
	 }


	}

}
