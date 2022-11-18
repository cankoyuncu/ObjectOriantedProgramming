public class Account {

    private double balance;
    private String ownerName;

    Account(String name, double balance){
        this.ownerName = name; //this kullanmayabilirsin.
        this.balance = balance;
    }
    public void setOwnerName(String name){

        ownerName = name;
    }
    public String getOwnerName(){

        return ownerName;
    }
    public void add(double amount){
        if(amount>0){
            balance = balance + amount;
        }
        else{
            System.out.println("Lutfen gecerli giris yapiniz.");
        }
    }
    public void withdraw(double amount){
        if(amount<balance && amount>0){
            balance = balance - amount;
        }
        else{
            System.out.println("Gecersiz giris yaptiniz.");
        }
    }
    public double getBalance(){
        return balance;
    }
}
