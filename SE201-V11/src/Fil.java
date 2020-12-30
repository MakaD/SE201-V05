import java.util.ArrayList;
import java.util.List;

public class Fil extends Sastojak{
	
	private String tipFila;
	
	private List<Sastojak> listaSastojaka = new ArrayList<Sastojak>();

	public Fil() {
		super();
	}

	public Fil(String naziv, int kalorije) {
		super(naziv, kalorije);
		// TODO Auto-generated constructor stub
	}
	
	public String getTipFila() {
		return tipFila;
	}

	public void setTipFila(String tipFila) {
		this.tipFila = tipFila;
	}

	public List<Sastojak> getListaSastojaka() {
		return listaSastojaka;
	}

	public void setListaSastojaka(List<Sastojak> listaSastojaka) {
		this.listaSastojaka = listaSastojaka;
	}

	public void dodajSastojak(Sastojak sastojak) {
		listaSastojaka.add(sastojak);
	}
	
	public void stampajSastavFila() {
		for (Sastojak s : listaSastojaka) {
			System.out.println(s.getNaziv());
		}
	}

	@Override
	public String toString() {
		return "Fil [tipFila=" + tipFila + ", listaSastojaka=" + listaSastojaka + "]";
	}

}