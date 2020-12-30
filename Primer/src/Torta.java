import java.util.List;

public class Torta {

	private List<Sastojak> listaSastojaka;
	private String cestitka;

	private static Torta jedinaTorta = null;

	private Torta() {
		cestitka = "Srecno vencanje!";
	}

	public static Torta getInstance() {
		if (jedinaTorta == null) {
			jedinaTorta = new Torta();
		}
		return jedinaTorta;

	}

}
