import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author hartlden
 */
@ManagedBean
@ApplicationScoped
public class Konfigurator {
    private static Konfigurator instance = new Konfigurator();
    private Hotdog hotdog;

    public Konfigurator() {
        hotdog = new Hotdog();
    }
    
    public Hotdog getHotdog() {
        return hotdog;
    }
    
    public static Konfigurator getInstance() {
        return instance;
    }
    
}
