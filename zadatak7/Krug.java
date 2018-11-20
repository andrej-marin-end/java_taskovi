package zadatak7;

public class Krug extends GeometrijskaSlika{
	
	public double r;
	
	public Krug(double a) {
		ime = "krug";
		r = a;
		izracunajPovrsinu();
		izracunajObim();
	} 
	
	public Krug(double a, double b) {
		ime = "krug";
		r = a;
		izracunajPovrsinu();
		izracunajObim();
	} 
	
	public Krug(double a, double b, double c) {
		ime = "krug";
		r = a;
		izracunajPovrsinu();
		izracunajObim();
	} 
	
	public void izracunajPovrsinu()
    { 
        povrsina = r*r*Math.PI;
    }
    public void izracunajObim() {
    	obim = 2*r*Math.PI;
    }
	
	
}
