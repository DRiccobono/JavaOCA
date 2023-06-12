package chapter6;

public class BruchMitSeriennummer extends Bruch {
	private final int seriennummer;
	private static int aktuelleSeriennummer = 1;
	
	BruchMitSeriennummer(int zaehler, int nenner){
		super(zaehler, nenner);
		this.seriennummer = aktuelleSeriennummer++;
	}
	
	public int getSeriennummer() {
		return this.seriennummer;
	}
	
}
