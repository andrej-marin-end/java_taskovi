package zadatak8; 

public class Kuca extends NekretninaApstr {
	private double povrsOkucnice;
	private double cenaOkucnice;
	
	public void racunanjeCeneOkucnice() {
		cenaOkucnice = povrsOkucnice*cenaZone*0.15;	
	}
	
	public Kuca(String adr, int zn, double kvd, Vlasnik pv, double pOkucnice) {
		super(adr, zn, kvd, pv);
		povrsOkucnice = pOkucnice;	
	}
	
	@Override
	public void izracunajCenu() {
		racunanjeCeneZone();
		racunanjeCeneOkucnice();
		cena = cenaZone*kvadratura + cenaOkucnice;
	}
	
	public String toString() {
		return "Adresa kuce : " + adresa + "\nVlasnik kuce : " + podaciVlasnik.getImePrezime() + ", " + "Jmbg " + podaciVlasnik.getJmbg() + ", " + "Br.lk. " + podaciVlasnik.getBrlk() + "\nCena kuce : " + cena; 
	}
}
