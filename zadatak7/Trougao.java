package zadatak7;

import java.lang.Math;

public class Trougao {
	double povrsina; 
	double poluobim;
	double obim;
	
    public double izracunajPovrsinu(double strA, double strB, double strC)
    { 
        poluobim = 1/2 * (strA + strB + strC);
        povrsina = Math.sqrt(poluobim*(poluobim-strA)*(poluobim-strB)*(poluobim-strC));
        System.out.println("Povrsina trougla je " + povrsina);
        return povrsina;
    }
    public double izracunajObim(double strA, double strB, double strC) {
    	obim = strA + strB + strC;
    	System.out.println("Obim trougla je " + povrsina);
    	return obim;
    }
}
