package bootcamp.Day_05;

public class Day05_LogicalOperations {
    public static void main(String[] args) {
        int a= 20;
        int b= 30;

        System.out.println(a>b && b>0 && a>0); // false

        boolean result= 3*a <= 2*b && a>10 && b>20;// true

        System.out.println(result);
    }
}
