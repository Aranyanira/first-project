package ConstructorGetterSetterPractice;

/*
Создайте класс Car с полями brand (строка) и year (целое число).
Реализуйте конструктор с двумя параметрами, геттеры и сеттеры для обоих полей,
метод print(), выводящий информацию о марке и годе выпуска.
В main создайте объект, установите значения через конструктор, измените год через сеттер, выведите информацию.
 */
public class Car {
    String brand;
    int year;

    Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    String getBrand() {
        return this.brand;
    }

    int getYear() {
        return this.year;
    }

    void setBrand(String brand) {
        this.brand = brand;
    }

    void setYear(int year) {
        this.year = year;
    }

    public void print(){
        System.out.println("Марка машины: " + this.brand);
        System.out.println("Год выпуска машины: " + this.year);
    }
}
