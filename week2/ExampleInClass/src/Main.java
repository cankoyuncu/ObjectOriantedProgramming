import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter a number");
        int number1 = scanner.nextInt();

        System.out.println("please enter a number");
        int number2 = scanner.nextInt();


        System.out.println(number1+number2);

       // OOP();

        // POP();
        //forLoop();
       // forEachLoop();
       // System.out.println(whileLoop(50));

       // doWhileLoop();
        //doWhileLoop();

        //        ifCond(80);
        //        System.out.println(result);
        //        int result  = swithCase('+',30,40);
    }

    private static void OOP() {
        Student s1 = new Student();
        s1.name = "jack";
        s1.mid = 90;
        s1.fin = 80;
        System.out.println(s1.getScore());

        Student s2 = new Student();
        s2.name ="jane";
        s2.mid = 70;
        s2.fin = 90;
        System.out.println(s2.getScore());
    }

    private static void POP() {
        String[] names = new String[20];
        int[] midScores = new int[20];
        int[] finScores = new int[20];
        float[] averScores = new float[20];

        for (int i = 0; i < 20; i++) {
            averScores[i] = getScore(names[i],midScores[i], finScores[i]);
        }
    }

    static float getScore(String name, int mid, int fin){
        System.out.println(name);
        return mid *.4f +fin*.6f;
    }

    private static void doWhileLoop() {
        int number = 0;
        int pass = 123;
        do{
            System.out.println("not correct");
            number++;
        }while (number !=pass);
        System.out.println("congratulation");
    }

    private static int whileLoop(int bound) {
        int number = 0;
        int result =0;
        while (number <bound){
            if (number % 5== 0)
                result +=number;
            number++;
        }
        return  result;
    }

    private static void forEachLoop() {
        int[] numbers = {15,20,30,50};

        for(int number: numbers){
            System.out.println(number);
        }

        //{15, 20, 45,65}; //new int[]{10,30,25,56};
    }

    private static void forLoop() {
        for(int i = 0; i< 10; i++){
            System.out.println(i);
        }
    }

    static int swithCase(char operation, int a, int b) {
        int result =0;
        switch (operation)
        {
            case '+':
                result = a+b;
                break;
            case '-':
                result = a-b;
                break;
            case '*':
                result = a*b;
                break;
            case '/':
                result = a/b;
                break;
            default:
                System.out.println("wrong operation");
                break;
        }
        return  result;
    }

    static void ifCond(int score){
        if (score< 35)
            System.out.println("failed");
        else if(score < 50)
            System.out.println("conditionally passed");
        else
            System.out.println("passed");
    }


}