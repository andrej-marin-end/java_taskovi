package zadatak7;


public class Geomain {
	public static void main(String[] args) {
		
		GeometrijskaSlika kvadrat = new Kvadrat(8);
		System.out.println(kvadrat);
		
		GeometrijskaSlika trougao = new Trougao(9.8);
		System.out.println(trougao);
		
		GeometrijskaSlika krug = new Krug(4);
		System.out.println(krug);
		
		GeometrijskaSlika pr = new Pravougaonik(8, 5);
		System.out.println(pr.toString());
		try {
		GeometrijskaSlika nt = new NejednakostranicniTrougao(8, 11, 11);
		System.out.println(nt);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		GeometrijskaSlika elipsa = new Elipsa(6, 7.4);
		System.out.println(elipsa);
		
	}
}


