import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*Scanner tarayici = new Scanner(System.in);
        System.out.println("1.sayi:");
        int sayi1 = tarayici.nextInt();

        System.out.println("2.sayi:");
        int sayi2 = tarayici.nextInt();

        System.out.println(sayi1+sayi2);*/

        /*Worker Alperen = new Worker("Can", 123123, 10,100);
        Alperen.displayInfo();
        Alperen.displaySalary();*/

        Account ac1 = new Account("XXX", 1000);
        ac1.setOwnerName("Varyemezler");
        System.out.println(ac1.getOwnerName());

        ac1.add(500);
        ac1.withdraw(-1);
        ac1.withdraw(100785);
        ac1.withdraw(100);
        System.out.println("Bakiyeniz: "+ac1.getBalance());
    }
}