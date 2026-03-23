package pizzabar;

import java.util.Scanner;

public class Main{

    public static void main(String[] args){

    Scanner scan = new Scanner(System.in);

    scan.next();
            // Første bestilling
        Customer c = new VIPCustomer();
        Bestilling b = new Bestilling(c);

        b.addPizza(new Pizza(1, "Margherita", 80));
        b.addPizza(new Pizza(2, "Pepperoni", 90));

            // Anden bestilling
        Customer c2 = new NormalCustomer();
        Bestilling b2 = new Bestilling(c2);

        b2.addPizza(new Pizza(3, "Hawaii", 85));

            // Samling af alle bestillinger
        AlleBestillinger all = new AlleBestillinger();

        all.addBestilling(b);
        all.addBestilling(b2);

            // Print alle totalpriser
        for (Bestilling best : all.getListe()) {
            System.out.println(best.getTotalPris());
            }
        }

    }


