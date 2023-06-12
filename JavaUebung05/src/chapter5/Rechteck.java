package chapter5;

public class Rechteck {
	double laenge;
	double breite;

	
	public Rechteck() {
		this.laenge = 0;
		this.breite = 0;
	}
	
	public Rechteck(double laenge, double breite) {
		this.laenge = laenge;
		this.breite = breite;
	}
	// setter
	
	public void setLaenge(double l) {
		this.laenge = l;
	}
	
	public void setBreite(double b) {
		this.breite = b;
	}
	
	public void setSeiten(double l, double b) {
		this.laenge = l;
		this.breite = b;
	}
	
	//getter
	
	double getLaenge() {
		return this.laenge;
	}
	
	double getBreite() {
		return this.breite;
	}
	
	double getLangeSeite() {
		if (this.laenge <= this.breite) {			
		return this.breite;
		}
		if (this.laenge >= this.breite) {			
			return this.laenge;
		}
		return 0;
	}
	double getKurzeSeite() {
		if (this.breite >= this.laenge) {			
			return this.laenge;
		}
		if (this.breite <= this.laenge) {			
			return this.breite;
		}
		return 0;
	}
	
	double getFlaeche() {
		return this.laenge * this.breite;
	}
	
	double getUmfang() {
		return (this.laenge * 2) + (this.breite * 2);
	}
	
	double getDiagonale() {
		return Math.sqrt(this.laenge * this.laenge + this.breite * this.breite);
	}
	
	void laengeAusgeben() {
		double laenge = 5.4;
		System.out.println("Länge: " + laenge);
	}
	
	void laengeVergroessern (double l) {
		this.laenge += l;
		System.out.println("Länge vergößert: " + this.laenge);
	}
	
	void breiteVergroessern (double b) {
		this.breite += b;
		System.out.println("Breite vergößert: " + this.breite);
	}
	
	void laengeVerkleinern (double l) {
		this.laenge -= l;
		System.out.println("Länge verkleinert: " + this.laenge);
	}
	
	void breiteVerkleinern (double b) {
		this.breite -= b;
		System.out.println("Breite verkleinert: " + this.breite);
	}
}
