package pizzabar;


import java.util.ArrayList;
import java.util.Scanner;



public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int kundeValg = 0;
        String totalordre;


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
        AlleBestillinger alle = new AlleBestillinger();
        Bestilling b = new Bestilling(c);
        Menu menu = new Menu();

        menu.addPizza(new Pizza(1, "Margherita", 80));
        menu.addPizza(new Pizza(2, "Pepperoni", 90));
        menu.addPizza(new Pizza(3, "Hawaii", 75));
        menu.addPizza(new Pizza(4, "pizza4", 90));
        menu.addPizza(new Pizza(5, "pizza5", 75));
        String seOrdre = "tast 100 for at se ordre";


        for (Pizza p : menu.getPizzaer()) {
        System.out.println(p);

        }
        System.out.println(seOrdre);
        System.out.println("\nBestilling totalpris: " + b.getTotalPris() + " kr");

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
                } else if (pizzaValg >= 5 && pizzaValg <= 99) {
                    System.out.println("Skriv et tal mellem 0-5! Eller skriv 100");
                }
                scan.nextLine();

            } catch (Exception e) {
                System.out.println("Skriv et tal mellem 0-5! Eller skriv 100");
                scan.nextLine();
            }

    //jeg prøvede at gøre så man kan skrive check og man så kan se hele ordren men hvis du skrivr andet end 1-5 kan du se bestillingen
           /*
            boolean check = true;
            while (check) {
               try {
                  totalordre = scan.nextLine();
                   if (totalordre.equals("check")) {

                       System.out.println(b);
                   break;
                   }

               } catch (Exception e) {
                   break;

               }
            }

           */

        // hvis du skriver 100 får du total beløb

             if (pizzaValg == 1) {
              System.out.println("\nDu har nu tilføjet:");
                 for (Pizza p : liste) {
                     if (p.getNummer() == pizzaValg) {
                         b.addPizza(p);
                         System.out.println(p);
                     }
                 }

             }  else if (pizzaValg == 2) {
              System.out.println("\nDu har nu tilføjet:");
                 for (Pizza p : liste) {
                     if (p.getNummer() == pizzaValg) {
                         b.addPizza(p);
                         System.out.println(p);
                     }
                 }
             }  else if (pizzaValg == 3) {
              System.out.println("\nDu har nu tilføjet:");
                 for (Pizza p : liste) {
                     if (p.getNummer() == pizzaValg) {
                         b.addPizza(p);
                         System.out.println(p);
                     }
                 }
             }  else if (pizzaValg == 4) {
              System.out.println("\nDu har nu tilføjet:");
                 for (Pizza p : liste) {
                     if (p.getNummer() == pizzaValg) {
                         b.addPizza(p);
                         System.out.println(p);
                     }
                 }
             }  else if (pizzaValg == 5) {
              System.out.println("\nDu har nu tilføjet:");
                 for (Pizza p : liste) {
                     if (p.getNummer() == pizzaValg) {
                         b.addPizza(p);
                         System.out.println(p);
                     }
                 }
             }  else if (pizzaValg == 100) {


                         System.out.println(b);
                     }
                 }
             }




        }











