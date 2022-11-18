import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Worker worker1 = new Worker();
        Scanner tarayici = new Scanner(System.in);

        System.out.println("Please enter hours:");
        worker1.workingHours = tarayici.nextInt();

        System.out.println("Please enter SSN:");
        worker1.socialSecurityNumber = tarayici.nextInt();

        System.out.println("Please enter name:");
        worker1.name = tarayici.next();

        System.out.println("Please enter wage:");
        worker1.wage = tarayici.nextInt();

        worker1.displayInfo();
        worker1.displaySalary();

    }
}