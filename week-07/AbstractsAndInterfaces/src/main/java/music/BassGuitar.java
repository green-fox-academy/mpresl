package main.java.music;

public class BassGuitar extends StringedInstrument{
    BassGuitar(){
        super(4, "Duum-duum-duum");
        this.type = "Bass Guitar";
    }

    BassGuitar(int num) {
        super(num, "Duum-duum-duum");
        this.type = "Bass Guitar";
    }
}
