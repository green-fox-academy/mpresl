package Zoo;

public class Mammal extends Animals{

    Mammal(String name) {
        super(name);
    }

    @Override
    public String breed() {
        return "pushing miniature versions out";
    }
}
