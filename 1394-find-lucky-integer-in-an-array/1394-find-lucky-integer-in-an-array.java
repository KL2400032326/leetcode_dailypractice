class Solution {
    public int findLucky(int[] arr) {
        int lucky=-1;
        int n=501;
        int a[]=new int[n];
        for(int i=0;i<arr.length;i++){
            a[arr[i]]++;
        }
        for(int i=500;i>=1;i--){
            if(i==a[i]){
                lucky=i;
                break;
            }
        }
return lucky;
    }
}