public class StringAgainAndAgain {
    public static void main(String[] args) {
        String string = "This is my x text that will remove the foxy x from the string. This text is texting text";
        System.out.println(seperateWithStar(string));
    }
    public static String seperateWithStar(String string) {
        if (string.length() <= 1) {
            return string;
        }

        return string.charAt(0) + "*"+seperateWithStar(string.substring(1));
    }
}
