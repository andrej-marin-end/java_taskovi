package zadatak7;

import java.lang.Math;

public class NejednakostranicniTrougao extends Trougao {
	
	public double poluobim;
	public double b;
	public double c;
	
	public NejednakostranicniTrougao(double a) {
		super(a);
		ime = "trougao";
		b = a;
		c = a;
		izracunajPovrsinu();
		izracunajObim();
	} 
	
	public NejednakostranicniTrougao(double a, double b) {
		super(a);
		ime = "jednakokraki trougao";
		this.b = b;
		c = b;
		izracunajPovrsinu();
		izracunajObim();
	} 
	
	public NejednakostranicniTrougao(double a, double b, double c) throws Exception {
		super(a);
		if (a==b || a==c || b==c) {
			throw new Exception("Nije nejednakostranicni.");
		}
		ime = "nejednakostranicni trougao";
		this.b = b;
		this.c = c;
		izracunajPovrsinu();
		izracunajObim();
	} 
	
	public void izracunajPovrsinu()
    { 
		poluobim = 0.5 * (a + b + c);
        povrsina = Math.sqrt(poluobim*(poluobim-a)*(poluobim-b)*(poluobim-c));
    }
    public void izracunajObim() {
    	obim = a + b + c;
    }

}
