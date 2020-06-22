package TeachersAndStudents;

public class Main {
    public static void main(String[] args){
        Student mike = new Student("Mike");
        Teacher amy = new Teacher("Amy");

        mike.ask(amy);
        amy.teach(mike);
    }
}
