package Assignment4;
import java.util.*;
public class LongestSubstringWithoutRepeatingCharacters {

    public static int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int left = 0, maxLength = 0;
        // Sliding window approach lagayenge
        // Jab tak right pointer aage badhta hai, tab tak hum character ko hmap mein dalte rahenge
        // Agar character already map mein hai, toh hum left pointer ko aage badhate rahenge
        // Jab tak duplicate character milta hai, tab tak left pointer ko aage badhate rahenge
        // Har step par maxLength ko update karte rahenge
        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            if (map.containsKey(c)) {
                left = Math.max(left, map.get(c) + 1);
            }
            map.put(c, right);
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}
