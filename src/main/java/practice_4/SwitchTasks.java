package practice_4;

import java.util.Scanner;

public class SwitchTasks {
    public static void main(String[] args) {
        //numberToWeekDay();
        //ticketPricePerDay();
        //scoreInAlphabetSystem();
        //systemCommands();
        //calculator();
    }

    /* Задача:
Реализуйте программу, которая принимает с консоли число от 1 до 7
и выводит название соответствующего дня недели (например, 1 — "Понедельник").
Методы и конструкции:
     */
    public static void numberToWeekDay() {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите числовое значение дня недели: ");
        int weekDay = input.nextInt();

        switch (weekDay) {
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6:
                System.out.println("Суббота");
                break;
            case 7:
                System.out.println("Воскресенье");
                break;
            default:
                System.out.println("Некорректный день недели");
        }
    }
    /* Задача:
    Определите стоимость билета в кино:
    будние дни (1–5) — 300 рублей
    выходные (6–7) — 450 рублей
     */
    public static void ticketPricePerDay() {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите числовое значение дня недели: ");
        int weekDay = input.nextInt();

        switch (weekDay) {
            case 1, 2, 3, 4, 5:
                System.out.println("Стоимость билета 300 руб.");
                break;
            case 6, 7:
                System.out.println("Стоимость билета 450 руб.");
                break;
            default:
                System.out.println("Некорректный день недели");
        }
    }

    /* Задача:
Программа принимает число от 0 до 100 и переводит его в буквенную оценку по шкале:
90–100 — A
80–89 — B
70–79 — C
60–69 — D
ниже 60 — F
     */
    public static void scoreInAlphabetSystem() {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите оценку от 0 до 100: ");
        int score = input.nextInt();

        if (score >=90 && score <= 100) {
            System.out.println("Оценка: А");
        } else if (score >=80 && score <= 89) {
            System.out.println("Оценка: B");
        }
        else if (score >=70 && score <= 79) {
            System.out.println("Оценка: C");
        }  else if (score >=60 && score <= 69) {
            System.out.println("Оценка: D");
        } else {
            System.out.println("Оценка: F");
        }
    }
    /* Задача:
Программа читает строку: "start", "stop", "restart" или "status".
Для каждой команды нужно вывести соответствующее сообщение, например: "Система запущена".
Методы и конструкции:
Scanner (nextLine())
switch-case по String
System.out.println()
default
     */
    public static void systemCommands() {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите команду: ");
        String command = input.nextLine();

        switch (command) {
            case "start":
                System.out.println("Система запущена");
                break;
            case "stop":
                System.out.println("Система остановлена");
                break;
            case "restart":
                System.out.println("Система рестартует");
                break;
            case "status":
                System.out.println("Система налаживает статус");
                break;
            default:
                System.out.println("Команды не существует");
        }
    }
    /*
    Задача:
Программа принимает два числа и оператор (+, -, *, /), затем выполняет операцию и выводит результат.
Методы и конструкции:
Scanner
switch-case
if для проверки деления на 0
System.out.println()
Арифметические операторы +, -, *, /
     */
    public static void calculator() {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int a = input.nextInt();

        System.out.print("Введите второе число: ");
        int b = input.nextInt();

        System.out.println("Введите оператор для расчета: ( +, -, *, /)");
        String operator = input.next();

        switch (operator) {
            case "+":
                System.out.println("Результат сложения: " + (a + b));
                break;
            case "-":
                System.out.println("Результат вычитания: " + (a - b));
                break;
            case "/":
                if (b > 0) {
                    System.out.println("Результат деления: " + (a / b));
                } else {
                    System.out.println("На ноль делить нельзя!");
                }
                break;
            case "*":
                System.out.println("Результат умножения: " + (a * b));
                break;
            default:
                System.out.println("Такого оператора не существует");
        }
    }
}
