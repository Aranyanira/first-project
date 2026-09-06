package practice_7.additional.Interface;
/*
Обобщённый интерфейс
Задача: Создайте интерфейс Container<T>, содержащий методы add(T item) и get().
 */
public interface Container<T> {
    void  add(T item);
    T get();
}
