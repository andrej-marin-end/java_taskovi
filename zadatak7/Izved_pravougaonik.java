package zadatak7;

public class Izved_pravougaonik extends Kvadrat {
	//double povrsina; 
	//double obim;
	
	public double izracunajPovrsinu(double str, double strB)
    { 
        povrsina = str*strB;
        System.out.println("Povrsina pravougaonika je " + povrsina);
        return povrsina;
    }
    public double izracunajObim(double str, double strB) {
    	obim = 2*str+2*strB;
    	System.out.println("Obim pravougaonika je " + obim);
    	return obim;
    }
}
