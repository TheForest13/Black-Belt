package collection.LinkedHashMap;


import java.util.LinkedHashMap;

public class LinkedHashMapEx {
    public static void main(String[] args) {

        LinkedHashMap<Double, Student> lhm =
                new LinkedHashMap<>(16, 0.75f, true);

        Student st1 = new Student("Zaur", "Tregulov", 3);
        Student st2 = new Student("Mariya", "Ivanova", 1);
        Student st3 = new Student("Sergey", "Petrov", 4);
        Student st4 = new Student("Igor", "Sidorov", 2);

        lhm.put(7.2, st3);
        lhm.put(7.5, st4);
        lhm.put(5.8, st1);
        lhm.put(6.4, st2);

        System.out.println(lhm);

        System.out.println(lhm.get(5.8));
        System.out.println(lhm.get(7.5));

        System.out.println(lhm);
    }
}
final class Student implements Comparable<Student> {
    final String name;
    final String surname;
    final int course;

    public Student(String name, String surname, int course) {
        this.name = name;
        this.surname = surname;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", course=" + course +
                '}';
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Student student = (Student) o;
//        return course == student.course && Objects.equals(name, student.name) && Objects.equals(surname, student.surname);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(name, surname, course);
//    }

    @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.name);
    }
}