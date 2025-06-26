package coding_test1;

public class string_manupulation {
    public static void main(String[] args) {

        String input = "Hello world";

        int length = input.length();

        char firstChar = input.charAt(0);

        int spaceIndex = input.indexOf(' ');
        String sub = (spaceIndex != -1) ? input.substring(spaceIndex + 1) : "";


        System.out.println("Length: " + length);
        System.out.println("First char: " + firstChar);
        System.out.println("Substring: " + sub);
    }
}
