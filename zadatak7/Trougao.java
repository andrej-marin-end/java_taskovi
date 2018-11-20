package zadatak7;

import java.lang.Math;

public class Trougao {
	double povrsina; 
	double obim;
	
    public double izracunajPovrsinu(double strA)
    { 
        povrsina = strA*strA*Math.sqrt(3)/4;
        System.out.println("Povrsina trougla je " + povrsina);
        return povrsina;
    }
    public double izracunajObim(double strA) {
    	obim = strA*3;
    	System.out.println("Obim trougla je " + obim);
    	return obim;
    }
}
