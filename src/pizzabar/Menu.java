package pizzabar;

import java.util.*;

public class Menu {
    private ArrayList<Pizza> pizzaer;

    public Menu(){
        pizzaer = new ArrayList<>();
    }

    public void addPizza(Pizza pizza){
        pizzaer.add(pizza);
    }

    public ArrayList<Pizza> getPizzaer(){
        return pizzaer;
    }

    public Pizza getPizzaByName(String navn){
        for (Pizza p : pizzaer){
            if (p.getNavn().equalsIgnoreCase(navn)){
                return p;
            }
        }
        return null;

    }





}
