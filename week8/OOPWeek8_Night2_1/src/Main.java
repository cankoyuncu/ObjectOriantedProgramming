public class Main {
    public static void main(String[] args) {
      Animal animal = new Animal("red");
      Dog dog = new Dog("blue");
      Cat cat = new Cat("pink", 5);

      Animal[] animals = {animal,dog,cat};

      for(Animal a: animals)
        a.eat();

    //  BritishShortHair bsh = new BritishShortHair();
    }
}