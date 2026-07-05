package ConstructorGetterSetterPractice;
/*
Создайте класс Teacher с полями name и subject.
Реализуйте конструктор, геттеры и сеттеры, и метод printInfo(), выводящий информацию о учителе и предмете.
В main измените предмет и выведите обновлённую информацию.
 */

public class Teacher {
    String name;
    String subject;

    Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    String getName() {
        return this.name;
    }

    String getSubject() {
        return this.subject;
    }

    void setName(String name) {
        this.name = name;
    }

    void setSubject(String subject) {
        this.subject = subject;
    }

    public void printInfo(){
        System.out.println("Имя учителя: " + this.name + ", предмет: " + this.subject);
    }
}
