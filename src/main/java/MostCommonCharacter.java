import java.security.Key;
import java.util.HashMap;

public class MostCommonCharacter {
    /**
     * Find the most common character in str.
     * You could use a HashMap that maps a Character key to an Int value to represent how many times a Character has
     * been spotted.
     * @param str A String.
     * @return the most common character within str.
     */
    public char recurringChar(String str) {
        HashMap<Character, Integer> charCount = new HashMap<>();
        charCount.put(str.charAt(0), 1);
        char mostCommonChar = str.charAt(0);
        for (int i = 1; i < str.length(); i++) {
            char c = str.charAt(i);
            int count = charCount.containsKey(c) ? charCount.get(c) : 0;
            charCount.put(c, count + 1);
            if (count + 1 > charCount.get(mostCommonChar) ) {
                mostCommonChar = c;
            }
        }
        return mostCommonChar;
    }
}
