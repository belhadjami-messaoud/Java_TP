import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.xml.stream.events.EndDocument;

public class main {

	public static void main(String[] args) throws IOException {
		int character;
		String str;
		String line;
		Scanner clavierScanner  = new Scanner(System.in);
		System.out.println("Donner le nome du Ficher");
		String nomFicherString = clavierScanner.next();
		
		PrintStream ps = new PrintStream(nomFicherString);
		
		ps.append("eeeeeeeeeeeeeeeefzef");
		ps.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//read char by char
		FileReader fileReader = new FileReader(nomFicherString);
		
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		
		LineNumberReader lineNumberReader = new LineNumberReader(bufferedReader);
		
		
		
		
		
		while ((line= lineNumberReader.readLine()) != null) {
			System.out.println(lineNumberReader.getLineNumber() + "-" + line); 
			
		}
		
		
		/*
		while ((str= bufferedReader.readLine()) != null) {
			System.out.println(str); 
			
		}
		*/
		
		/*
		while ((character = fileReader.read()) != -1) {
            System.out.print( character); 
            break;
        }
		*/
		
		
	}

}
