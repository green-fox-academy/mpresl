package main.java.music;

public class BassGuitar extends StringedInstrument{
    BassGuitar(){
        super(4);
        this.type = "Bass Guitar";
    }

    BassGuitar(int num) {
        super(num);
        this.type = "Bass Guitar";
    }

    @Override
    public String sound() {
        return "Duum-duum-duum";
    }
}
