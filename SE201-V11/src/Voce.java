
public class Voce extends Sastojak{
	
	private String sezona;

	public Voce() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Voce(String naziv, int kalorije) {
		super(naziv, kalorije);
		// TODO Auto-generated constructor stub
	}

	public String getSezona() {
		return sezona;
	}

	public void setSezona(String sezona) {
		this.sezona = sezona;
	}

	@Override
	public String toString() {
		return "Voce [sezona=" + sezona + "]";
	}
	
}
