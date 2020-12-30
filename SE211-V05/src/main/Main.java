package main;

public class Main {
	public static void main(String[] args) {
		SingleObject object = SingleObject.getInstance();
		int brojKartice = object.getKorisnikBrojKartice(12341234);

		Korisnik korisnik = new Korisnik("Nebojsa", "Gavrilovic", "Kosjeric", "Srbija", "Balkanska", brojKartice,
				064123456);
		System.out.println(korisnik);

		Rezervacija rezervacija = new Rezervacija(4, "22.11.2017", "20.11.2017", "true");
		System.out.println(rezervacija);
	}
}
