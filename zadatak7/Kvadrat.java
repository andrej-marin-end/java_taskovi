package zadatak7;

public class Kvadrat extends GeometrijskaSlika {
public double a;
	
	public Kvadrat(double a) {
		ime = "kvadrat";
		this.a = a;
		izracunajPovrsinu();
		izracunajObim();
	} 
	
	public Kvadrat(double a, double b) {
		ime = "kvadrat";
		this.a = a;
		izracunajPovrsinu();
		izracunajObim();
	} 
	
	public Kvadrat(double a, double b, double c) {
		ime = "kvadrat";
		this.a = a;
		izracunajPovrsinu();
		izracunajObim();
	} 
	
    public void izracunajPovrsinu()
    { 
        povrsina = a*a;
    }
    public void izracunajObim() {
    	obim = a*4;
    }
}
