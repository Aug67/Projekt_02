package pizzabar;

public class Main{

    public static void main(String[] args){

        Customer c = new VIPCustomer();
        Bestilling b = new Bestilling(c);


        b.addPizza(new Pizza(1, "Marghuerita", 80));
        b.addPizza(new Pizza(2, "Pepperoni", 90));

        System.out.println(b.getTotalPris());

    }

}

