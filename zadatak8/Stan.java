package zadatak8;

public class Stan extends NekretninaApstr {
	double povrsinaPodruma;
	double povrsinaTerase;
	
	double cenaPodrumaITerase;
	
	public void racunanjeCenePodrumaITerase() {
		cenaPodrumaITerase = (povrsinaPodruma + povrsinaTerase) * cenaZone * 0.33;
		
	}
	
	public Stan(String adr, int zn, double kvd, Vlasnik pv, double povrPdr, double povrTrs) {
		super(adr, zn, kvd, pv);
		povrsinaPodruma = povrPdr;
		povrsinaTerase = povrTrs;
	}
	
	@Override
	public void izracunajCenu() {
		racunanjeCeneZone();
		racunanjeCenePodrumaITerase();
		
		cena = cenaZone*kvadratura + cenaPodrumaITerase;
		
	}
	public String toString() {
		return "adresa :" + adresa + "\nvlasnik :" + podaciVlasnik.imePrezime + " " + podaciVlasnik.jmbg + " " + podaciVlasnik.brlk + "\ncena :" + cena; 
	}
	
}
