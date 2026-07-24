package practice_5.task_1_zoo;

public abstract class Animal {
    private final String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    abstract void move();

    abstract void makeSound();
}
