package zadatak7;

public abstract class Geo_slika {
	int povrsina;
	int obim;
	
	
	abstract void izracunajPovrsinu();
	
	public int getPovrsina() {
		return povrsina;
	}
	
	
	abstract void izracunajObim();

	
	public int getObim() {
		return obim;
	}
}
