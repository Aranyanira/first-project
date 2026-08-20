package practice_7.Exceptions.TaskFour;
/*
4. Создание и использование собственного непроверяемого исключения
Условие задачи: Напишите функцию, которая принимает строку в качестве аргумента и проверяет,
является ли строка правильным электронным адресом.
Если строка не удовлетворяет критериям, функция должна выбрасывать непроверяемое исключение.
 */

public class TaskFour {
    public static void main(String[] args) {
        checkEmail("aleksandra@mail.com");
        checkEmail("aleksandra");
    }

    public static void checkEmail(String email) {
        if (email.contains("@") && email.contains(".")) {
            System.out.println("Email принят");
        } else {
            throw new InvalidEmailException("Введите корректный email");
        }
    }
}
