package beforeExercise;

public class Student {
    String name;
    int age;
    String gender;
    String previousOrganization;
    int skippedDays = 0;

    Student(String name, int age, String gender, String previousOrganization){
        this.age = age;
        this.gender = gender;
        this.name = name;
        this.previousOrganization = previousOrganization;
    }
    Student(){
        this.name = "Jane Doe";
        this.age = 30;
        this.gender = "female";
        this.previousOrganization = "The School of Life";
    }

    public void introduce(){
        System.out.println("Hi, I'm " + name + ", a " + age + " year old " + gender + " from " + previousOrganization + " who skipped " + skippedDays + " days from the course already.");
    }

    public void getGoal(){
        System.out.println("My goal is: Be a junior software developer.");
    }
    public void skipDays(int numberOfDays){
        skippedDays += numberOfDays;
    }


}
