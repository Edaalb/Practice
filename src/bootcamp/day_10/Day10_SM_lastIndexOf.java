package bootcamp.day_10;

public class Day10_SM_lastIndexOf {
    public static void main(String[] args) {
        String str= "Java is getting harder";
        System.out.println(str.lastIndexOf("a")); // 17
        System.out.println(str.lastIndexOf('e')); // 20
        System.out.println(str.lastIndexOf("java")); // -1
        System.out.println(str.lastIndexOf("Java")); // 0
        System.out.println(str.lastIndexOf("e", 14)); // 9
    }
}
