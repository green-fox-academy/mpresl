package TeachersAndStudents;

public class Student {
    String name;
    Student(String name){
        this.name = name;
    }
    public void learn(){
        System.out.println(this.name+" is learning something new!");
    }
    public void ask(Teacher teacher){
        teacher.answer();
    }
}
