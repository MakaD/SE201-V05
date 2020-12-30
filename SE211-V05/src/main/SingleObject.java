package main;

public class SingleObject {
	private static SingleObject instance;

	private SingleObject() {
		System.out.println("Singleton(): Initializing Instance");
	}

	public static SingleObject getInstance() {
		if (instance == null) {
			synchronized (SingleObject.class) {
				if (instance == null) {
					instance = new SingleObject();
				}
			}
		}

		return instance;
	}

	public int getKorisnikBrojKartice(int brojKartice) {
		return brojKartice;
	}

}