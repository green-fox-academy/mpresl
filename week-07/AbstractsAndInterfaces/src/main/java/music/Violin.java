package main.java.music;

public class Violin extends StringedInstrument{
    Violin(){
        super(4, "Screech");
        this.type = "Violin";
    }

    Violin(int num) {
        super(num, "Screech");
        this.type = "Violin";
    }
}
