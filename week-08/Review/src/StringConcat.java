public class StringConcat {
    public static void concat1(String string1)
    {
        string1 = string1 + "FoxAcademy";
        System.out.println(string1);
    }
    public static void concat2(StringBuilder string2)
    {
        string2.append("FoxAcademy");
    }

    public static void main(String[] args)
    {
        String string1 = "Green";
        concat1(string1);  // string one is not changed
        System.out.println("String: " + string1);

        StringBuilder string2 = new StringBuilder("Green");
        concat2(string2); // string two is changed
        System.out.println("StringBuilder: " + string2);

    }
}
