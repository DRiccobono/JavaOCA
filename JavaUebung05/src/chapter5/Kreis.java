package chapter5;

public class Kreis {
	
	double radius;
	
	public Kreis() {
		
		this.radius = 0;
	}
	
	public Kreis(double radius) {
		this.radius = radius;
	}
	
	
	//getter
	
	public double getRadius() {
		return radius;
	}
	
	
	public String getUmfang() {
		double umfang = 2 * Math.PI * radius;
		String ausgabe = "" + String.format("%.2f", umfang);
		return ausgabe;

	}
	
	public String getFlaeche () {
		double flaeche = Math.PI * radius * radius;
		String ausgabe = "" + String.format("%.2f", flaeche);
		return ausgabe;
	}
	
	
	//setter
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public void setRadByUmfang(double u) {
		this.radius = u / 2 * Math.PI;
		System.out.println("Kreisradius: " + String.format("%.2f", this.radius));
	}
	
	public void setRadByFlaeche(double f) {
		this.radius = Math.sqrt(f / Math.PI);
		System.out.println("Kreisradius: " + String.format("%.2f", this.radius));
	}
	
	public void setRadiuserhoehung(double rh) {
		this.radius += rh;
	}
}


