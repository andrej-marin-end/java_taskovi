package zadatak3;

import java.util.Scanner;

public class Digitron1 {

	public static void main(String[] args) {

		Scanner ulaz = new Scanner(System.in);
        int prviBroj;
        int drugiBroj;
        char znak;
        System.out.println("Unesite prvi broj:");
        prviBroj = ulaz.nextInt();
        System.out.println("Unesite drugi broj:");
        drugiBroj = ulaz.nextInt();
        
           System.out.println("Za sabiranje unesite znak s: ");
           System.out.println("Za oduzimanje drugog od prvog broja, unesite znak o: ");
           System.out.println("Za mnozenje brojeva unesite znak m: ");
           System.out.println("Ukoliko zelite da podelite prvi broj sa drugim brojem, unesite znak d: ");
 
           
           znak = ulaz.next().charAt(0);
           switch(znak) {
          
           case 's':{
              int zbir = prviBroj + drugiBroj;
              System.out.println("Rezultat je: " + zbir);
              break;
          }
          case 'o':{
              int razlika = prviBroj - drugiBroj;
              System.out.println("Rezultat je: " + razlika);
              break;
          }
          case 'm':{
              int proizvod = prviBroj * drugiBroj;
              System.out.println("Rezultat je: " + proizvod);
              break;
          }
          case 'd':{
              int kolicnik = prviBroj / drugiBroj;
              System.out.println("Rezultat je: " + kolicnik);
          }
           }
           ulaz.close();
    }

}