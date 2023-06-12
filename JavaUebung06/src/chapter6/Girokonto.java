package chapter6;

public class Girokonto extends Konto{
	private double limit;
	Girokonto(String kontonummer, double kontostand, double limit){
		super(kontonummer,kontostand);
	this.limit = limit;
	}
	
	double getLimit() {
		return this.limit;
	}
	
	public void setLimit(double l) {
		this.limit = l;
	}
	
	@Override
	public void auszahlen(double betrag) {
		if (getKontostand() - betrag >= limit *-1) {
			super.auszahlen(betrag);
		}
		
		else {
			System.out.println("Limit überschritten");
		}

		
	}
	
}
