package LAB9.Task3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

class Main {
    static List elementsAdd(List arr){
        Random r = new Random();
        for (int i = 0; i < 1000000; i++) {
            arr.add(r.nextInt());
        }
        return arr;
    }
    static Long chooseElement(List arr) {
        Random r = new Random();
        Long start = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            arr.get(r.nextInt(arr.size()));
        }
        Long stop = System.nanoTime();
        return stop - start;
    }

    public static void main(String[] args) {
        Random r = new Random();
        List arr = new ArrayList();
        List arr2 = new LinkedList();
        System.out.println(elementsAdd(arr));
        System.out.println(elementsAdd(arr2));
        System.out.println("Time elapsed for work with ArrayList is " + chooseElement(arr) + " ns");
        System.out.println("Time elapsed for work with LinkedList is " + chooseElement(arr2) + " ns");
    }
}
