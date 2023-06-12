package chapter6;

public class Anteil extends Bruch {
	
	public static Bruch verteilterAnteil = new Bruch();
	
	Anteil(){
		this(0, 1);
	}
	
	Anteil(int zaehler, int nenner){
		super(zaehler,nenner);
		
		verteilterAnteil = verteilterAnteil.addiere(this);
		
		if(verteilterAnteil.dezimalwert() > 1) {
			System.out.println("zuviel verteilt! nix mehr übrig");
			
		}
	}
	
	public double getVerteilt() {
		return verteilterAnteil.dezimalwert();
	}
	
	public Bruch getRest() {
		Bruch meinBruch = new Bruch();
		return meinBruch.subtrahiere(verteilterAnteil);
	}
}
