package pizzabar;

import java.util.*;

public class AlleBestillinger {
    private ArrayList<Bestilling> liste;

    public AlleBestillinger(){
        liste = new ArrayList<>();

    }

    public void addBestilling(Bestilling b){
        liste.add(b);
    }

    public ArrayList<Bestilling> getListe(){
        return liste;
    }

}
