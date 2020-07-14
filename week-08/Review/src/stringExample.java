public class stringExample {
    public static void main(String[] args) {
        String one = "This is my string";
        String two = "";
        for (int i = 0; i < one.length(); i++) {
            two += one.charAt(i);
            System.out.println(two);
        }
        System.out.println(two);
    }
}
