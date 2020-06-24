public class StringsAgain {
    public static void main(String[] args) {
        String string = "This text is texting text";
        System.out.println(string);
        System.out.println(removeX(string));
    }
    public static String removeX(String string) {
        if (string.length() <= 1) {
            return string;
        }

        if (string.charAt(0) == 'x') {
            return removeX(string.substring(1));
        }
        return string.charAt(0) + removeX(string.substring(1));
    }
}
