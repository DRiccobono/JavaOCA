package chapter6;

public class Konto {
	private String kontonummer;
	private double kontostand;
	public Konto() {super();}		
	
	public Konto(String kontonummer, double kontostand){
		this.kontonummer = kontonummer;
		this.kontostand = kontostand;
	}
	
	double getKontostand() {
		return this.kontostand;
	}
	
	public void setKontostand(double kontostand) {
		this.kontostand = kontostand;
	}
	
	public String getKontonummer() {
		return this.kontonummer;
	}
	
	public void einzahlen(double betrag) {
		this.kontostand += betrag;
	}
	
	public void auszahlen(double betrag) {
		this.kontostand -= betrag;
	}
}
