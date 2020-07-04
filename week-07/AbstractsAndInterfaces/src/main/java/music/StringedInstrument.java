package main.java.music;

public class StringedInstrument extends Instrument{
    protected int numberOfStrings;
    protected String sound;


    StringedInstrument(int num, String sound){
        this.numberOfStrings = num;
        this.sound = sound;
    }


    @Override
    public void play() {
        System.out.println(type+", a "+numberOfStrings+"-stringed instrument that goes "+sound);

    }
}
