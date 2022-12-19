public abstract class Character {
    int id;
    String name;
    private int health;
    int score;

    Character(int id, String name){
        this.id = id;
        this.name = name;
        this.health = 100;
        this.score = 0;
    }

    abstract void takeDamage(int amount);

    void defence(){
        this.health +=5;
    }
}
