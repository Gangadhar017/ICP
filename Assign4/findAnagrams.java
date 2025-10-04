class Solution{
   public List<Integer> findAnagrams(String s,String p){
       int[] pCnt=new int[26];
       int[] sCnt=new int[26];
       List<Integer> res=new ArrayList<>();

       if(s.length()<p.length()){
          return res;
      }

     for(char c: p.toCharArray()){
        pCnt[c-'a']++;
     }

     for(int i=0;i<s.length();i++){
        sCnt[s.charAt(i)-'a']++;
        if(i>=p.length()){
             sCnt[s.charAt(i-p.length())-'a']--;
        }
        if(Arrays.equals(pCnt,sCnt)){
             res.add(i-p.length()+1);
        }
     }
      return res;
   }
}
