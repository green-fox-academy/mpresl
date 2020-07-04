package main.java.music;

public class ElectricGuitar extends StringedInstrument{

    ElectricGuitar(){
        super(6, "Twang");
        this.type = "Electric Guitar";

    }
    ElectricGuitar(int num) {
        super(num, "Twang");
        this.type = "Electric Guitar";
    }
}
