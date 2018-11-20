package zadatak8;

public class Kuca extends NekretninaApstr {
	double povrsOkucnice;
	double cenaOkucnice;
	
	
	public void racunanjeCeneOkucnice() {
		cenaOkucnice = povrsOkucnice*cenaZone*0.15;
		
	}
	
	
	public Kuca(String adr, int zn, double kvd, Vlasnik pv, double povrOkucnice) {
		super(adr, zn, kvd, pv);
		povrsOkucnice = povrOkucnice;
		
	}
	
	@Override
	public void izracunajCenu() {
		racunanjeCeneZone();
		racunanjeCeneOkucnice();
		
		cena = cenaZone*kvadratura + cenaOkucnice; //plus sve ostalo
		
	}
	public String toString() {
		return "adresa :" + adresa + "\nvlasnik :" + podaciVlasnik.imePrezime + " " + podaciVlasnik.jmbg + " " + podaciVlasnik.brlk + "\ncena :" + cena; 
	}
}
