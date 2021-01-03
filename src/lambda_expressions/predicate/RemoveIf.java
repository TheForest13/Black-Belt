package lambda_expressions.predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

public class RemoveIf {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Привет");
        arrayList.add("Пока");
        arrayList.add("Ок");
        arrayList.add("Учим джава");
        arrayList.add("А именно лямбда");

//        arrayList.removeIf(t -> t.length() < 5);
        Predicate<String> p = t -> t.length() < 5;
        arrayList.removeIf(p);
        System.out.println(arrayList);

    }
}
