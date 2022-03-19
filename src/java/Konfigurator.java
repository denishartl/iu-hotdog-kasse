import java.util.ArrayList;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author hartlden
 */
@ManagedBean
@SessionScoped
public class Konfigurator {
    private static Konfigurator instance = new Konfigurator();
    private Hotdog hotdog;

    public Konfigurator() {
        ArrayList <Zutat> zutaten = new ArrayList<Zutat>();
        zutaten.add(new Zutat("Basic HotDog", 6.00, true, true));
        zutaten.add(new Zutat("Röstzwiebeln", 1.00, false, false));
        zutaten.add(new Zutat("Ketchup", 0.50, false, false));
        zutaten.add(new Zutat("Mayo", 0.50, false, false));
        zutaten.add(new Zutat("Senf", 0.50, false, false));
        zutaten.add(new Zutat("Gürkchen", 1.00, false, false));
        zutaten.add(new Zutat("Bacon", 1.00, false, false));
        zutaten.add(new Zutat("Marshmallows", 2.00, false, false));
        hotdog = new Hotdog(zutaten);
        //HotdogController.updatePreis();
    }
    
    public Hotdog getHotdog() {
        return hotdog;
    }
    
    public static Konfigurator getInstance() {
        return instance;
    }
    
}
