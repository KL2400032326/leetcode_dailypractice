class Solution {
    public int duplicateNumbersXOR(int[] nums) {
    int c=0;
        HashMap<Integer, Integer> map=new HashMap<>();
        for(int x : nums){
            map.put(x,map.getOrDefault(x,0)+1);
            if(map.get(x)==2){
                c=c^x;
            }
        }
        return c;
    }
}