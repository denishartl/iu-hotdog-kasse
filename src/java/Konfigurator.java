import java.util.ArrayList;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author hartlden
 */
@ManagedBean
@ApplicationScoped
public class Konfigurator {
    private ArrayList<Topping> toppings = new ArrayList<Topping>();
    private static Konfigurator instance = new Konfigurator();
    
    public Konfigurator() {
        toppings.add(new Topping("Röstzwiebeln", 1.00));
        toppings.add(new Topping("Ketchup", 0.50));
        toppings.add(new Topping("Mayo", 0.50));
        toppings.add(new Topping("Senf", 0.50));
        toppings.add(new Topping("Gürkchen", 1.00));
        toppings.add(new Topping("Bacon", 1.00));
        toppings.add(new Topping("Röstzwiebeln", 2.00));
    }
    
    public ArrayList<Topping> getToppings() {
        return toppings;
    }
    
    public static Konfigurator getInstance() {
        return instance;
    }
    
}
