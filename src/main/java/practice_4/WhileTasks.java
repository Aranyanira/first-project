package practice_4;

import java.util.Scanner;

public class WhileTasks {
    public static void main(String[] args) {
        //factorialCount();
        //findEvenNumbers();
        //countReverse();

    }

    /* 1. Вычисление факториала с помощью while
Задача:
Напишите программу, которая принимает с консоли число и выводит его факториал (произведение всех чисел от 1 до n),
используя цикл while.
Методы и конструкции:
Scanner
while
переменные int result = 1, int i = 1
System.out.println()
     */
    public static void factorialCount(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = sc.nextInt();

        int count = 1;
        int result = 1;
        while (count <= number){
            result = result * count;
            count++;
        }
        System.out.println("Факториал = " + result);

    }
    /*
    2. Вывод всех чётных чисел до заданного
Задача:
Реализуйте программу, которая выводит все чётные числа от 1 до числа, введённого пользователем.
Методы и конструкции:
Scanner
while
if, оператор %
System.out.println()
     */
    public static void findEvenNumbers(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = sc.nextInt();

        int count = 1;
        while(count <= number){
            if(count % 2 == 0){
                System.out.println(count);
            }
            count++;
        }
    }

    /* 3. Обратный отсчёт от введённого числа до 1
Задача:
Создайте программу, которая принимает с консоли положительное число и выводит обратный отсчёт от него до 1.
Методы и конструкции:
Scanner
while
System.out.println()
декремент number--
     */
    public static void countReverse(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите положительно число: ");
        int number = sc.nextInt();

        int count = 0;
        while (count < number){
            System.out.println(number - count);
            count++;
        }
    }
}
