package week3oop;

public class VideoExample {

    public static void main(String[] args) {
        Account acc = new Account("jack", 100);
        acc.deposit(50);
        acc.balance =10000;
        System.out.println(acc.balance);

    }

}