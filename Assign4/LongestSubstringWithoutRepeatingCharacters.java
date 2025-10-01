class ques {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int maxLength = 0;
        HashSet<Character> charSet = new HashSet<>();
        //Sliding window approach lagayenge
        // Hum left aur right pointers ka use karenge
        // Jab tak right pointer aage badhta hai, tab tak hum character ko set mein dalte rahenge
        // Agar character already set mein hai, toh hum left pointer ko aage badhate rahenge

        // Jab tak duplicate character milta hai, tab tak left pointer ko aage badha
        // Jab duplicate character mil jaye, tab hum left pointer ko aage badhate rahenge
        // Aur right pointer ko bhi aage badhate rahenge
        
        for (int right = 0; right < s.length(); right++) {
            while (charSet.contains(s.charAt(right))) {
                charSet.remove(s.charAt(left));
                left++;
            }
            // Add the current character to the set
            charSet.add(s.charAt(right));
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;       
    }
}
