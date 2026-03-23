package pizzabar;


import java.util.Scanner;

public class Main{

    public static void main(String[] args){

    Scanner scan = new Scanner(System.in);

int valg = 0;
        System.out.println("\nVælg kundetype:");
        System.out.println("\n1  Normal kunde");
        System.out.println("2  VIP kunde");
        System.out.println("3  Medarbejder kunde");
        while (true) {
            try {
                valg = scan.nextInt();

                if (valg >= 1 && valg <= 3) {
                    break;
                } else {
                    System.out.println("Skriv et tal mellem 1-3!");
                }

            } catch (Exception e) {
                System.out.println("Skriv et tal mellem 1-3!");
                scan.nextLine();
            }
        }

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





