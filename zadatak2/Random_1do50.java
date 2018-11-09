/**Napisati program za pogadjanje slucajno generisanog broja u opsegu od 1 do 50.
Program treba da radi na sledeci nacin: Korisnik preko standardnog ulaza unosi jedan ceo broj. 
Broj koji treba pogoditi treba generisati u opsegu od 1 do 50 koristeci klasu Random. 
Posle toga ispisati taj trazeni broj na standardni izlaz i u zavisnosti od rezultata pogadjanja ispisati i odgovarajucu poruku. 
Ako je pogodjen tacan broj (pored saveta da odigra loto) napisati: “Neverovatno! Pogodili ste tacan broj!”, 
ako je razlika izmedju brojeva 5 ili manja: “Dobar pokusaj, bili ste jako blizu!”, 
i ako je razlika veca od 5: “Vise srece sledeci put...”.
*/

package zadatak2;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Random;

public class Random_1do50 {
	public static void main(String[] args) {
        // TODO Auto-generated method stub
		
	
//Definisanje promenljivih	
    Random rand = new Random();
    int zadatiBroj = rand.nextInt(50);
    Scanner ulaz = new Scanner(System.in);
    int unetiBroj;
    boolean pogodak = false;
    
    
    while (pogodak == false) {
    
        System.out.println("Pogodi broj izmedju 0 i 50:");
        
//Definisanje izuzetaka
        try {
            unetiBroj = ulaz.nextInt();
            if(unetiBroj > 50 || unetiBroj < 1){
                System.out.println("Niste uneli broj izmedju 1 i 50.\nPokusajte ponovo.");
                continue;
            }
        } catch (InputMismatchException e){
            System.out.println("Niste uneli broj.\nPokusajte ponovo.");
            ulaz.nextLine();
        }
        unetiBroj = ulaz.nextInt();
        
        if (unetiBroj == zadatiBroj) {
            pogodak = true;
        
        }
        else if (Math.abs(unetiBroj - zadatiBroj) <= 5) {
            System.out.println("Dobar pokusaj, bili ste jako blizu!");
        }
        else{
            System.out.println("Vise srece sledeci put...");
        }
    }
        System.out.println("Neverovatno! Pogodili ste tacan broj!");
        ulaz.close();
    
	}
}