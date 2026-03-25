package pizzabar;


import java.util.ArrayList;
import java.util.Scanner;



public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int kundeValg = 0;
        System.out.println("\nVælg kundetype:");
        System.out.println("\n1  Normal kunde");
        System.out.println("2  VIP kunde");
        System.out.println("3  Medarbejder kunde");


        while (true) {
            try {
                kundeValg = scan.nextInt();

                if (kundeValg >= 1 && kundeValg <= 3) {
                    break;
                } else {
                    System.out.println("Skriv et tal mellem 1-3!");
                }
                scan.nextLine();
            } catch (Exception e) {
                System.out.println("Skriv et tal mellem 1-3!");
                scan.nextLine();
            }
        }

        Customer c;

        if (kundeValg == 1) {
            c = new NormalCustomer();
        } else if (kundeValg == 2) {
            c = new VIPCustomer();
        } else {
            c = new EmployeeCustomer();
        }

        Bestilling b = new Bestilling(c);
        Menu menu = new Menu();

        menu.addPizza(new Pizza(1, "Margherita", 80));
        menu.addPizza(new Pizza(2, "Pepperoni", 90));
        menu.addPizza(new Pizza(3, "Hawaii", 75));

        for (Pizza p : menu.getPizzaer()) {
        System.out.println(p);
        }
        System.out.println("Bestilling totalpris: " + b.getTotalPris() + " kr");
        scan.nextLine();

        ArrayList<Pizza> liste = menu.getPizzaer();

        int pizzaValg = 0;

        boolean fortsaetBestilling = true;

        while (fortsaetBestilling) {
            try {

                pizzaValg = scan.nextInt();
                if (pizzaValg == 0) {
                    fortsaetBestilling = false;

                    break;
                } else if (pizzaValg >= 1 && pizzaValg <= 5) {
                    fortsaetBestilling = true;
                } else if (pizzaValg > 5) {
                    System.out.println("Skriv et tal mellem 0-5!"); 
                }
                scan.nextLine();

            } catch (Exception e) {
                System.out.println("Skriv et tal mellem 0-5!");
                scan.nextLine();
            }

             if (pizzaValg == 1) {
              System.out.println("PIZZA1");

             }  else if (pizzaValg == 2) {
              System.out.println("PIZZA2");

             }  else if (pizzaValg == 3) {
              System.out.println("PIZZA3");

             }  else if (pizzaValg == 4) {
              System.out.println("PIZZA4");

             }  else if (pizzaValg == 5) {
              System.out.println("PIZZA5");

             }




        }

               if (pizzaValg == 1) {
                System.out.println("PIZZA1");
               }

   /* Customer c;
    if (valg == 1){
        c = new NormalCustomer();
    }  else if (valg == 2){
        c = new VIPCustomer();
    }  else if (valg == 3) {
        c = new EmployeeCustomer();
    }
*/
        // Første bestilling
        //Customer c = new VIPCustomer();
        // Bestilling b = new Bestilling(c);

        // b.addPizza(new Pizza(1, "Margherita", 80));
        // b.addPizza(new Pizza(2, "Pepperoni", 90));

            /* Anden bestilling
        Customer c2 = new NormalCustomer();
        Bestilling b2 = new Bestilling(c2);

        b2.addPizza(new Pizza(3, "Hawaii", 85));

            // Samling af alle bestillinger
        AlleBestillinger all = new AlleBestillinger();

        all.addBestilling(b);
        all.addBestilling(b2);

            // Print alle totalpriser
        for (Bestilling best : all.getListe()) {
            System.out.println(best.getTotalPris());*/
    }
}





