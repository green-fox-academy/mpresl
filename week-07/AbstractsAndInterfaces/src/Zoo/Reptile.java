package Zoo;

public class Reptile extends Animals {

    Reptile(String name){
        super(name);
    }

    @Override
    public String breed() {
        return "laying eggs";
    }
}
