package ArraysAndFunctions;

public class StringPractice {
    public static void main(String[] args){
        String s = "word";
        String s1 = "wordier word";
        String w2 = "WoRd";

        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        System.out.println(s.charAt(0));
        System.out.println("Index of r is " +s1.indexOf('r',4)); //searchies from index 4
        System.out.println(s1.substring(3,6));
        System.out.println(s.replace('r','l'));
        System.out.println(s1.replace("rd","uld"));

        if(s1.startsWith("word")){
            System.out.println("Starts with word");
        }
        if (s1.endsWith("word")){
            System.out.println("s1 ends with word");
        }
        if (w2.equalsIgnoreCase(s1)){
            System.out.println("They are the same");
        }
    }
}
