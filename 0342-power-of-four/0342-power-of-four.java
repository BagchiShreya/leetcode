class Solution {
    public boolean isPowerOfFour(int n) {
        if(n<0)
            return false;
        int flag=0;
        for(int i=0;i<=15;i++){
            if(n==Math.pow(4,i)){
                return true;
            }
        }
        return false;
    }
}