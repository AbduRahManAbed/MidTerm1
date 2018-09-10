package string.problems;

import java.util.Arrays;

/**
 * Created by mrahman on 04/22/17.
 */
public class Anagram {
    private static String str1 = "ARMY";
    private static String str2 = "MARY";

    public static void main(String[] args) {
        if (isAnagram(str1, str2)) {
            System.out.println(str2 + " is anagram of " + str1);
            } else {
            System.out.println("Is not anagram.");
        }
    }

    private static boolean isAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        str1 = sortCharacters(str1);
        str2 = sortCharacters(str2);

        if (str1.equals(str2)){
            return true;
        } else {
            return false;
        }
    }

    private static String sortCharacters(String str) {
        char[] charArray = str.toLowerCase().toCharArray();
        Arrays.sort(charArray);
        return String.valueOf(charArray);
    }

}

