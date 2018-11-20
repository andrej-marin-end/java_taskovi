package zadatak8;

public class NekretMain {
	public static void main(String[] args) {
		
		Vlasnik vl = new Vlasnik();
		vl.imePrezime = "Petar Petrovic";
		vl.jmbg = "070605054353405";
		vl.brlk = "00054547";

		//String adr, int zn, double kvd, Vlasnik pv, double povrPdr, double povrTrs
		NekretninaApstr stan = new Stan("Uzicka 23", 1, 566.5, vl, 77, 55);

		stan.izracunajCenu();
		System.out.println(stan);

		NekretninaApstr kuca = new Kuca("Uzicka 24", 4, 56.5, vl, 7);
		kuca.izracunajCenu();
		System.out.println(kuca);
	
	}
}

