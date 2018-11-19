package zadatak7;

public class Krug {
	double povrsina; 
	double obim;
	
	public double izracunajPovrsinu(double r)
    { 
        povrsina = r*r*Math.PI;
        System.out.println("Povrsina kvadrata je " + povrsina);
        return povrsina;
    }
    public double izracunajObim(double strA, double strB, double strC) {
    	obim = 4*strA;
    	System.out.println("Obim kvadrata je " + povrsina);
    	return obim;
    }
	
	
}
