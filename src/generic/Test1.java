package generic;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
//        list.add("ОК");
//        list.add(5);
//        list.add(new StringBuilder("dfsf"));
//        list.add(new Car);
        list.add("Привет");
        list.add("Пока");
        list.add("Ничего");
        list.add("Что-то");
//        list.add(new Car());

        for(Object o : list)
            System.out.println(o + " длина " + ((String)o).length());
    }
}

class Car{}