package Zoo;

public class Bird extends Animals {

    Bird(String name) {
        super(name);
    }

    @Override
    public String breed() {
        return "laying eggs";
    }
}
