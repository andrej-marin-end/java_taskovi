package zadatak7;

import java.lang.Math;

public class Elipsa extends Krug {

public double p;
	
	public Elipsa(double a) {
		super(a);
		ime = "krug";
		r = a;
		izracunajPovrsinu();
		izracunajObim();
	} 
	
	public Elipsa(double a, double b) {
		super(a);
		ime = "elipsa";
		p = a;
		izracunajPovrsinu();
		izracunajObim();
	} 
	
	public Elipsa(double a, double b, double c) {
		super(a);
		ime = "elipsa";
		p = a;
		izracunajPovrsinu();
		izracunajObim();
	} 
	
	public void izracunajPovrsinu()
    { 
        povrsina = r*p*Math.PI;
    }
    public void izracunajObim() {
    	obim = r*Math.PI*(9-Math.sqrt(35))/2;
    }
    
	
}
