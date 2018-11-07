package zadatak5;
import java.util.Scanner;

public class Studenti_poeni {
	public static void main(String[] args) {
		
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesi broj studenata");
		int brojStud = ulaz.nextInt();
		
		/*System.out.println("Unesi imena studenata. Zatim i njihovih poena.");
		String imeStud;
		int poeniStudenata = brojStud;
		int brojPoena;*/
		
		String ime;
		int poeni;
		
        for (int i = 1; i<=brojStud; i++) {
        	Scanner ulaz1 = new Scanner(System.in);
    		System.out.println("Unesi ime studenta");
    		ime = ulaz.next();
    		System.out.println("Unesi poene");
    		poeni = ulaz.nextInt();
        }
		
		
		
		
	}
}
