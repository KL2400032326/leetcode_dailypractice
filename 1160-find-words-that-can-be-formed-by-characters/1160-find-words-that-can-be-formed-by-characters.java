class Solution {
    public int countCharacters(String[] words, String chars) {
        int ans=0;
        int freq[]=new int[26];
        for(char c: chars.toCharArray()){
            freq[c-'a']++;
        }
        for(String s : words){
            boolean yes=true;
              int[] count = freq.clone();
            for(char c : s.toCharArray()){
                if(count[c-'a']==0)
                 {
                    yes=false;
                    break;
                 }
             count[c-'a']--;
            }

            if(yes){
                ans+=s.length();
            }
        }
        return ans;
    }
}