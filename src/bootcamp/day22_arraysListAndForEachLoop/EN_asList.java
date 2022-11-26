package bootcamp.day22_arraysListAndForEachLoop;

import java.util.Arrays;
import java.util.List;

public class EN_asList {
    public static void main(String[] args) {


        Integer [] arr = {1,2,3};

        List<Integer> list = Arrays.asList(arr);  // we should not use this method


        System.out.println(list); // [1, 2, 3]

        List<Integer> list1 = list;


        // list.add(10);  // UnsupportedOperationException
        //System.out.println(list);

        // list.remove(2); // UnsupportedOperationException
        System.out.println("unchanged arr = "+Arrays.toString(arr));
        arr[0] = 99;
        System.out.println("changed arr = "+ Arrays.toString(arr));

        System.out.println(list);
        System.out.println("list1"+list1);


    }

}
