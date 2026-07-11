package practice_4;
/*
1) Задача:
Напишите программу, которая принимает с консоли число и проверяет:
Если число больше 0, выведите "Число положительное".
Если меньше 0 — "Число отрицательное".
Если равно 0 — "Число равно нулю".

2) Задача:
Создайте программу, которая принимает два числа и выводит наибольшее из них.
 */
import javax.swing.*;
import java.security.IdentityScope;
import java.util.Scanner;

public class IfElseTasks {
    public static void main(String[] args) {
        //checkNumber();
        //findBiggestNumber();
        //writeScoreDecription();
        //checkIfNumberIsEven();
        //defineSaleAmount();
        //writeScore();

    }

    public static void checkNumber() {
        Scanner input = new Scanner(System.in);
        String numberCondition = "";

        System.out.print("Введите число: ");
        int number = input.nextInt();
        if(number > 0) {
            numberCondition = "Число положительное";
        }
        else if(number < 0) {
            numberCondition = "Число отрицательное";
        }
        else {
            numberCondition = "Число равно нулю";
        }
        System.out.println(numberCondition);
    }

    public static void findBiggestNumber() {
        Scanner input = new Scanner(System.in);

        int max;
        System.out.print("Введите первое число: ");
        int a = input.nextInt();
        System.out.print("Введите второе число: ");
        int b = input.nextInt();

        if (a > b) {
            max = a;
        } else  {
            max = b;
        }
        System.out.println(max);
    }

    /*
    Задача:
Программа принимает число от 1 до 5 и выводит текстовое описание оценки:
5 — "Отлично"
4 — "Хорошо"
3 — "Удовлетворительно"
2 или 1 — "Неудовлетворительно"
     */
    public static void writeScoreDecription() {
        Scanner input = new Scanner(System.in);

        System.out.print("Введите числовое значение оценки: ");
        int score = input.nextInt();

        String decription = "";
        if (score == 5) {
            decription = "Отлично";
        } else if (score == 4) {
            decription = "Хорошо";
        } else if (score == 3) {
            decription = "Удовлетворительно";
        } else if (score == 2 || score == 1) {
            decription = "Неудовлетворительно";
        }
        System.out.println(decription);
    }
    /* Задача:
       Напишите программу, которая проверяет, является ли введённое число чётным или нечётным.
     */

    public static void checkIfNumberIsEven() {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите значение: ");
        int number = input.nextInt();

        if (number % 2 == 0) {
            System.out.println("Число четное");
        } else {
            System.out.println("Число нечетное");
        }
    }
    /*
    Задача:
Напишите программу, которая определяет размер скидки:
До 18 лет — 25%
От 65 и старше — 30%
Остальные — без скидки
     */
    public static void defineSaleAmount() {
        Scanner input = new Scanner(System.in);

        System.out.print("Введите возраст: ");
        int age =  input.nextInt();

        if (age < 18) {
            System.out.println("Ваша скидка = 25%");
        }
        else if (age >= 65) {
            System.out.println("Ваша скидка = 30%");
        } else {
            System.out.println("Без скидки");
        }
    }
    /*
    Задача:
Программа принимает число — результат теста (0–100) и выводит:
90 и выше — "Отлично"
75–89 — "Хорошо"
60–74 — "Удовлетворительно"
ниже 60 — "Неудовлетворительно"
     */
    public static void writeScore() {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите результат теста от 0 до 100: ");
        int result = input.nextInt();

        String score = "";

        if (result >= 90) {
            score = "Отлично";
        } else if (result >= 75 && result <= 89) {
            score = "Хорошо";
        } else if (result >= 60 && result <= 74) {
            score = "Удовлетворительно";
        } else {
            score = "Неудовлетворительно";
        }
        System.out.println("Ваша оценка: " + score);
    }
}
