package zadatak7;

import java.util.Scanner;

public class Geomain {
	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
		
		System.out.println("Izaberi geometrijsku sliku.\nUnesi naziv.");
		String geoSlika = ulaz.next();
		//String izborSlike;
		String trougao = "trougao";
		String kvadrat = "kvadrat";
		String krug = "krug";
		String elipsa = "elipsa";
		String pravougaonik = "pravougaonik";
		String obim = "obim";
		String povrsina = "povrsina";
		
		if (geoSlika.equalsIgnoreCase(trougao)) {
			System.out.println("Izaberi operaciju, obim/povrsinu.");
			String oper = ulaz.next();
			if(oper.equalsIgnoreCase(obim)) {
				System.out.println("Unesi stranicu.");
				Trougao t = new Trougao();
				int a = ulaz.nextInt();
				double OT = t.izracunajObim(a);
			} else if(oper.equalsIgnoreCase(povrsina)) {
				System.out.println("Unesi stranice.");
				Trougao t = new Trougao();
				int a = ulaz.nextInt();
				double PT = t.izracunajPovrsinu(a);
		}
			} else if (geoSlika.equalsIgnoreCase(kvadrat)) {
				System.out.println("Izaberi operaciju, obim/povrsinu.");
				String oper = ulaz.next();
				if(oper.equalsIgnoreCase(obim)) {
					System.out.println("Unesi stranicu.");
					Kvadrat kv = new Kvadrat();
					int k = ulaz.nextInt();
					double okv = kv.izracunajObim(k);
				} else if(oper.equalsIgnoreCase(povrsina)) {
					System.out.println("Unesi stranicu.");
					
					Kvadrat kv = new Kvadrat();
					int k = ulaz.nextInt();
					double pkv = kv.izracunajPovrsinu(k);
				} 
			} else if (geoSlika.equalsIgnoreCase(krug)) {
				System.out.println("Izaberi operaciju, obim/povrsinu.");
				String oper = ulaz.next();
				if(oper.equalsIgnoreCase(obim)) {
					System.out.println("Unesi poluprecnik.");
					Krug kr = new Krug();
					int kg = ulaz.nextInt();
					double okr = kr.izracunajObim(kg);
				} else if(oper.equalsIgnoreCase(povrsina)) {
					System.out.println("Unesi poluprecnik.");
					Krug kr = new Krug();
					int kg = ulaz.nextInt();
					double pkr = kr.izracunajPovrsinu(kg);
				} 
			}
			ulaz.close();
		
	}
}


