package pizzabar;

public class VIPCustomer extends Customer {

    public VIPCustomer(){

    }

    @Override
    public double getRabat(){
        return 0.10;
    }

}
