/**
 *
 * @author hartlden
 */
public class Zutat {
    private String name;
    private double preis;
    private boolean ausgewaehlt;
    private boolean readonly;
    
    public Zutat() {
    }
    
    public Zutat(String name, double preis, boolean ausgewaehlt, boolean readonly) {
        this.name = name;
        this.preis = preis;
        this.ausgewaehlt = ausgewaehlt;
        this.readonly = readonly;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public double getPreis() {
        return preis;
    } 
    
    public void setPreis(double preis) {
        this.preis = preis;
    }
    
    public boolean getAusgewaehlt() {
        return ausgewaehlt;
    }
    
    public void setAusgewaehlt(boolean ausgewaehlt) {
        this.ausgewaehlt = ausgewaehlt;
    }
    
    public boolean getReadonly() {
        return readonly;
    }
    
    public void setReadonly(boolean readonly) {
        this.readonly = readonly;
    }
}
