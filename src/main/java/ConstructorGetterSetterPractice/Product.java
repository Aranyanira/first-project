package ConstructorGetterSetterPractice;
/*
Создайте класс Product с полями name и price.
Реализуйте конструктор, геттеры, сеттер для цены, метод applyDiscount(discount) для применения скидки,
и метод printInfo(), выводящий информацию о товаре и цене.
В main измените цену, примените скидку и выведите цену.

 */

public class Product {
    String name;
    double price;

    Product(String name,double price){
        this.name = name;
        this.price = price;
    }

    String getName(){
        return this.name;
    }

    double getPrice(){
        return this.price;
    }

    void setPrice(double price){
        this.price = price;
    }

    public void applyDiscount(int discount) {
        price = price * (1 - discount / 100.0);
        System.out.println("Цена со скидкой: " + this.price);
    }

    public void printInfo(){
        System.out.println("Название товара: " + this.name + ", стоимость: " + this.price);
    }
}
