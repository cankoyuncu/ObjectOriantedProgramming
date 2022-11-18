public class Worker {
    String name;
    int ssn;
    int wage;
    int dayHours;

    Worker(String name, int ssn, int wage, int dayHours){
        this.name = name;
        this.ssn = ssn;
        this.wage = wage;
        this.dayHours = dayHours;
    }
    Worker(){

    }

    void displayInfo(){
        System.out.println("Name: "+name+"No: "+ssn);
    }

    void displaySalary(){
        int salary;
        salary = wage * dayHours;
        System.out.println("Toplam Maas: "+salary);
    }
}

