class Solution {
    public int smallestEvenMultiple(int n) {
        int val=0;
        for(int i=n;i<=2*n;i++){
            if(i%2==0 && i%n==0){
                val = i;
                break;
            }
                
        }
        return val;
    }
}