public class BasePlusCommisionEmployee extends CommisionEmployee{
double baseSalary;
    BasePlusCommisionEmployee(String fn, String ln, int ssn, double gs,
                              float cRate, double baseSalary){
        super(fn,ln,ssn,gs,cRate);
        this.baseSalary = baseSalary;
    }

    @Override
    double earning() {
        return super.earning() + baseSalary;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("- %,.4f", baseSalary);
    }
}
