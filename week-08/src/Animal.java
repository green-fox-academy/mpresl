//  from github
//  material review
public class Animal {
        int belly;
        public int maxBelly;
        final int eatAmount = 7;

        public Animal(){
            belly = 1;
            maxBelly = 10;
        }

        public Animal(int belly){
            this.belly = belly;
            maxBelly = 15;
        }

        public void eat(){
            if (belly < maxBelly){
                belly+=1;
            } else {
                System.out.println("I am full! I need a walk... urgh");
                walk();
            }
        }

        //Final method
        public final void walk(){
            if (belly < 1){
                System.out.println(" I died ... :(");
            } else {
                belly-=1;
            }
        }

        public boolean isHungry(){
            return belly <= 5;

        /*if (belly <= 5){
            return true;
        } else {
            return false;
        }*/
        }

        public boolean isBellyEmpty(){
            return belly <= 0;
        }

        //Static function
        public static void speak(){
            System.out.println("...some noise...");
        }

        public void size(){
            System.out.println("Default size of a super class animal");
        }

    }
