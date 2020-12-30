package main;

public class Rezervacija {

	private int brojKarata;
	private String datumRezervacije;
	private String datumIsteka;
	private String potvrdaRezervacije;

	public Rezervacija(int brojKarata, String datumRezervacije, String datumIsteka, String potvrdaRezervacije) {
		this.brojKarata = brojKarata;
		this.datumRezervacije = datumRezervacije;
		this.datumIsteka = datumIsteka;
		this.potvrdaRezervacije = potvrdaRezervacije;
	}

	public int getBrojKarata() {
		return brojKarata;
	}

	public String getDatumRezervacije() {
		return datumRezervacije;
	}

	public String getDatumIsteka() {
		return datumIsteka;
	}

	public String getPotvrdaRezervacije() {
		return potvrdaRezervacije;
	}

	public void setBrojKarata(int brojKarata) {
		this.brojKarata = brojKarata;
	}

	public void setDatumRezervacije(String datumRezervacije) {
		this.datumRezervacije = datumRezervacije;
	}

	public void setDatumIsteka(String datumIsteka) {
		this.datumIsteka = datumIsteka;
	}

	public void setPotvrdaRezervacije(String potvrdaRezervacije) {
		this.potvrdaRezervacije = potvrdaRezervacije;
	}

	@Override
	public String toString() {
		return "Rezervacija{" + "brojKarata=" + brojKarata + ", datumRezervacije=" + datumRezervacije + ", datumIsteka="
				+ datumIsteka + ", potvrdaRezervacije=" + potvrdaRezervacije + '}';
	}

}