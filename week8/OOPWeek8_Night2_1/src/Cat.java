public class Cat extends  Animal{
    int age;

    Cat(String color, int age){
        super(color);
        this.age = age;
    }
    void meuw(){
    }

    @Override
    void eat(){
        System.out.println("cat eats!");
    }
}
