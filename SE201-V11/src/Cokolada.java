
public class Cokolada extends Sastojak{
	
	private String tipCokolade;

	public Cokolada() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cokolada(String naziv, int kalorije) {
		super(naziv, kalorije);
		// TODO Auto-generated constructor stub
	}

	public String getTipCokolade() {
		return tipCokolade;
	}

	public void setTipCokolade(String tipCokolade) {
		this.tipCokolade = tipCokolade;
	}

	@Override
	public String toString() {
		return "Cokolada [tipCokolade=" + tipCokolade + "]";
	}
	
}
