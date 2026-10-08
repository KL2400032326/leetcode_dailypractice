class Solution {
    public int findMin(int[] nums) {
        int l=0,n=nums.length;
        int r=n-1,x=50001;
        while(l<=r){
            int mid=(l+r)/2;
            if(nums[0]<=nums[mid]){
                x=mid+1;
                l=mid+1;
            }
            else{
                r=mid-1;
            }
        }
        if(x<n)
        x=Math.min(nums[0],nums[x]);
        else
         x=nums[0];
        return x;
    }
}