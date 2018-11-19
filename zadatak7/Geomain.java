package zadatak7;

public class Geomain {
	public static void main(String[] args) {
		
		Trougao t = new Trougao();
		double OT = t.izracunajObim(2, 3, 4);
		System.out.println(OT);
		
		Kvadrat k = new Kvadrat();
		double OK = k.izracunajObim(3);
		System.out.println(OK);
		
	}
}
