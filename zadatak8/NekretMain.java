package zadatak8;

public class NekretMain {
	public static void main(String[] args) {
		
		//fiksirao sam dva vlasnika sa podacima, zbog prikazivanja razlicitosti za stan/kucu
		
		//prvi vlasnik
		Vlasnik vl = new Vlasnik("Marino", "0015256", "54325");
		
		NekretninaApstr stan = new Stan("Preka 23", 1, 566.5, vl, 77, 55);
		stan.izracunajCenu();
		System.out.println(stan);

		
		
		
		
		
		//drugi vlasnik
		Vlasnik vl2 = new Vlasnik("Petar T. Petrov","0101200543534","00020511");
		
		//String adr, int zn, double kvd, Vlasnik pv, double pOkucnice
		NekretninaApstr kuca = new Kuca("Glavna 24", 4, 56.5, vl2, 7);
		kuca.izracunajCenu();
		System.out.println(kuca);
	
	}
}

