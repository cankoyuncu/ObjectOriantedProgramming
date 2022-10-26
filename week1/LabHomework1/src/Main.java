import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Worker w1 = new Worker();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter hours: ");
        w1.workingHours = scanner.nextInt();

        System.out.println("Please enter SSN: ");
        w1.socialSecurityNumber = scanner.nextInt();;

        System.out.println("Please enter name: ");
        w1.name = scanner.next();

        System.out.println("Please enter wage:");
        w1.wage = scanner.nextFloat();

        w1.displayInfo();
        w1.displaySalary();
    }
}