import java.util.ArrayList;
import java.util.List;

public class Torta {
	
	private String cestitka;
	private List<Sastojak> listaSastojaka;
	
	public Torta() {
		super();
	}

	public Torta(String cestitka, List<Sastojak> listaSastojaka) {
		super();
		this.cestitka = cestitka;
		this.listaSastojaka = listaSastojaka;
	}
	
	public String getCestitka() {
		return cestitka;
	}
	
	public void setCestitka(String cestitka) {
		this.cestitka = cestitka;
	}
	
	public List<Sastojak> getListaSastojaka() {
		return listaSastojaka;
	}
	
	public void setListaSastojaka(List<Sastojak> listaSastojaka) {
		this.listaSastojaka = listaSastojaka;
	}
	
	@Override
	public String toString() {
		return "Torta [cestitka=" + cestitka + ", listaSastojaka=" + listaSastojaka + "]";
	}
	
}
