package Cloneable;

public class Student extends Person {

        private final String previousOrganization;
        private int skippedDays = 0;

        Student(String name, int age, String gender, String previousOrganization){
            super(name, age, gender);
            this.previousOrganization = previousOrganization;
        }
        Student(){
            super();
            this.previousOrganization = "The School of Life";
        }

        public void introduce(){
            System.out.println("Hi, I'm " + this.getName() + ", a " + this.getAge() + " year old " + this.getGender() + " from " + previousOrganization + " who skipped " + skippedDays + " days from the course already.");
        }

        public void getGoal(){
            System.out.println("My goal is: Be a junior software developer.");
        }
        public void skipDays(int numberOfDays){
            skippedDays += numberOfDays;
        }

        @Override
        public Student clone(String name){
            return new Student(name, this.getAge(), this.getGender(), this.previousOrganization);
        }
}
