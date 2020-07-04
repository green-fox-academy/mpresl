package main.java.music;

public class ElectricGuitar extends StringedInstrument{

    ElectricGuitar(){
        super(6);
        this.type = "Electric Guitar";

    }
    ElectricGuitar(int num) {
        super(num);
        this.type = "Electric Guitar";

    }

    @Override
    public String sound() {
        return "Twang";
    }
}
