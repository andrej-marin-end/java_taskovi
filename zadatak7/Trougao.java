package zadatak7;

import java.lang.Math;

public class Trougao extends GeometrijskaSlika {
	
public double a;
	
	public Trougao(double a) {
		ime = "trougao";
		this.a = a;
		izracunajPovrsinu();
		izracunajObim();
	} 
	
	public Trougao(double a, double b) {
		ime = "trougao";
		this.a = a;
		izracunajPovrsinu();
		izracunajObim();
	} 
	
	public Trougao(double a, double b, double c) {
		ime = "trougao";
		this.a = a;
		izracunajPovrsinu();
		izracunajObim();
	} 
	
    public void izracunajPovrsinu()
    { 
        povrsina = a*a*Math.sqrt(3)/4;
    }
    
    public void izracunajObim() {
    	obim = a*3;
    }
}
