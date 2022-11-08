public class Main {

    public static void main(String[] args) {

        student s = new student();
        student s2 = new student("Cann", 45,55);
        s2.finalExam = 100;
        System.out.println(s.getResult());
        System.out.println(s2.getResult());

        //s.name = "can";
        //s.midterm = 100;
        //s.finalExam = 90;
        //System.out.println(s.getResult());

        //employee emp = new employee();
        //emp.name;
    }
}