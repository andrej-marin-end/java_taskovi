package UdemyTutorials;

import java.util.InputMismatchException;
import java.util.Scanner;

public class noviDigitron {
	
	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
		pocetnaPoruka();
		unos();
		zbir();
		char znak;
		znak = ulaz.next().charAt(0);
		
        if (znak == 's') {
        	zbir();
        }
        
	}
	
	public static void unos() {
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite prvi broj:");
        int prviBroj = ulaz.nextInt();
        System.out.println("Unesite drugi broj:");
        int drugiBroj = ulaz.nextInt();
        //char znak;
        ulaz.close();
	}
	
	static void pocetnaPoruka () {
		System.out.println("Ovo je jednostavan diitron.");
		System.out.println("Za sabiranje unesite znak s: ");
        System.out.println("Za oduzimanje drugog od prvog broja, unesite znak o: ");
        System.out.println("Za mnozenje brojeva unesite znak m: ");
        System.out.println("Ukoliko zelite da podelite prvi broj sa drugim brojem, unesite znak d: ");
        System.out.println("");
	}
	
	public static void zbir() {
		Scanner ulaz = new Scanner(System.in);
		int prviBroj = ulaz.nextInt();
        int drugiBroj = ulaz.nextInt();
		int z = prviBroj + drugiBroj;
		System.out.println(z);
		ulaz.close();
		
	}
	
	
	

}
