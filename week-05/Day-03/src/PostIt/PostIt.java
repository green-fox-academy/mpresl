package PostIt;

public class PostIt {
    String backgroundColor;
    String text;
    String textColor;

    public void message(){
        System.out.println(text);
        System.out.println("background color is "+backgroundColor);
        System.out.println("Text should be in "+ textColor);
    }
    public static void main(String[] args){
        PostIt idea1;
        idea1 = new PostIt();
        idea1.text = "Hello there";
        idea1.backgroundColor = "Orange";
        idea1.textColor = "blue";
        idea1.message();

        PostIt awesome;
        awesome = new PostIt();
        awesome.textColor = "Black";
        awesome.text = "Awesome!";
        awesome.backgroundColor = "Pink";
        awesome.message();

        PostIt superb;
        superb = new PostIt();
        superb.textColor = "Green";
        superb.text = "Superb!";
        superb.backgroundColor = "Yellow";
        superb.message();
    }
}
