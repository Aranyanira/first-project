package practice_7.Generics.TaskTwo;

public class ArrayHandler {
    public <T> void printArray(T[] arr) {
        for (T el : arr) {
            System.out.println(el);
        }
    }
}
