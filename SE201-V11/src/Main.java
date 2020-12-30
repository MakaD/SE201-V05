import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		Torta rodjendanskaTorta = new Torta();
		
		ArrayList<Sastojak> sastojciTorte = new ArrayList<Sastojak>();
		Fil filZaRodjendanskuTortu = new Fil();
		filZaRodjendanskuTortu.setTipFila("cokoladni fil");
		
		Cokolada crnaCokolada = new Cokolada();
		crnaCokolada.setTipCokolade("crna");
		crnaCokolada.setKalorije(400);
		crnaCokolada.setNaziv("Galeb bez secera");
	
		sastojciTorte.add((Sastojak)crnaCokolada);
		
		rodjendanskaTorta.setListaSastojaka(sastojciTorte);
		rodjendanskaTorta.setCestitka("Srecan 21. rodjendan");

		System.out.println(rodjendanskaTorta);
	}

}
