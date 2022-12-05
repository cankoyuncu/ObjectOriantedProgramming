public class Dog extends  Animal {
    String breed;

    Dog(String color){
       super(color);
    }
    void bark(){

    }

    @Override
    void eat(){
        System.out.println("dog eats!");
    }
}
