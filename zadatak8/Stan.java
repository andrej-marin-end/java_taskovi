package zadatak8;

public class Stan extends NekretninaApstr {
	private double povrsinaPodruma;
	private double povrsinaTerase;
	
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
		return "Adresa stana : " + adresa + "\nVlasnik stana : " + podaciVlasnik.getImePrezime() + ", Jmbg " + podaciVlasnik.getJmbg() + ", Br.lk. " + podaciVlasnik.getBrlk() + "\nCena stana : " + cena + "\n"; 
	}
	
}
