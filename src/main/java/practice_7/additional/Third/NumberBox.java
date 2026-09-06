package practice_7.additional.Third;

import java.util.List;

/*
Работа с числами
Задача: Создайте класс NumberBox<T extends Number>, который хранит только числа и возвращает их сумму.
 */
public class NumberBox <T extends Number> {
    private List<T> t;
    public NumberBox(List<T> t) {
        this.t = t;
    }

    public void add(T number){
        t.add(number);
    }

    public double getSum(List<T> list){
        double sum = 0.0;
        for(T number : list){
            sum =  sum + number.doubleValue();
        }
        return sum;
    }

}
