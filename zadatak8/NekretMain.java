package zadatak8;

public class NekretMain {
	public static void main(String[] args) {
		
		//fiksirao sam dva vlasnika sa podacima, zbog prikazivanja razlicitosti za stan/kucu
		
		//prvi vlasnik
		Vlasnik vl = new Vlasnik();
		vl.imePrezime = "Petar Petrovic";
		vl.jmbg = "0706050543534";
		vl.brlk = "00054547";
		
		//String adr, int zn, double kvd, Vlasnik pv, double povrPdr, double povrTrs
		NekretninaApstr stan = new Stan("Preka 23", 1, 566.5, vl, 77, 55);
		stan.izracunajCenu();
		System.out.println(stan);

		
		//drugi vlasnik
		Vlasnik vl2 = new Vlasnik();
		vl2.imePrezime = "Petar T. Petrov";
		vl2.jmbg = "0101200543534";
		vl2.brlk = "00020511";
		
		//String adr, int zn, double kvd, Vlasnik pv, double pOkucnice
		NekretninaApstr kuca = new Kuca("Glavna 24", 4, 56.5, vl2, 7);
		kuca.izracunajCenu();
		System.out.println(kuca);
	
	}
}

