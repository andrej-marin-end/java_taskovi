package zadatak8;

public class Kuca extends NekretninaApstr {
	double povrsOkucnice;
	double cenaOkucnice;
	
	public double racunanjeCeneOkucnice() {
		cenaOkucnice = povrsOkucnice*zona*0.15;
		return cenaOkucnice;
	}
}
