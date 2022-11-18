public class Worker {
    String name;
    int socialSecurityNumber;
    float wage;
    int workingHours;

    void displayInfo(){
        System.out.println("Name: "+name + "SSN: "+socialSecurityNumber);
    }
    void displaySalary(){
        float salary = wage * workingHours;
        System.out.println("Salary:"+salary +"$");
        //+ ile salary kullanimindan sonra
        // ekrana dolar bastirmak icin yine + kullanmam gerekiyormus.
    }
}
