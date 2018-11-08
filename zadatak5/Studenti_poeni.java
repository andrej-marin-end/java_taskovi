package zadatak5;

import java.util.Scanner;

public class Studenti_poeni {
	public static void main(String[] args) {
		
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesi broj studenata:");
		int brojStud = ulaz.nextInt();
		
		String imeStud = "";
		int maxPoeni = 0;
		
		
        for (int i = 1; i<=brojStud; i++) 
        {
    		System.out.println("Unesi ime studenta");
    		String Student = ulaz.next();
    		System.out.println("Unesi poene");
    		int brojPoena = ulaz.nextInt();
    		
    		if (brojPoena > maxPoeni) {
    			imeStud = Student;
    			maxPoeni = brojPoena;	
    		} else if (brojPoena == maxPoeni) {
    			
    			System.out.println("Studenti" + imeStud + maxPoeni + "imaju jednak broj poena.");
    		}
        }
		System.out.print("Najveci broj poena ima:" + imeStud + ", " + maxPoeni);	
		ulaz.close();
	}
}
