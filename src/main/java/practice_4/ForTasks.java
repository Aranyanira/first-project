package practice_4;

import java.util.Scanner;

public class ForTasks {
    public static void main(String[] args) {
        //sumOfNumbersDividedBy3();
        //sumOfNumbers();
        //multiplyTable();
        //checkIfNumberSimple();
        //countToTen();

    }
    /*
    1. Вывод чисел от 1 до 100, делящихся на 3
Задача:
Напишите программу, которая выводит все числа от 1 до 100, которые делятся на 3.
Методы и конструкции:
for
оператор %
if
System.out.println()
     */
    public static void sumOfNumbersDividedBy3() {
        int sum = 0;
        for (int i = 0; i <=100; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }

    /* 2. Сумма чисел от 1 до n
Задача:
Реализуйте программу, которая принимает с консоли число n и вычисляет сумму всех чисел от 1 до n.
Методы и конструкции:
Scanner
for
переменная int sum = 0
System.out.println()
     */
    public static void sumOfNumbers() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        int n = sc.nextInt();

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println("Сумма всех чисел между 1 и " + n + " равна " + sum);
    }
    /*  Таблица умножения для числа
Задача:
Создайте программу, которая выводит таблицу умножения для числа, введённого пользователем.
Методы и конструкции:
Scanner
for
System.out.println()
арифметические операторы
     */
    public static void multiplyTable() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + number*i);
        }
    }

    /*
    4. Проверка на простое число
Задача:
Напишите программу, которая проверяет, является ли введённое число простым. Простое число делится только на 1 и на само себя.
Методы и конструкции:
Scanner
for
if-else
логическая переменная (boolean isPrime = true)
System.out.println()
     */
    public static void checkIfNumberSimple() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = sc.nextInt();

        boolean isPrime = true;

        for (int i = 2; i <= number-1; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println("Число " + number + " простое.");
        } else {
            System.out.println("Число не простое.");
        }
    }

    /* 5. Вывод чисел от 1 до 10
Задача:
Напишите программу, которая выводит числа от 1 до 10 на экран.
Методы и конструкции:
for
System.out.println()
     */
    public static void countToTen() {
        for (int i = 1; i < 11; i++) {
            System.out.println(i);
        }
    }
}
