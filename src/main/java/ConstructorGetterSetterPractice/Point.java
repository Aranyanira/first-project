package ConstructorGetterSetterPractice;
/*
Создайте класс Point с координатами x и y.
Реализуйте конструктор, геттеры, сеттер только для x, и метод print(), выводящий координаты.
В main измените x, выведите новые координаты.
 */
public class Point {
    int x;
    int y;

    Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    int getX(){
        return this.x;
    }

    int getY(){
        return this.y;
    }

    void setY(int y){
        this.y = y;
    }

    public void print() {
        System.out.println("Координата Y = " + this.y + ", координата Х = " + this.x);
    }
}
