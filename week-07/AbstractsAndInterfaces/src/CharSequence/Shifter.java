package CharSequence;

public class Shifter implements CharSequence {
    String string1;
    int shift;
    int len;

    Shifter(String s, int n){
        this.string1 = s;
        this.shift = n;
        this.len = s.length();
    }

    @Override
    public int length() {
        return this.len;
    }

    @Override
    public char charAt(int index) {
        return string1.charAt(index + shift);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return null;
    }
}
