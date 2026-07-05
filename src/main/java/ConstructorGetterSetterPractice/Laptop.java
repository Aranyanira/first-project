package ConstructorGetterSetterPractice;

/*
Создайте класс Laptop с полями brand и price.
Реализуйте конструктор, геттеры и сеттеры, и метод printInfo(), выводящий информацию о ноутбуке и его цене.
В main измените цену и выведите информацию.

 */
public class Laptop {
    String brand;
    double price;

    Laptop(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    String getBrand() {
        return this.brand;
    }
    double getPrice() {
        return this.price;
    }

    void setBrand(String brand) {
        this.brand = brand;
    }
    void setPrice(double price) {
        this.price = price;
    }

    public void printInfo() {
        System.out.println("Марка ноутбука: " + this.brand + ", стоимость ноутбука: " + this.price);
    }
}
