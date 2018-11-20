package zadatak7;

public class Krug {
	double povrsina; 
	double obim;
	
	public double izracunajPovrsinu(double r)
    { 
        povrsina = r*r*Math.PI;
        System.out.println("Povrsina kruga je " + povrsina);
        return povrsina;
    }
    public double izracunajObim(double r) {
    	obim = 2*r*Math.PI;
    	System.out.println("Obim kruga je " + obim);
    	return obim;
    }
	
	
}
