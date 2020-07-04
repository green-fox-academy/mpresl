package CharSequence;

public class Main {
    public static void main(String[] args) {
        Gnirts example = new Gnirts("this example");
        System.out.println(example.length());

        System.out.println(example.charAt(2));
        CharSequence n = example.subSequence(0,4);

        System.out.println(n);
        Shifter s = new Shifter("example", 2);
        System.out.println(s.charAt(0));

    }
}
