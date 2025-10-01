package Assignment4;

import java.util.Arrays;

public class PermutationInString {

    public static boolean checkInclusion(String s1, String s2) {
        int[] freq1 = new int[26];
        int[] freq2 = new int[26]; 
        // Frequency array for s1
        for (char ch : s1.toCharArray()) {
            freq1[ch - 'a']++;
        }
        //s window ove 2
        for (int i = 0; i < s2.length(); i++) {
            freq2[s2.charAt(i) - 'a']++;
            // Remove the charcter jo window se bahar jaa raha hai
            if (i >= s1.length()) {
                freq2[s2.charAt(i - s1.length()) - 'a']--;
            }
            // fir check ..... if freq1 and freq2 are same
            if (Arrays.equals(freq1, freq2)) {
                return true;
            }
        }
        return false;
    }
}
