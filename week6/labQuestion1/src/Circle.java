public class Circle {
    private static double Pi=3.14;
    private double radius;

    public static int counter;

    public Circle(double radius){
        this.radius = radius;
        counter++;
    }
    public double computeArea(){
        return Pi * radius * radius;
    }
}
