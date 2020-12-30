
public abstract class Sastojak {
	
	private String naziv;
	private int kalorije;
	
	public Sastojak() {
		super();
	}

	public Sastojak(String naziv, int kalorije) {
		super();
		this.naziv = naziv;
		this.kalorije = kalorije;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	

	public int getKalorije() {
		return kalorije;
	}

	public void setKalorije(int kalorije) {
		this.kalorije = kalorije;
	}

	@Override
	public String toString() {
		return "Sastojak [naziv=" + naziv + "]";
	}
	
}
