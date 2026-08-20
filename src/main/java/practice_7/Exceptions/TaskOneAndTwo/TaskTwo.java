package practice_7.Exceptions.TaskOneAndTwo;
/*
2. Обработка непроверяемого исключения
Условие задачи: Напишите метод, который принимает на вход два числа и выполняет их деление.
Обработайте ситуацию, когда второе число равно нулю, чтобы избежать исключения при делении.
 */
public class TaskTwo {
    public static void main(String[] args) {
        System.out.println(divide(2, 2));
        System.out.println(divide(2, 0));
    }

    public static int divide(int a, int b) {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            System.out.println("На ноль делить нельзя.");
            return 0;
        }
    }
}
