package zadatak6;

import java.util.Scanner;
import java.util.Arrays;
import java.util.InputMismatchException;

/*ZADATAK6: Za uneti niz celih brojeva duzine n (koja se takodje unosi), sortirati niz, ispitati da li sadrzi broj x 
i ispisati prvih 5 clanova niza na standardni izlaz. Koristiti klasu Arrays.*/

public class Niz_celih_brojeva_provera {
	
	public static void main(String[] args) {	
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesi broj clanova niza, a zatim i niz brojeva.");
		try {
		int brojClanovaNiza = ulaz.nextInt();
		
		int[] niz = new int [brojClanovaNiza]; 
		
		for (int i = 0; i < brojClanovaNiza; i++) {
			niz[i] = ulaz.nextInt();
			
			
	}
		Arrays.sort(niz);
		System.out.println(Arrays.toString(niz));
		//Arrays.sort(niz);
		//System.out.println(Arrays.toString(niz));
		int pretraga = ulaz.nextInt();
		int a = Arrays.binarySearch(niz, pretraga);
		if (a < 0) {
			System.out.println(pretraga + " nije u nizu.");
		} else {
			System.out.println(pretraga + " je u nizu.");
			ulaz.close();
		}
	} catch (InputMismatchException e){
        System.out.println("Niste uneli broj.\nPokreni ponovo.");
        ulaz.nextLine();
    }
	
}
}