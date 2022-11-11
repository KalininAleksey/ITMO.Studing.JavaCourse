package LAB9.Task2;

import java.util.*;

class Main {
    public static <T> Set <T> removeDuplicates(List <T> arr) {
        //Set<T> set = new HashSet<>(arr);
        /*for (int i = 0; i < arr.size(); i++) {
            set.add(arr.get(i));
        }
        List arr2 = new ArrayList<>();
        for (int i = 0; i < set.size(); i++
        ) {
            arr2.add(set.toArray()[i]);
        }*/
        return new HashSet<>(arr);
    }

    public static void main(String[] args) {
        List arr = Arrays.asList(123, "string", true, 123, "end");
        System.out.println(removeDuplicates(arr));
    }
}
