package ArraysAndFunctions;

public class TakesLonger {
    public static void main(String... args) {
        String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";
        String newPart = "always takes longer than";
        int index = (quote.indexOf('y'))-1;
        String p1 = quote.substring(0,index);
        String end = quote.substring(index);
        quote = p1+' '+newPart+end;


        // When saving this quote a disk error has occurred. Please fix it.
        // Add "always takes longer than" to the StringBuilder (quote) between the words "It" and "you"
        // Using pieces of the quote variable (instead of just redefining the string)

        System.out.println(quote);
    }
}
