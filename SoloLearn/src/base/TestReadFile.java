package base;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.sound.midi.SysexMessage;

public class TestReadFile {

	public static void main(String[] args) throws IOException {
		File fl = new File("fileprova","prova1" + ".txt");
		File dir = new File ("fileprova");
		
		int x;
		
		if (fl.exists() == false) {
			System.out.println("spiacenti, il file non esiste");
			System.exit(0);
		}
		
		FileReader fr = new FileReader(fl);
		while((x =fr.read())!= -1) // read legge un carattere per volta 
			System.out.print((char)x); // devo fare il cast per convertire il metodo di lettura da byte a char
		                              //print e non println perchè ad ogni lettera letta andrebbe a capo
	}

}
