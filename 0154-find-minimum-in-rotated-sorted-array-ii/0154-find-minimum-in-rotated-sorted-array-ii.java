class Solution {
    public int findMin(int[] nums) {
        int l=0,n=nums.length;
        int r=n-1,x=50001;
        while(l<=r){
            int mid=(l+r)/2;
            if(nums[mid]>nums[r]){
                l=mid+1;
                x=mid+1;
            }
            else if(nums[r]>nums[mid]){
                r=mid;
            }
            else{
                r--;
            }
        }
        
        return nums[l];

    }
}