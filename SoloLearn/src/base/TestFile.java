package base;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TestFile {

	public static void main(String[] args) throws IOException {
		File f = new File("fileprova", "prova1" + ".txt");
		File directory = new File("fileprova");
		final String acapo = "\n";
		Scanner sc = new Scanner(System.in);
		String s;
		
		if (directory.exists() == false)  directory.mkdir();
		if (f.exists() == false)  f.createNewFile();
		
		FileWriter fw = new FileWriter(f, true);
		
		System.out.println("****Documento di testo**** / digita stop per salvare ");
		do {
		s = sc.nextLine();
		if (!s.equalsIgnoreCase("stop"))
		fw.write(s + acapo);
		
		}while(!s.equalsIgnoreCase("Stop")); 
		    fw.flush();
		    fw.close();
			System.out.println("E' stato inserito il contenuto da lei scritto nel file di testo");
		

	}

}
