public class Duck extends Animal implements Moveable, Flyable, Swimmable{
    @Override
    public void move() {
        System.out.println("Duck move");
    }

    @Override
    public void fly() {
        System.out.println("Duck fly");
    }

    @Override
    public void swim() {
        System.out.println("Duck swim");
    }
}
