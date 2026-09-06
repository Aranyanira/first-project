package practice_7.additional;

import java.util.List;

public class Upper <T> {
    private List<T> list;
    /*
Ограничение сверху
Задача: Напишите обобщённый метод, который принимает List<T extends Number> и вычисляет сумму элементов.
 */
    public static <T extends Number> void getSum(List<T> list) {
        double sum = 0.0;
        for(T number : list){
            sum =  sum + number.doubleValue();
        }
        System.out.println(sum);
    }

    /*
Ограничение снизу
Задача: Реализуйте метод, который принимает List<T super Integer> и добавляет в него несколько чисел.
     */
    public static void addNumbers(List<? super Integer> list, Integer ... numbers) {
        for(Integer number : numbers){
            list.add(number);
        }
    }
}
