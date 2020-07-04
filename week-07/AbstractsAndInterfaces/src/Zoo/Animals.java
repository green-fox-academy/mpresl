package Zoo;

public abstract class Animals {
    private String name;
    private int age;
    protected String sex;

    Animals(String name){
        this.setName(name);
    }

    public Animals() {

    }


    public abstract String breed();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
