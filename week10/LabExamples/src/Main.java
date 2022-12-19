public class Main {
    public static void main(String[] args) {

        System.out.println("Bismillahirrahmanirrahim");

        Animal a1 = new Cat();
        Animal a2 = new Eagle();
        Animal a3 = new Duck();
        Animal[] animals = {a1, a2, a3};

        for(Animal animal : animals){
            if(animal instanceof Flyable){
                ((Flyable)animal).fly();
            }
        }
    }
}