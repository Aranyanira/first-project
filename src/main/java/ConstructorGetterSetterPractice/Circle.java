package ConstructorGetterSetterPractice;

import org.w3c.dom.ls.LSOutput;

/*
Создайте класс Circle с полем radius.
Реализуйте конструктор, геттер и сеттер, методы calculateArea() и calculateCircumference().
В main измените радиус, выведите площадь и длину окружности.
 */
public class Circle {
    int radius;

    Circle(int radius){
        this.radius = radius;
    }

    int getRadius(){
        return this.radius;
    }

    void setRadius(int radius){
        this.radius = radius;
    }

    public void calculateArea(){

        System.out.println("Площадь окружности: " + Math.PI * radius * radius);
    }

    public void calculateCircumference(){
        System.out.println("Длина окружности: " + 2 * Math.PI * radius);
    }
}
