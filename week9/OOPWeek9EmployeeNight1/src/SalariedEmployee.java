public class SalariedEmployee extends  Employee{

    double weeklySalary;
    SalariedEmployee(String fn, String ln, int ssn, double wSalary){
        super(fn,ln,ssn);
        this.weeklySalary = wSalary;
    }

    @Override
    double earning() {
        return weeklySalary;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" - %,.4f", weeklySalary);
    }
}
