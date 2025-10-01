package Assignment4;

public class LongestRepeatingCharacterReplacement {

    public static int charReplacement(String s, int k) {
        int[] count =new int[26];
        int maxC =0; 
        int MLen= 0;
        int left =0;
        //i  pointer string ko traverse krne k liye
        //lef pointer window ko maintain krne k liye
        //maxC max frequency jis char ki ho current window me
        //MLen max length of valid window....jo btani hai
        
        
        for(int i = 0; i<s.length(); i++){
            count[s.charAt(i) - 'A']++;
            maxC = Math.max(maxC, count[s.charAt(i) - 'A']);

            while(i - left+1 -maxC >k){
                count[s.charAt(left) - 'A']--;
                left++;
            }

            MLen =Math.max(MLen, i - left + 1);
        }
        return MLen;
    }
}
