package stream;

import java.util.ArrayList;
import java.util.List;

public class ParallelStream {
    public static void main(String[] args) {
        List<Double> list = new ArrayList<>();
        list.add(10.0);
        list.add(5.0);
        list.add(1.0);
        list.add(0.25);

//        double sum = list.stream()
//                .reduce((ac,el) -> ac+el).get();
//        System.out.println("sumResult = " + sum);

//        double sumP = list.parallelStream()
//                .reduce((ac,el) -> ac+el).get();
//        System.out.println("sumParResult = " + sumP);

//        double divisionResult = list.stream()
//                .reduce((ac,el) -> ac/el).get();
//        System.out.println("divisionResult = " + divisionResult);

        double divisionParResult = list.parallelStream()
                .reduce((ac,el) -> ac/el).get();
        System.out.println("divisionParResult = " + divisionParResult);
    }
}
