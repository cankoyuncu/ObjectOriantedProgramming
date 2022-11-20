import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Account acc1 = new Account("Can", 300);
        Account acc2 = new Account("Jack", 400);

        System.out.printf("%s's balance: $%.2f%n",
                acc1.getName(), acc1.getBalance());
        System.out.printf("%s's balance: $%.2f%n%n",
                acc2.getName(), acc2.getBalance());

        Scanner scanner = new Scanner(System.in);

        System.out.printf("Enter deposit amount for %s: ",
                acc1.getName());

        double depositAmount = scanner.nextDouble();

        System.out.printf("Adding %.2f to %s's balance! %n%n", depositAmount, acc1.getName());
        acc1.deposit(depositAmount);

        System.out.printf("%s's balance: $%.2f%n",
                acc1.getName(), acc1.getBalance());
        System.out.printf("%s's balance: $%.2f%n",
                acc2.getName(), acc2.getBalance());

        System.out.printf("Enter deposit amount for %s: ", acc2.getName());
        depositAmount = scanner.nextDouble();

        System.out.printf("Adding %.2f to %s's balance! %n%n",
                depositAmount, acc2.getName());
        acc2.deposit(depositAmount);

        System.out.printf("%s's balance: $%.2f%n",
                acc1.getName(), acc1.getBalance());
        System.out.printf("%s's balance: $%.2f%n",
                acc2.getName(), acc2.getBalance());

    }
}