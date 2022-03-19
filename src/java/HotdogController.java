import java.lang.Math;
import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author hartlden
 */
@ManagedBean
@ViewScoped
public class HotdogController {
    
    public Hotdog getHotdog() {
        return Konfigurator.getInstance().getHotdog();
    }
    
    public static void updatePreis() {
        double preis = 0.00;
        ArrayList<Zutat> zutaten = Konfigurator.getInstance().getHotdog().getZutaten();
        int anzahl_zutaten = 0;
        double rabatt_prozent = 0.0;
        
        for (Zutat zutat:zutaten) {
            if (zutat.getAusgewaehlt()) {
                anzahl_zutaten = anzahl_zutaten + 1;
                 if (anzahl_zutaten == 2) {
                    rabatt_prozent = 10.0;
                }
                else if (anzahl_zutaten == 3) {
                    rabatt_prozent = 20.0;
                }
                else if (anzahl_zutaten == 4) {
                    rabatt_prozent = 30.0;
                }
                else if (anzahl_zutaten == 5) {
                    rabatt_prozent = 40.0;
                }
                else if (anzahl_zutaten > 5) {
                    rabatt_prozent = 50.0;
                }

                preis = preis + (zutat.getPreis()*(1-(rabatt_prozent/100)));
            }
        }
        Konfigurator.getInstance().getHotdog().setPreis((double) Math.round(preis * 100) / 100);
    }
}
