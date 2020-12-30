
public class Racun {
	
	private String broj;
    private double stanje;
 
    public Racun(String broj, double stanje) {
        this.broj = broj;
        this.stanje = stanje;
    }
 
    public String getBroj() {
        return broj;
    }
 
    public void setBroj(String broj) {
        this.broj = broj;
    }
 
    public double getStanje() {
        return stanje;
    }
 
    public void setStanje(double stanje) {
        this.stanje = stanje;
    }
    
    public boolean transfer(String broj, double iznos){
        if(stanje < iznos){
            return false;
        }        
        if(CentralniSistem.izvrsiTransakciju()){
            stanje -= iznos;
            return true;
        }
        return false;
    }
    
}
