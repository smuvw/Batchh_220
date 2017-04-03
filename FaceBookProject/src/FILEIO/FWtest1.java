package FILEIO;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FWtest1 {

	public static void main(String[] args) throws IOException {
	
		//FileWriter
		
	/*	FileWriter fw=new FileWriter("abc.txt");
		fw.write("sri");
		fw.write('\n');
		fw.write("98");
		fw.write('\n');
		fw.write("Muvva");
		fw.write('\n');
	    fw.write("Chicago");
		fw.write('\n');
	    fw.write("welcome to Java Training \n  in Krishna Training");
	    fw.flush();
	    fw.close();*/
	    
	    
	    //BufferdWriter
	/*	FileWriter fw=new FileWriter("abc.txt");
		BufferedWriter bw= new BufferedWriter(fw);
		
		bw.write("testing");
		bw.newLine();
		bw.write(98);
		bw.newLine();
		bw.write("Java");
		bw.flush();
		bw.close();*/
		
		//PrintWriter
		
		FileWriter fw=new FileWriter("abc.txt");
		
		PrintWriter pw=new PrintWriter(fw);
		
		pw.println("welcome to java");
		pw.println("welcome to Selenium");
		pw.println(98);
		pw.println(98.25);
		pw.flush();
		pw.close();

	}

}
