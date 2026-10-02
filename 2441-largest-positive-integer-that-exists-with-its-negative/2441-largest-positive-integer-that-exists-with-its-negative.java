class Solution {
    public int findMaxK(int[] nums) {
        Set<Integer> set=new HashSet<>();
        for(int x : nums){
            set.add(x);
        }
        int that=-1001;
        for(int i=0;i<nums.length;i++){
            if(set.contains(-1*nums[i])){
                that=Math.max(that,nums[i]);
            }
        }
        if(that==-1001)
        return -1;
        return that;
    }
}