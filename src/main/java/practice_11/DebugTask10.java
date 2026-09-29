package practice_11;

import java.util.*;

public class DebugTask10 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("Alice", "Bob", "Charlie"));
        names = names.stream()
                .filter(name -> !name.startsWith("A"))
                .toList();
        System.out.println(names);
    }
}
