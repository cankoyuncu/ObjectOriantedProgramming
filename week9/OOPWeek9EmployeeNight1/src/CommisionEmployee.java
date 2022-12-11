public class CommisionEmployee extends Employee{
    double grossSale;
    float commisionRate;

    CommisionEmployee(String fn, String ln, int ssn, double gs, float cRate){
        super(fn,ln,ssn);
        this.grossSale = gs;
        this.commisionRate = cRate;
    }

    @Override
    double earning() {
        return grossSale * commisionRate;
    }

    double getExtra(){
        return  10000;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" - %,.4f -  %.2f", grossSale, commisionRate);
    }
}
