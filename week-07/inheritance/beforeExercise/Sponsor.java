package beforeExercise;

public class Sponsor {
    String name;
    int age;
    String gender;
    String company;
    int hiredStudents = 0;

    Sponsor(String name, int age, String gender, String company){
        this.age = age;
        this.gender = gender;
        this.name = name;
        this.company = company;
    }
    Sponsor(){
        this.name = "Jane Doe";
        this.age = 30;
        this.gender = "female";
        this.company = "Google";

    }

    public void introduce(){
        System.out.println("Hi, I'm " + name + ", a " + age + " year old " + gender + "who represents "+company+" and hired "+hiredStudents+" students so far.");
    }

    public void getGoal(){
        System.out.println("My goal is: Hire brilliant junior software developers.");
    }
    public void hire(){
        hiredStudents++;
    }
}
