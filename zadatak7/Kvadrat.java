package zadatak7;

public class Kvadrat {
	double povrsina; 
	double obim;
	
	public double izracunajPovrsinu(double str)
    { 
        povrsina = str*str;
        System.out.println("Povrsina kvadrata je " + povrsina);
        return povrsina;
    }
    public double izracunajObim(double str) {
    	obim = 4*str;
    	System.out.println("Obim kvadrata je " + obim);
    	return obim;
    }
}
