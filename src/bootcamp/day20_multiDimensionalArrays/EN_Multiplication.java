package bootcamp.day20_multiDimensionalArrays;

public class Day20_Multiplication {
    //Question 4- Create a method that returns the product (multiplication of all numbers in a given 2 dimensional array.

    public static void main(String[] args) {
        int[][] numbers = {{2, 5, 3, 5}, {3, 6, 8, 3}};

        int result = multiplyValues(numbers);
        System.out.println(result);  // 64800
    }
    public static int multiplyValues (int [][] numbers){

        int multiply =1;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j <numbers[i].length ; j++) {
                //numbers[i][j]
                multiply= multiply*numbers[i][j];
            }
        }
        return multiply;
    }
}
