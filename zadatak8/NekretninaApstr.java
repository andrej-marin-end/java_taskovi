package zadatak8;

public abstract class NekretninaApstr {
	String adresa;
	int zona1 = 3000;
	int zona2 = 2000;
	int zona3 = 1000;
	int zona4 = 500;
	int zona;
	double kvadratura;
	double cena;
	Vlasnik podaciVlasnik = new Vlasnik();
	int cenaZone;
	
	public NekretninaApstr () {}
	
	public NekretninaApstr (String adr, int zn, double kvd, Vlasnik pv) {
		adresa = adr;
		zona = zn;
		kvadratura = kvd;
		podaciVlasnik = pv;
	}
	
	public abstract void izracunajCenu();
	
	public void racunanjeCeneZone() {
		if(zona == 1) {
			cenaZone = zona1;
			
		}
		if(zona == 2) {
			cenaZone = zona2;
			
		}
		if(zona == 3) {
			cenaZone = zona3;
			
		}
		if(zona == 4) {
			cenaZone = zona4;
			
		}
	}
	
	
	
}
