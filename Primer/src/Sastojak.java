
public abstract class Sastojak {
	private String naziv;

	public Sastojak(String kod) {
		super();
		this.naziv = kod;
	}

	public String getKod() {
		return naziv;
	}

	public void setKod(String kod) {
		this.naziv = kod;
	}
	
}
