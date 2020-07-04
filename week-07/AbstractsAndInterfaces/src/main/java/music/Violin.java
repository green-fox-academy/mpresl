package main.java.music;

public class Violin extends StringedInstrument{
    Violin(){
        super(4);
        this.type = "Violin";
    }

    Violin(int num) {
        super(num);
        this.type = "Violin";
    }

    @Override
    public String sound() {
        return "Screech";
    }
}
