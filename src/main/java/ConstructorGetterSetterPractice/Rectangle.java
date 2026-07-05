package ConstructorGetterSetterPractice;

/*
Создайте класс Rectangle с полями width и height. Реализуйте конструктор, геттеры для ширины и высоты,
сеттер только для ширины и метод calculateArea() для расчёта площади.
В main создайте прямоугольник, измените ширину и выведите площадь.
 */
public class Rectangle {
    int width;
    int height;

    Rectangle(int width, int height){
        this.width = width;
        this.height = height;
    }

    int getWidth(){
        return this.width;
    }

    int getHeight(){
        return this.height;
    }

    void setWidth(int width){
        this.width = width;
    }

    public void calculateArea(){
        System.out.println("Площадь треугольника = " + width * height);
    }
}
