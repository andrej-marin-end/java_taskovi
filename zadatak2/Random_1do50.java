package zadatak2;
import java.util.Scanner;
import java.util.Random;

public class Random_1do50 {
	public static void main(String[] args) {
        // TODO Auto-generated method stub
    Random rand = new Random();
    int zadatiBroj = rand.nextInt(50);
    Scanner ulaz = new Scanner(System.in);
    int unetiBroj;
    boolean pogodak = false;
    
    while (pogodak == false) {
    //	int zadatiBroj = rand.nextInt(50);
        System.out.println("Pogodi broj izmedju 0 i 50:");
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
    }
}