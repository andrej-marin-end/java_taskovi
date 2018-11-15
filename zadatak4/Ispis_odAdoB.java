package zadatak4;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ispis_odAdoB {
	public static void main(String[] args) {
		
		Scanner ulaz = new Scanner(System.in);
		try {
		System.out.println("Unesite prvi broj:");
		int a = ulaz.nextInt();
        System.out.println("Unesite drugi broj:");
		int b = ulaz.nextInt();
		int c;
            if(a>=b){
                System.out.println("Drugi broj mora biti manji.");
            }
		ulaz.close();
		c = a;
		do	 {	
			 if (c%2 == 0) 
				 System.out.print(c + ", ");
			 c++;
		}
			 while (c<=b);
		
		} catch (InputMismatchException e){
        System.out.println("Niste uneli broj.\nPokusajte ponovo.");
        ulaz.nextLine();
    }	
	}
}


	