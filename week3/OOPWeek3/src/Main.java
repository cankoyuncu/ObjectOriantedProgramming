public class Main {

    public static void main(String[] args) {

        student s = new student("Onur", 23, 53);
        student s2 = new student("CAN", 45,55);
        student s3 = new student();

        s2.midterm = 100;
        s2.finalExam = 100;

        s3.midterm = 10;
        s3.finalExam = 10;

        System.out.println(s.getResult());
        System.out.println(s2.getResult());
        System.out.println(s3.getResult());

        //s.name = "can";
        //s.midterm = 100;
        //s.finalExam = 90;
        //System.out.println(s.getResult());


    }
}