public class DocsDetective {
    public static void main(String[] args) {
        String raw = "  hello  ";
        String word = "banana";
        String word2 = "classroom";

        // trim() method returns a string
        System.out.print(raw.trim());

        // Here we are using trim(), toUpperCase(), and length() at the same time
        System.out.println("This is how we chain trim, toUpperCase, and length " + raw.trim().toUpperCase().length());

        // Here is how we use replace
        System.out.println("This is how we use replace " + word.replace("a", "A"));

        // This is how we use boolean methods
        System.out.println("This is how we use boolean methods " + word2.contains("room") + " " + raw.trim().contains("room") + " " + word.contains("room"));

        // This is how we use repeat
        System.out.println("This is what repeat method does " + "ab".repeat(2));
    }
}
