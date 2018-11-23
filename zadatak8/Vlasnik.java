package zadatak8;

public class Vlasnik {
	private String imePrezime;
	private String jmbg;
	private String brlk;
	
	public Vlasnik (String imePrezime, String jmbg, String brlk) {
		this.imePrezime = imePrezime;
		this.jmbg = jmbg;
		this.brlk = brlk;
	}
	
	public Vlasnik() {
		// TODO Auto-generated constructor stub
	}

	public String getImePrezime() {
		return imePrezime;
	}
	public void setImePrezime(String imePrezime) {
		this.imePrezime = imePrezime;
	}
	public String getJmbg() {
		return jmbg;
	}
	public void setJmbg(String jmbg) {
		this.jmbg = jmbg;
	}
	public String getBrlk() {
		return brlk;
	}
	public void setBrlk(String brlk) {
		this.brlk = brlk;
	}
	
}
