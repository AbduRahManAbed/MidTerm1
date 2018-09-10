package string.problems;

import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * Created by mrahman on 04/22/17.
 */
public class DuplicateWord {

    public static void main(String[] args) {
        NumberOfDuplicates("Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language");
    }

    public static void NumberOfDuplicates(String sentence) {
        String[] words = sentence.split(" ");
        HashMap<String, Integer> Map;
        Map = new LinkedHashMap<String, Integer>();

        for (String word : words) {
            Map.put(word,(Map.get(word) == null ? 1 : (Map.get(word) + 1)));
        }
        System.out.println(Map);
    }

}



