package generic;

import java.util.ArrayList;
import java.util.List;

public class Test3 {
    public static void main(String[] args) {
//        List<Number> list = new ArrayList<Integer>();
//        List<Object> list = new ArrayList<Integer>();
        List<?> list = new ArrayList<String>();
//        list.add("hello");

        List<? extends Number> list30 = new ArrayList<Integer>();
        List<? super Number> list31 = new ArrayList<Object>();

        List<Double> list1 = new ArrayList<>();
        list1.add(3.14);
        list1.add(3.15);
        list1.add(3.16);
        showListInfo(list1);

        List<String> list2 = new ArrayList<>();
        list2.add("Привет");
        list2.add("Пока");
        list2.add("Ничего");
        showListInfo(list2);


        ArrayList<Double> ald = new ArrayList<>();
        ald.add(3.14);
        ald.add(3.15);
        ald.add(3.16);
        System.out.println(sum(ald));

        ArrayList<Integer> ali = new ArrayList<>();
        ali.add(314);
        ali.add(315);
        ali.add(316);
        System.out.println(sum(ali));

        ArrayList<String> als = new ArrayList<>();
//        System.out.println(sum(als));
    }

    static void showListInfo(List<?> list) {
        System.out.println("Мой list содержит следующие элементы: " + list);
    }

    public static double sum(ArrayList<? extends Number> arrayList) {
        double sum = 0;
        for(Number n : arrayList){
            sum += n.doubleValue();
        }
        return sum;
    }
}
