package practice_4;

import java.util.Scanner;

public class BreakContinueTasks {
    public static void main(String[] args) {
        //breakWhenNegativeNumber();
        //skipWhenNumberDividedByThree();
        //outputPositiveNumbers();
        //waitToStop();
    }

    /* 1. Сумма чисел до первого отрицательного (использовать break)
Задача:
Напишите программу, которая запрашивает у пользователя числа и выводит их сумму.
Программа завершает выполнение, если пользователь вводит отрицательное число.
Методы и конструкции:
Scanner
while (true)
break
переменная sum
System.out.println()
     */

    public static void breakWhenNegativeNumber() {
        Scanner sc = new Scanner(System.in);


        int sum = 0;
        while (true) {
            System.out.print("Введите число: ");
            int number = sc.nextInt();
            if (number < 0) {
                break;
            }
            sum += number;
        }
        System.out.println(sum);
    }

    /* 2. Пропуск чисел, делящихся на 3 (использовать continue)
Задача:
Создайте программу, которая выводит числа от 1 до 20, пропуская те, которые делятся на 3.
Методы и конструкции:
for
if, оператор %
continue
System.out.println()
     */
    public static void skipWhenNumberDividedByThree() {
        for (int i = 1; i <= 20; i++) {
            if (i % 3 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }
    /*
    3. Вывод только положительных чисел (использовать continue)
Задача:
Напишите программу, которая принимает ряд чисел от пользователя и выводит только положительные.
Отрицательные числа нужно пропускать.
Методы и конструкции:
Scanner
while или do-while
if, continue
System.out.println()
     */
    public static void outputPositiveNumbers() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите 3 числа: ");
        int counter = 1;
        while (counter <= 3) {
            System.out.println("Введите число: ");
            int number = sc.nextInt();
             if (number < 0) {
                 counter++;
                 continue;
             }
            System.out.println(number);
             counter++;
        }
    }

    /* 4. Ввод строк до команды "stop" (использовать break)
Задача:
Программа должна запрашивать строки у пользователя и завершаться только тогда, когда введена команда "stop".
Методы и конструкции:
Scanner
while (true)
метод .equals("stop")
break
System.out.println()
     */
    public static void waitToStop() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String userString = sc.nextLine();
        String stop = "stop";
        while (!stop.equals(userString)) {
            System.out.print("Введите строку: ");
            userString = sc.nextLine();
            if (userString.equals(stop)) {
                break;
            }
        }
        System.out.println("Получена корректная строка.");
    }
}
