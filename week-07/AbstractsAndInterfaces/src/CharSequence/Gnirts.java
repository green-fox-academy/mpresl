package CharSequence;

import java.util.stream.IntStream;

public class Gnirts implements CharSequence {
    private String gString;
    private int size;

    Gnirts(String s){
        this.gString = s;
        this.size = s.length();
    }

    @Override
    public int length() {
        return this.size;
    }

    @Override
    public char charAt(int index) {
        return gString.charAt(size - (index+1));
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        String newString = "";

        for (int i = start; i < end; i++) {
            newString += charAt(i);
        }
        return newString;
    }


}
