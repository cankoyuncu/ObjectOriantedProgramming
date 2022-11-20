import java.util.InputMismatchException;
import java.util.Scanner;

public class ReadInteger {
    Scanner input = new Scanner(System.in);
    private int number;

    public ReadInteger(){
        setNumber();
    }
    public void setNumber() {
        try {
            System.out.print("Enter an integer value: ");
            int num = input.nextInt();
            number = num;
        }
        catch (InputMismatchException e) {
            System.out.print("Your input not an integer number");
        }
        catch (Exception e) {
            System.out.print("Error! " + e.getMessage());
        }
    }
        public int getNumber() {
            return number;
        }

