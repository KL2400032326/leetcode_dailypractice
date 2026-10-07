class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
      List<Integer> l=new ArrayList<>();
      int p=0;
      for(String s : words){
        if(s.contains(s.valueOf(x))){
            l.add(p);
        }
        p++;
      } 
      return l; 
    }
}