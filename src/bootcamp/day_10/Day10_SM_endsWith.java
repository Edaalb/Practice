package bootcamp.day_10;

public class Day10_SM_endsWith {
    public static void main(String[] args) {
        String str = "Java is beautiful everywhere";
        System.out.println(str.endsWith("everywhere")); // true
        System.out.println(str.endsWith(""));// true
        System.out.println(str.endsWith("Java is beautiful everywhere")); // true
        System.out.println(str.endsWith("Java")); // false
    }

}
