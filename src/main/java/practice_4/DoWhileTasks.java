package practice_4;

import java.util.Scanner;

public class DoWhileTasks {
    public static void main(String[] args) {
        //askNumberUntilIsPositive();
        //waitForExitcheckPassword();
        //countToTen();
        //waitForExit();
        //numbersCounterInNumber();
    }
    /* 1. Запрос положительного числа
Задача:
Напишите программу, которая запрашивает у пользователя число и продолжает спрашивать, пока оно не станет положительным.
Методы и конструкции:
Scanner
do-while
System.out.println()
условие number <= 0
     */
    public static void askNumberUntilIsPositive() {
        Scanner sc = new Scanner(System.in);
        int number;
        do {
            System.out.print("Введите число: ");
            number = sc.nextInt();
        } while (number <= 0);
    }
    /*
    Задача:
Реализуйте программу, которая запрашивает у пользователя пароль, пока он не введёт верный (пароль заранее задан в коде).
Методы и конструкции:
Scanner
do-while
метод .equals() для строк
System.out.println()
     */
    public static void checkPassword() {
        Scanner sc = new Scanner(System.in);
        String userPasswordAttempt;

        String password = "Sunshine";

        do {
            System.out.print("Введите пароль: ");
            userPasswordAttempt = sc.nextLine();
        } while (!userPasswordAttempt.equals(password));
    }

    /*
    3. Вывод чисел от 1 до 10 с использованием do-while
Задача:
Создайте программу, которая выводит числа от 1 до 10, используя do-while.
Методы и конструкции:
переменная-счётчик i
do-while
System.out.println()
     */
    public static void countToTen() {
        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i < 11);
    }

    /*
    4. Завершение программы по команде "exit"
Задача:
Напишите программу, которая будет ждать ввода команды "exit" от пользователя для завершения работы.
Методы и конструкции:
Scanner
do-while
метод .equals()
System.out.println()
     */
    public static void waitForExit() {
        Scanner sc = new Scanner(System.in);
        String userCommand;

        do {
            System.out.print("Введите команду: ");
            userCommand = sc.nextLine();
        } while (!userCommand.equals("exit"));
    }

    /*
    5. Подсчёт количества цифр в числе
Задача:
Напишите программу, которая подсчитывает, сколько цифр в целом числе, введённом пользователем.
Методы и конструкции:
Scanner
do-while
деление / 10
count++
условие для 0
     */

    public static void numbersCounterInNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = sc.nextInt();

        int counter = 0;
        do {
            number = number / 10;
            counter++;
        } while (number != 0);
        System.out.println("Количество цифр в числе: " + counter);
    }

}
