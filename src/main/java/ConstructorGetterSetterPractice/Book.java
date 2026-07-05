package ConstructorGetterSetterPractice;
/*
Класс Book
Создайте класс Book с полями title и author.
Реализуйте конструктор, геттеры и сеттеры, и метод printInfo(), выводящий название и автора книги.
В main создайте книгу, измените автора и выведите информацию.
 */

public class Book {
    String title;
    String author;

    Book(String title, String author){
        this.title = title;
        this.author = author;
    }

    String getTitle(){
        return this.title;
    }
    String getAuthor(){
        return this.author;
    }

    void setTitle(String title){
        this.title = title;
    }
    void setAuthor(String author){
        this.author = author;
    }

    public void printInfo() {
        System.out.println("Название книги: " + this.title);
        System.out.println("Наименование автора: " + this.author);

    }

}
