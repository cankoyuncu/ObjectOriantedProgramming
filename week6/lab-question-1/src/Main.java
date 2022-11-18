public class Main {
    public static void main(String[] args) {

        Circle c1 = new Circle (3);
        Circle c2 = new Circle (5);
        Circle c3 = new Circle (8);

        int[] myNumbers = {1,2,3,4,5};
        Circle[] circles = {c1,c2,c3};

        for(Circle area : circles){
            System.out.println(area.computeArea());
        }
    }
}