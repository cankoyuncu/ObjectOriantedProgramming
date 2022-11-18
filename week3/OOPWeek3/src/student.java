public class student {

    public String name;

    public int id;
    public int midterm;
    public int finalExam;

    public student(){
        System.out.println("Calculating the average of midterm and final grades...");
    }

    public student(String name, int midterm, int finalExam)
    {
        this.name = name;
        this.midterm = midterm;
        this.finalExam = finalExam;
    }
    public float getResult()
    {
        return midterm * 0.4f + finalExam * 0.6f;
    }
}
