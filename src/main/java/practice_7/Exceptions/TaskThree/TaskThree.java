package practice_7.Exceptions.TaskThree;

import java.io.IOException;

/*
3. Создание и использование собственного проверяемого исключения
Условие задачи: Разработайте метод, который проверяет валидность возраста пользователя.
Если возраст меньше 0 или больше 150, метод должен выбрасывать проверяемое исключение.
 */
public class TaskThree {
    public static void main(String[] args) throws AgeException {
        checkAge(1500);
    }

    public static void checkAge(int age) throws AgeException {
        if (age < 0 || age > 150) {
            throw new AgeException("Введите корректный возраст");
        } else {
            System.out.println("Возраст принят");
        }
    }
}
