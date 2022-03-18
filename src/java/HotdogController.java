import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hartlden
 */
@ManagedBean
@ViewScoped
public class HotdogController {
    
    public static void updatePreis() {
        double preis = 0.00;
        ArrayList<Zutat> zutaten = Hotdog.getInstance().getZutaten();
        
        for (Zutat zutat:zutaten) {
            if (zutat.getAusgewaehlt()) {
                System.out.println(zutat.getName());
                preis = preis + zutat.getPreis();
            }
        }
        System.out.println(preis);
        Hotdog.getInstance().setPreis(preis);
    }
}
