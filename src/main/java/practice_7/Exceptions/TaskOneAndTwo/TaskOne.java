package practice_7.Exceptions.TaskOneAndTwo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
1. Обработка проверяемого исключения
Условие задачи:
Напишите программу, которая пытается открыть файл с именем "data.txt".
Если файл не найден, программа должна обработать исключение и вывести сообщение: "Файл не найден".
 */
public class TaskOne {
    public static void main(String[] args) {
        BufferedReader br;
        try {
            br = new BufferedReader(new FileReader("file.txt"));
            String line =  null;
            while((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Файл не найден");
        }
    }
}
