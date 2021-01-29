package lambda_expressions.predicate;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Predicate;

public class StudentInfo {

    void testStudents(ArrayList<Student> al, Predicate<Student> pr) {
        for (Student s : al) {
            if (pr.test(s)) {
                System.out.println(s);
            }
        }
    }
}

class Test {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student st2 = new Student("Nikolay", 'm', 28, 2, 6.4);
        Student st3 = new Student("Elena", 'f', 19, 1, 8.9);
        Student st4 = new Student("Petr", 'm', 35, 4, 7);
        Student st5 = new Student("Mariya", 'f', 23, 3, 9.1);


        ArrayList<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        StudentInfo info = new StudentInfo();

        Collections.sort(students, (s1, s2) -> s1.course - s2.course);
     //   System.out.println(students);

//        System.out.println("------------------------");
//        info.testStudents(students, s -> s.avgGrade > 8);
//        System.out.println("------------------------");
//        info.testStudents(students, (Student s) -> {
//            return s.age > 20 && s.avgGrade < 9.3 && s.sex == 'f';
//        });

        Predicate<Student> p1 = p -> p.avgGrade > 7.5;
        Predicate<Student> p2 = p -> p.sex == 'm';
        info.testStudents(students, p1.and(p2));
//        System.out.println("====================================");
//        Predicate<Student> p3 = p -> p.avgGrade > 7.5;
//        Predicate<Student> p4 = p -> p.sex == 'm';
//        info.testStudents(students, p3.or(p4));
//
//        System.out.println("====================================");
//        Predicate<Student> p5 = p -> p.avgGrade > 7.5;
//        Predicate<Student> p6 = p -> p.sex == 'm';
//        info.testStudents(students, p6.negate());

    }
}
