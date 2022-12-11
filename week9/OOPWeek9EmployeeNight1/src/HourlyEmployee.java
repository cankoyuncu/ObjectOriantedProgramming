public class HourlyEmployee extends Employee{

    double wage;
    int hours;
    HourlyEmployee(String fn, String ln, int ssn, double wage, int hours){
        super(fn,ln,ssn);
        this.wage =wage;
        this.hours = hours;
    }

    @Override
    double earning() {
       if(hours<=40)
           return  hours * wage;
       else
           return  (hours-40)*wage*1.5;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" - %,.4f  %d", wage, hours);
    }
}
