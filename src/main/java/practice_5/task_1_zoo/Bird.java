package practice_5.task_1_zoo;

public class Bird extends Animal {
    public Bird(String name) {
        super(name);
    }

    @Override
    void move() {
        System.out.println("Птица летает");
    }

    @Override
    void makeSound() {
        System.out.println("Птица чирикает");
    }
}
