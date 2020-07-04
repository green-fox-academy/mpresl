package beforeExercise;

public class Mentor {
    String name;
    int age;
    String gender;
    String level;

    Mentor(String name, int age, String gender, String level){
        this.age = age;
        this.gender = gender;
        this.name = name;
        this.level = level;
    }
    Mentor(){
        this.name = "Jane Doe";
        this.age = 30;
        this. gender = "female";
        this.level = "intermediate";
    }

    public void introduce(){
        System.out.println("Hi, I'm " + name + ", a " + age + " year old " + gender +" "+ level+ "mentor.");
    }

    public void getGoal(){
        System.out.println("My goal is: Educate brilliant junior software developers.");
    }
}
