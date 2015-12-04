public class Løntrin{
	private String navn;
	private int timeSats;

	public Løntrin(String navn, int sats){
		this.navn=navn;
		this.timeSats = sats;
	}

	public int getSats(){
		return timeSats;
	}

	public String getNavn(){
		return navn;
	}

	public void setNavn(String n){
		navn = n;
	}

	public void setSats(int i){
		timeSats = i;
	}
}