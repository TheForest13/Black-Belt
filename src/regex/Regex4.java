package regex;

public class Regex4 {
    public static void main(String[] args) {
        String s1 = "Private,    moy  drug!  Kak idet " +
                "izuchenie   Java   ?";

        System.out.println(s1);
//        s1 = s1.replace("Java", "SQL");
//        s1 = s1.replaceAll("  ", " ");
//        s1 = s1.replaceAll("\\bi\\w+", "444");
        s1 = s1.replaceFirst("\\bi\\w+", "444");

        System.out.println(s1);
    }
}
