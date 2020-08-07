package exercise12;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class SWcharacter {
    private String name;
    private String hairColor;
    private String skinColor;
    private String eyeColor;
    private String gender;
    private double height;
    private double weight;
    private String age;

    public SWcharacter(String n, String tHeight,String ms,String by,String gen) throws ParseException {
        name = n;
        gender = gen;
        if (tHeight.equals("unknown") || tHeight.equals("height")){
            height = 0;
        }else {
            height = NumberFormat.getNumberInstance(Locale.ENGLISH).parse(tHeight).doubleValue();
        }
        if (ms.equals(("unknown")) || ms.equals("mass")){
            weight = 0;
        }else {
            weight = NumberFormat.getNumberInstance(Locale.ENGLISH).parse(ms).doubleValue();
        }
        age = by;
    }

    public String getName() {
        return name;
    }


    public void setSkinColor(String skinColor) {
        this.skinColor = skinColor;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double setHeight() {
        return height;
    }

    public void setHeight(String actualHeight) {
        this.height = Integer.parseInt(actualHeight);
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
