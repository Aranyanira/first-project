package practice_11;

public class DebugTask4 {
    public static void main(String[] args) {
        System.out.println(isPalindrome(null));
    }
    public static boolean isPalindrome(String str) {
        try {
            String reversed = new StringBuilder(str).reverse().toString();
            return str.equals(reversed);
        } catch (NullPointerException e) {
            return false;
        }
    }
}
