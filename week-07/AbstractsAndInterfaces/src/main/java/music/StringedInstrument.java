package main.java.music;

public abstract class StringedInstrument extends Instrument{
    protected int numberOfStrings;


    StringedInstrument(int num){
        this.numberOfStrings = num;
    }

    public abstract String sound();


    @Override
    public void play() {
        System.out.println(type+", a "+numberOfStrings+"-stringed instrument that goes "+sound()+".");

    }
}
