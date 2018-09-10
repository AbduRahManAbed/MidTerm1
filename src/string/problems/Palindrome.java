package string.problems;

public class Palindrome {
    private static String word = "Her";
    private static String toLowerCase = word.toLowerCase();
    private static  String str = "";

    public static void main(String[] args) {

        for (int i = toLowerCase.length()-1; i >= 0; i--) {
            str += toLowerCase.charAt(i);
        } if (toLowerCase.equals(str)){
            System.out.println("'" + word + "'" + "  is a palindrome");
        } else {
            System.out.println("'" + word + "'" + " not a palindrome");
        }
    }
}

