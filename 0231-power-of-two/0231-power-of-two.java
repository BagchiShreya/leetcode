class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<0)
            return false;
        String s=Integer.toBinaryString(n);
        int c=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1')
                c++;
        }
        if(c==1)
            return true;
        else
            return false;
        
    }
}