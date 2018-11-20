package zadatak7;

import java.lang.Math;

public class Izved_elipsa extends Krug {
	//double povrsina; 
	//double obim;
	
	public double izracunajPovrsinu(double A, double B)
    { 
        povrsina = A*B*Math.PI;
        System.out.println("Povrsina elipse je " + povrsina);
        return povrsina;
    }
    public double izracunajObim(double A, double B) {
    	obim = A*Math.PI*(9-Math.sqrt(35))/2;
    	System.out.println("Obim elipse je " + obim);
    	return obim;
    }
}
