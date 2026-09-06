package practice_7.additional.Seventh;

import java.util.Map;

/*
Коллекция с обобщёнными типами
Задача: Создайте Map<K, V> и реализуйте метод, который принимает обобщённые ключи и значения, а затем выводит их.
 */
public class Seventh <K, V>{
    private Map<K, V> map;
    public Seventh(Map<K, V> map){
        this.map = map;
    }

    public Map<K, V> getMap() {
        return map;
    }

    public void printMap(Map<K, V> map){
        for(Map.Entry<K, V> entry : map.entrySet()){
            System.out.println(entry);
        }
    }
}
