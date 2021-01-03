package collection.ArrayList;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        int[] ms = {1,2,3,5,6,7};
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        list2.add(5);
        System.out.println("List 2: "+list2);
        ArrayList<Integer> list = new ArrayList<>(list2);
        System.out.println("List 1: " + list);
        list.add(111);
        System.out.println("List 1: " + list);
        System.out.println("List 2: "+list2);
        list2.add(22222);
        System.out.println("List 1: " + list);
        System.out.println("List 2: "+list2);
    }
}
