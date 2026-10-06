class Solution {
    static int search1(int nums[],int l,int r,int k){
        while(l<=r){
     int mid=(l+r)/2;
        if(nums[mid]==k){
            return mid;
        }
        else if(nums[mid]>k){    
            r=mid-1;
        }
        else 
         l=mid+1;
        }
        return -1;

    }
    public int search(int[] nums, int target) {
    int l=0,r=nums.length-1,x=0,y=0;
    while(l<=r){
        int mid=(l+r)/2;
        if(nums[mid]>=nums[0]){
            x=mid+1;
            l=mid+1;
        }
        else{
            r=mid-1;
        }

    }
     int x1=search1(nums,0,x-1,target);
     int x2=search1(nums,x,nums.length-1,target);
     if(x1!=-1){
        return x1;
     }
     else if(x2!=-1){
        return x2;
     }
    

    
return -1;
    }
}