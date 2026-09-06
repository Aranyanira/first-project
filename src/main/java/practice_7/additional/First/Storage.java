package practice_7.additional.First;

import java.util.List;

/*
Обобщённый класс
Задача: Создайте класс Storage<T>, который хранит элемент и возвращает его.
 */
public class Storage <T>{
    private T t;

    public Storage(T t){
        this.t = t;
    }

    public T getT() {
        return t;
    }

    /*
    Обобщённый метод
Задача: Реализуйте метод printList(List<T>), который принимает список любого типа и выводит его элементы.
     */
    public void printList(List<T> list){
        for(T t : list){
            System.out.println(t);
        }
    }
}
