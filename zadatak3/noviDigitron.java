package zadatak3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class noviDigitron {
	
	public static void main(String[] args) {
		System.out.println("Unesi dva broja:");
		Scanner ulaz = new Scanner(System.in);
		int prviBr = ulaz.nextInt();
		int drugiBr = 0;
		try {
		drugiBr = ulaz.nextInt();
			if (drugiBr == 0) {
				System.out.println("Nulom se ne deli.\nPokusajte ponovo.");
			}
		} catch (InputMismatchException e){
            ulaz.nextLine();
        }
		int rezultat;
		uputstvo();
		
		String operacija = ulaz.next();
		
		switch(operacija) {
		case "+": rezultat=zbir(prviBr, drugiBr);
		System.out.println(rezultat);
		break;
		case "-": rezultat=razlika(prviBr, drugiBr);
		System.out.println(rezultat);
		break;
		case "*": rezultat=proizvod(prviBr, drugiBr);
		System.out.println(rezultat);
		break;
		case "/": rezultat=kolicnik(prviBr, drugiBr);
		System.out.println(rezultat);
		break;
		}
		ulaz.close();
		
		
	}
	public static void uputstvo () {
		System.out.println("Za sabiranje unesi (+)");
		System.out.println("Za oduzimanje unesi (-)");
		System.out.println("Za mnozenje unesi (*)");
		System.out.println("Za deljenje unesi (/)");
	}
	public static int zbir (int a, int b) {
		return a + b;
	}
	public static int razlika (int a, int b) {
		return a - b;
	}
	public static int proizvod (int a, int b) {
		return a * b;
	}
	public static int kolicnik (int a, int b) {
		return a / b;
	}
	
}	
	