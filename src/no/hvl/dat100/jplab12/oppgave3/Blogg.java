package no.hvl.dat100.jplab12.oppgave3;

import no.hvl.dat100.jplab12.common.TODO;
import no.hvl.dat100.jplab12.oppgave1.*;
import no.hvl.dat100.jplab12.oppgave2.*;

public class Blogg {

	private Innlegg[] innleggTab;
	private int nesteLedig;
	
	public Blogg() {
		innleggTab = new Innlegg[20];
		this.nesteLedig = 0;
	}

	public Blogg(int lengde) {
		innleggTab = new Innlegg[lengde];
		this.nesteLedig = 0;
	}

	public int getAntall() {
	return nesteLedig;
	}
	
	public Innlegg[] getSamling() {
		return innleggTab;
	}
	
	public int finnInnlegg(Innlegg innlegg) {

		int p = -1;
		int i = 0;
		while (i < nesteLedig && p == -1) {
			if (innleggTab[i] != null && innleggTab[i].erLik(innlegg)) {
				p = i;
			}
			i++;
		}
		return p;
		
	}

	public boolean finnes(Innlegg innlegg) {
		boolean foundIt = false;
		for (int i = 0; i < innleggTab.length; i++) {
			if (innleggTab[i] != null && innleggTab[i].getId() == innlegg.getId()) {
				foundIt = true;
			}
		}
		return foundIt;
	}

	public boolean ledigPlass() {
//Kan gjøre "return (antall < tabell.length)
		if(nesteLedig < innleggTab.length) {
			return true;
		} else {
			return false;
		}
		
	}
	
	public boolean leggTil(Innlegg innlegg) {
		int p = finnInnlegg(innlegg);
		if (p <= 0 && ledigPlass()) {
			innleggTab[nesteLedig] = innlegg;
			nesteLedig++;
			return true;
		} else {
			return false;
		}
		
		
	}
	
	public String toString() {
		String str = nesteLedig + "\n";
		for (int i = 0; i < nesteLedig; i++) {
			if (innleggTab[i] instanceof Bilde && innleggTab[i] != null) {
				Bilde bildeObj = (Bilde) innleggTab[i];
				str += bildeObj.toString();
			} else {
				Tekst tekstObj = (Tekst) innleggTab[i];
				str += tekstObj.toString();
			}
		}
		
		return str;
	
	}

	// valgfrie oppgaver nedenfor
	
	public void utvid() {
	
		Innlegg[] nyTab = new Innlegg[innleggTab.length*2];
		
		for (int i = 0; i < nesteLedig; i++) {
			nyTab[i] = innleggTab[i];
		}
		
		// Spør hvorfor man bruker innleggTab = nyTab
		// og ikke bare for-løkken for å bli ferdig
		
		innleggTab = nyTab;
	}
	
	public boolean leggTilUtvid(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
		
	}
	
	public void slett(Innlegg innlegg) {
		
		int p = finnInnlegg(innlegg);
		if (p >= 0) {
			nesteLedig--;
			innleggTab[p] = innleggTab[nesteLedig];
			innleggTab[nesteLedig] = null;
			System.out.println("True");
		} 
	}
	
	public int[] search(String keyword) {
		
		throw new UnsupportedOperationException(TODO.method());

	}
}