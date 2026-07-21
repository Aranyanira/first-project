package practice_5.task_5_farm;

/*
Условие:
На ферме содержится одно домашнее животное.
У каждого животного свои функции и нужды.
Примеры:
Корова даёт молоко, нуждается в выпасе
Курица несёт яйца, требует зерно
Нужно создать систему, которая позволяет управлять животным с учётом его потребностей.
 */
public class Main {
    public static void main(String[] args) {
        InteractableFarmAnimal chicken = new Chicken();
        InteractableFarmAnimal cow = new Cow();

        Farm farm = new Farm();
        farm.serviceAnimal(chicken);
        farm.serviceAnimal(cow);
    }
}
