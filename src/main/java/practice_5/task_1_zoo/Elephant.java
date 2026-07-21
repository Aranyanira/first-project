package practice_5.task_1_zoo;

public class Elephant extends Animal {
    public Elephant(String name) {
        super(name);
    }

    @Override
    void move() {
        System.out.println("Слон ходит");
    }

    @Override
    void makeSound() {
        System.out.println("Слон трубит");
    }
}
