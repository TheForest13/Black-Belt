package generic.game;

public class Test {
    public static void main(String[] args) {
        Schoolar schoolar1 = new Schoolar("Ivan", 13);
        Schoolar schoolar2 = new Schoolar("Maria", 15);

        Student student1 = new Student("Nikolay", 20);
        Student student2 = new Student("Kseniya", 18);

        Employee employee1 = new Employee("Zaur", 32);
        Employee employee2 = new Employee("Mikhail", 47);

        Team<Schoolar> scholarTeam = new Team<>("Драконы");
        Team<Student> studentTeam = new Team<>("Вперед!");
        Team<Employee> employeeTeam = new Team<>("Работяги");

        scholarTeam.addNewParticipant(schoolar1);
        scholarTeam.addNewParticipant(schoolar2);

        studentTeam.addNewParticipant(student1);
        studentTeam.addNewParticipant(student2);

        employeeTeam.addNewParticipant(employee1);
        employeeTeam.addNewParticipant(employee2);

//        scholarTeam.addNewParticipant(student1);
//        scholarTeam.addNewParticipant(employee1);

//        Team<String> anotherTeam = new Team<>("Фантазия");
//        anotherTeam.addNewParticipant("hello");

        Team<Schoolar> scholarTeam2 = new Team<>("Мудрецы");
        Schoolar schoolar3 = new Schoolar("Sergey", 12);
        Schoolar schoolar4 = new Schoolar("Olya", 14);
        scholarTeam2.addNewParticipant(schoolar3);
        scholarTeam2.addNewParticipant(schoolar4);

        scholarTeam.playWith(scholarTeam2);
//        scholarTeam.playWith(employeeTeam);
//        scholarTeam.playWith(studentTeam);
    }
}
