class Solution {
    public int strStr(String haystack, String needle) {
        if(haystack.equals(needle))
            return 0;
        //int length=needle.length();
        for(int i=0;i<=haystack.length()-needle.length();i++){
            int j=i+needle.length();
            if(haystack.substring(i,j).equals(needle))
                return i;
        }
        return -1;
    }
}