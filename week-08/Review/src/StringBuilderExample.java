public class StringBuilderExample {
    public static void main(String[] args) {
        String one = "This is my string";
        StringBuilder two = new StringBuilder();
        for (int i = 0; i < one.length(); i++) {
            two.append(one.charAt(i));
            System.out.println(two);
        }
        System.out.println(two);
    }
}
