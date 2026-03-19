package pizzabar;

public class Main{

    public static void main(String[] args){

        Pizza p1 = new Pizza(5, "Allaorgash", 99);
        System.out.println(p1);

        Pizza p2 = new Pizza(4, "Magherita", 79);
        System.out.println(p2);

        p1.getNummer();
        p1.getNavn();
        p1.getPris();

    }

}

