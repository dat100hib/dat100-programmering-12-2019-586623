package no.hvl.dat100.jplab12.oppgave4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JOptionPane;

import no.hvl.dat100.jplab12.oppgave3.*;
import java.io.*;

public class SkrivBlogg {

	private static String MAPPE = System.getProperty("user.dir") + "/src/no/hvl/dat100/jplab12/tests/";

	public static boolean skriv(Blogg samling, String filnavn) {

		boolean funnet = false;
		
		
		try {

		PrintWriter skriver = new PrintWriter(MAPPE + filnavn);
  
		skriver.println(samling.toString());
		
        skriver.close();
        
        funnet = true;
		
	}
		catch (FileNotFoundException e) {
			JOptionPane.showMessageDialog(null, "Feil: Input er ikke en fil");
		}
	
		return funnet;
}
}
