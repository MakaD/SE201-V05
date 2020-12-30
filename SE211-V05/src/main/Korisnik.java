package main;

public class Korisnik {
	private String ime;
	private String prezime;
	private String grad;
	private String drzava;
	private String adresa;
	private int brojKartice;
	private int kontaktTelefon;

	public Korisnik(String ime, String prezime, String grad, String drzava, String adresa, int brojKartice,
			int kontaktTelefon) {
		this.ime = ime;
		this.prezime = prezime;
		this.grad = grad;
		this.drzava = drzava;
		this.adresa = adresa;
		this.brojKartice = brojKartice;
		this.kontaktTelefon = kontaktTelefon;
	}

	public String getIme() {
		return ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public String getGrad() {
		return grad;
	}

	public String getDrzava() {
		return drzava;
	}

	public String getAdresa() {
		return adresa;
	}

	public int getBrojKartice() {
		return brojKartice;
	}

	public int getKontaktTelefon() {
		return kontaktTelefon;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public void setGrad(String grad) {
		this.grad = grad;
	}

	public void setDrzava(String drzava) {
		this.drzava = drzava;
	}

	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}

	public void setBrojKartice(int brojKartice) {
		this.brojKartice = brojKartice;
	}

	public void setKontaktTelefon(int kontaktTelefon) {
		this.kontaktTelefon = kontaktTelefon;
	}

	@Override
	public String toString() {
		return "Korisnik{" + "ime=" + ime + ", prezime=" + prezime + ", grad=" + grad + ", drzava=" + drzava
				+ ", adresa=" + adresa + ", brojKartice=" + brojKartice + ", kontaktTelefon=" + kontaktTelefon + '}';
	}

}
