class Solution {
    public boolean isPalindrome(int x) {
        int rev=0;
        int n=x;
        int rem;
        while(x>0){
            rem=x%10;
            rev=rev*10+rem;
            x=x/10;
        }
        if(n==rev)
            return true;
        else
            return false;
        

    }
}