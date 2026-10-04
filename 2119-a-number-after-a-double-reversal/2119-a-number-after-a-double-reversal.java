class Solution {
    static int sendreverse(int num){
        int temp=0;
        while(num!=0){
         temp=temp*10+num%10;
         num=num/10;
        }
        return temp;
    }
    public boolean isSameAfterReversals(int num) {
        int temp=sendreverse(num);
        int temp2=sendreverse(temp);
        if(temp2==num){
            return true;
        }
        else{
            return false;
        }

    }
}