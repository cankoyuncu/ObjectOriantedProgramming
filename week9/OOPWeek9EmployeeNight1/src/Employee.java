public abstract class Employee {
    String fName;
    String lName;
    int ssn;

    Employee(String fn, String ln, int ssn){
        this.fName = fn;
        this.lName = ln;
        this.ssn = ssn;
    }

    abstract double earning();

    @Override
    public String toString() {
        return String.format("%s - %s - %d", fName, lName, ssn);
    }
}
