package pizzabar;


import java.util.ArrayList;
import java.util.Scanner;



public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int kundeValg = 0;

        String kommentarslut;

        System.out.println("\nVælg kundetype:");
        System.out.println("\n1  Normal kunde");
        System.out.println("2  VIP kunde");
        System.out.println("3  Medarbejder kunde\n");


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

        menu.addPizza(new Pizza(1, "Margherita", 70));
        menu.addPizza(new Pizza(2, "Pepperoni", 90));
        menu.addPizza(new Pizza(3, "Hawaii", 80));
        menu.addPizza(new Pizza(4, "Kylling BBQ", 100));
        menu.addPizza(new Pizza(5, "Chesse lovers", 75));
        String seOrdre = "tast 100 for at se ordre\n";


        for (Pizza p : menu.getPizzaer()) {
            System.out.println(p);

        }
        System.out.println(seOrdre);


        scan.nextLine();

        ArrayList<Pizza> liste = menu.getPizzaer();

        int pizzaValg = 0;

        boolean fortsaetBestilling = true;

        while (fortsaetBestilling) {
            try {

                pizzaValg = scan.nextInt();


                for (Pizza p : liste) {
                    if (pizzaValg >= 1 && pizzaValg <= 5) {
                        fortsaetBestilling = true;

                    } else if (pizzaValg >= 6 && pizzaValg <= 99) {
                        System.out.println("Skriv et tal mellem 0-5!\nEller skriv 100 for hele ordren\n");
                        break;
                    }


                }

            } catch (Exception e) {
                System.out.println("Skriv et tal mellem 0-5!\nEller skriv 100 for hele ordren\n");
                scan.nextLine();
            }


            // hvis du skriver 100 får du total beløb

            if (pizzaValg == 1) {
                fortsaetBestilling = true;
                System.out.println("Skriv 0 for at afslutte\nDu har nu tilføjet:");
                for (Pizza p : liste) {
                    if (p.getNummer() == pizzaValg) {
                        b.addPizza(p);
                        System.out.println(p);
                        System.out.println(b.getTotalPris() + "kr\n");
                    }
                }

            } else if (pizzaValg == 2) {
                fortsaetBestilling = true;
                System.out.println("Skriv 0 for at afslutte\nDu har nu tilføjet:");
                for (Pizza p : liste) {
                    if (p.getNummer() == pizzaValg) {
                        b.addPizza(p);
                        System.out.println(p);
                        System.out.println(b.getTotalPris() + "kr\n");
                    }
                }
            } else if (pizzaValg == 3) {

                System.out.println("Skriv 0 for at afslutte\nDu har nu tilføjet:");
                for (Pizza p : liste) {
                    if (p.getNummer() == pizzaValg) {
                        b.addPizza(p);
                        System.out.println(p);
                        System.out.println(b.getTotalPris() + "kr\n");
                    }
                }
            } else if (pizzaValg == 4) {

                System.out.println("Skriv 0 for at afslutte\nDu har nu tilføjet:");
                for (Pizza p : liste) {
                    if (p.getNummer() == pizzaValg) {
                        b.addPizza(p);
                        System.out.println(p);
                        System.out.println(b.getTotalPris() + "kr\n");
                    }
                }
            } else if (pizzaValg == 5) {
                fortsaetBestilling = true;
                System.out.println("Skriv 0 for at afslutte\nDu har nu tilføjet:");
                for (Pizza p : liste) {
                    if (p.getNummer() == pizzaValg) {
                        b.addPizza(p);
                        System.out.println(p);
                        System.out.println(b.getTotalPris() + "kr\n");
                    }
                }
            } else if (pizzaValg == 100) {

                fortsaetBestilling = true;
                System.out.println(b + "\n");

            } else if (pizzaValg == 0) {

                fortsaetBestilling = false;
                scan.nextLine();

                while (true) {
                    System.out.println("Skriv kommentar (skriv 'done' for at stoppe):");
                    String kommentar = scan.nextLine();

                        if (kommentar.equalsIgnoreCase("done")) {
                            System.out.println("\n=== DIN BESTILLING ===");
                            System.out.println(b);
                            break;
                        }


                        b.addKommentar(kommentar);
                    }
                    }

                }
            }






        }



