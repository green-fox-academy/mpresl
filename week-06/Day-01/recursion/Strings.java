public class Strings {
    public static void main(String[] args) {
        String string = "yyxxtttxxttt";
        System.out.println(xToY(string));
    }
    public static String xToY(String string) {
        if (string.length() <= 1) {
            return string;
        }
//        if the first character is 'x'
//        then replace with 'y'
//
//        if the first character is not 'x'
//        then put that character in
//        front of the answer which came
//        from recursion
        if (string.charAt(0) == 'x') {
            return "y" + xToY(string.substring(1));
        }
        return string.charAt(0) + xToY(string.substring(1));
    }
}
