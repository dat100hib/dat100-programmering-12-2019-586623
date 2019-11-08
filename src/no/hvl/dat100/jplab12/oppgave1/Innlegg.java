package no.hvl.dat100.jplab12.oppgave1;

import no.hvl.dat100.jplab12.common.TODO;

public abstract class Innlegg {
	
	private int id;
	private String bruker;
	private String dato;
	private int likes;
	
	
	public Innlegg() {
		
	}
	
	public Innlegg(int id, String bruker, String dato) {

		this.id = id;
		this.bruker = bruker;
		this.dato = dato;
		likes = 0;
		
	}

	public Innlegg(int id, String bruker, String dato, int likes) {
		this.id = id;
		this.bruker = bruker;
		this.dato = dato;
		this.likes = likes;
	}
	
	public String getBruker() {
		
		return this.bruker;
		
	}

	public void setBruker(String bruker) {
		this.bruker = bruker;
	}

	public String getDato() {
		return this.dato;
		
	}

	public void setDato(String dato) {
		this.dato = dato;
	}

	public int getId() {
		return this.id;

	}

	public int getLikes() {
		return this.likes;
	}
	
	public void doLike () {
		this.likes += 1;
		
	}
	
	//Implementer metoden public boolean erLik(Innlegg innlegg) som returnerer true hvis og kun hvis 
	//innlegget har samme id som innlegget innlegg git med som parameter.
	
	public boolean erLik(Innlegg innlegg) {

		if (this.id == innlegg.getId()) {
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public String toString() {
		
		return this.id + "\n" + this.bruker + "\n" + this.dato + "\n" + this.likes + "\n"; 
		
	}
	
	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
		
		throw new UnsupportedOperationException(TODO.method());
				
	}
}
