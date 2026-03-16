package pizzabar;

public class Pizza {
    private int nummer;
    private String navn;
    private double pris;

    public Pizza(int nummer, String navn, double pris){
        this.nummer = nummer;
        this.navn = navn;
        this.pris = pris;
    }

    public double getPris(){
        return pris;
    }

    public String getNavn(){
        return navn;
    }

    public int getNummer(){
        return nummer;
    }


    @Override
    public String toString(){
        return nummer + ". " + navn + " - " + pris + " kr";
    }



}
