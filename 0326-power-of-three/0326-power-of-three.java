class Solution {
    public boolean isPowerOfThree(int n) {
        if(n<0)
            return false;
        int flag=0;
        for(int i=0;i<=31;i++){
            if(n==Math.pow(3,i)){
                flag=1;
                break;
            }
        }
        if(flag==1)
            return true;
        else
            return false;
    }
}