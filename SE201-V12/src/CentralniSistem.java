
public class CentralniSistem {
	
	static boolean simulateFail = false;
	
    static public boolean izvrsiTransakciju(){
        return !simulateFail;
    }
}
