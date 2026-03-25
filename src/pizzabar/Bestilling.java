package pizzabar;

import java.util.*;

public class Bestilling {
    private Customer customer;
    private ArrayList<Pizza> pizzaer;

    @Override
    public String toString() {
        String tekst = "Bestilling:\n";

        for (Pizza p : pizzaer) {
            tekst += p + "\n";
        }

        tekst += "Totalpris: " + getTotalPris() + " kr";

        return tekst;
    }
    public Bestilling(Customer customer){
        this.customer = customer;
        pizzaer = new ArrayList<>();

    }

    public boolean removePizza(Pizza pizza){
        return pizzaer.remove(pizza);
    }

    public void addPizza(Pizza pizza){
        pizzaer.add(pizza);
    }

    public double getTotalPris(){
        double total = 0;

        for (Pizza p : pizzaer){
            total = total + p.getPris();
        }

        double rabat = customer.getRabat();

        return total * (1 - rabat);
    }

}
