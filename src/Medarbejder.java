public class Medarbejder{
	String fornavn;
	String efternavn;
	String adresse;
	String telefonNr;
	String registreringsNr;
	String kontoNr;
	Løntrin lønsats;
	String stilling;

	public Medarbejder(){

	}

	public String getFornavn() {
		return fornavn;
	}

	public void setFornavn(String fornavn) {
		this.fornavn = fornavn;
	}

	public String getEfternavn() {
		return efternavn;
	}

	public void setEfternavn(String efternavn) {
		this.efternavn = efternavn;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getTelefonNr() {
		return telefonNr;
	}

	public void setTelefonNr(String telefonNr) {
		this.telefonNr = telefonNr;
	}

	public String getRegistreringsNr() {
		return registreringsNr;
	}

	public void setRegistreringsNr(String registreringsNr) {
		this.registreringsNr = registreringsNr;
	}

	public String getKontoNr() {
		return kontoNr;
	}

	public void setKontoNr(String kontoNr) {
		this.kontoNr = kontoNr;
	}

	public Løntrin getLønsats() {
		return lønsats;
	}

	public void setLønsats(Løntrin lønsats) {
		this.lønsats = lønsats;
	}

	public String getStilling() {
		return stilling;
	}

	public void setStilling(String stilling) {
		this.stilling = stilling;
	}
}