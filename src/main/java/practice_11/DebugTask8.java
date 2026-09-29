package practice_11;

public class DebugTask8 {
    public static void main(String[] args) {
        double a = 0.1 * 3;
        a = Math.round(a * 10.0) / 10.0;
        double b = 0.3;
        if (a == b) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }
    }
}
