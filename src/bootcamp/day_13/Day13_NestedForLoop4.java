package bootcamp.day_13;

public class Day13_NestedForLoop4 {

        public static void main(String[] args) {
        /*
                 Create the shape below by using nested for loop
         1
         2 4
         3 6 9
         4 8 12 16
         5 10 15 20 25
         */
            for (int i = 1; i <=5 ; i++) {
                for (int j = 1; j <=i ; j++) {
                    System.out.print(i*j +" ");
                }
                System.out.println("");
            }
        }
}
