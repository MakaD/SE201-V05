import java.util.ArrayList;
import java.util.List;

public class Fil extends Sastojak{
	
	private List<Sastojak> listaSastojaka = new ArrayList<Sastojak>();

	public Fil(String naziv) {
		super(naziv);
		// TODO Auto-generated constructor stub
	}

	public void dodajSastojak(Sastojak s) {
		listaSastojaka.add(s);
	}
	
	public void skloniSastojak(Sastojak s) {
		listaSastojaka.remove(s);
	}
	
	public void prikaziSastojke() {
		for (Sastojak s : listaSastojaka) {
			System.out.println(s.getKod());
		}
	}

}
