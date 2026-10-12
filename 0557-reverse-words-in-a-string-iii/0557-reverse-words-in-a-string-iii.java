class Solution {
    public String reverseWords(String s) {
      String a[]=s.split(" ");
      for(int i=0;i<a.length;i++){
        StringBuilder sb=new StringBuilder(a[i]);
        sb.reverse();
        a[i]=sb.toString();
      }
     return String.join(" ",a);
    }
}