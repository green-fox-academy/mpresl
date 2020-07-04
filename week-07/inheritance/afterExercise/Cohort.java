package afterExercise;

import java.util.ArrayList;

public class Cohort {
    String name;
    ArrayList<Student> students = new ArrayList<>();
    ArrayList<Mentor> mentors = new ArrayList<>();

    Cohort(String name){
        this.name = name;
        this.students = new ArrayList<>();
        this.mentors = new ArrayList<>();
    }

    public void addStudent(Student s){
        students.add(s);
    }
    public void addMentor(Mentor m){
        mentors.add(m);
    }

    public void info(){
        System.out.println("The "+name+" cohort has "+students.size()+" studnets and "+mentors.size()+" mentors.");
    }
}
