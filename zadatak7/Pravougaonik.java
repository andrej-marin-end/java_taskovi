package zadatak7;

public class Pravougaonik extends Kvadrat {
	
	public double b;
	
	public Pravougaonik(double a) {
		super(a);
		ime = "kvadrat";
		b = a;
		izracunajPovrsinu();
		izracunajObim();
	} 
	
	public Pravougaonik(double a, double b) {
		super(a);
		ime = "pravougaonik";
		this.b = b;
		izracunajPovrsinu();
		izracunajObim();
	} 
	
	public Pravougaonik(double a, double b, double c) {
		super(a);
		ime = "pravougaonik";
		this.b = b;
		izracunajPovrsinu();
		izracunajObim();
	} 
	
    public void izracunajPovrsinu()
    { 
        povrsina = a*b;
    }
    public void izracunajObim() {
    	obim = a*2 + b*2;
    }
	
}
