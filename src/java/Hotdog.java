import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.bean.ApplicationScoped;

/**
 *
 * @author hartlden
 */

@ManagedBean
@ApplicationScoped
public class Hotdog {
    private ArrayList<Zutat> zutaten = new ArrayList<Zutat>();
    private double preis = 0.00;
    private static Hotdog instance = new Hotdog();
    
    public Hotdog() {
        zutaten.add(new Zutat("Basic HotDog", 6.00, true));
        zutaten.add(new Zutat("Röstzwiebeln", 1.00, false));
        zutaten.add(new Zutat("Ketchup", 0.50, false));
        zutaten.add(new Zutat("Mayo", 0.50, false));
        zutaten.add(new Zutat("Senf", 0.50, false));
        zutaten.add(new Zutat("Gürkchen", 1.00, false));
        zutaten.add(new Zutat("Bacon", 1.00, false));
        zutaten.add(new Zutat("Marshmallows", 2.00, false));
    }
    
    public ArrayList<Zutat> getZutaten() {
        return zutaten;
    }
    
    public void setZutaten(ArrayList<Zutat> zutaten) {
        this.zutaten = zutaten;
    }
    
    public double getPreis() {
        System.out.println(preis);
        return preis;
    }
    
    public void setPreis(double preis) {
        this.preis = preis;
    }
    
    public static Hotdog getInstance() {
        return instance;
    }
}
