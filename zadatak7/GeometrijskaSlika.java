package zadatak7;

public abstract class GeometrijskaSlika {
	public double povrsina;
	public double obim;
	public String ime;
	
	
	public String toString() {
		return "ime :" + ime + "\n"
			 + "obim :" + obim + "\n"
			 + "povrsina :" + povrsina + "\n";
	}
	
	public abstract void izracunajPovrsinu();
	  
	public abstract void izracunajObim();
}
