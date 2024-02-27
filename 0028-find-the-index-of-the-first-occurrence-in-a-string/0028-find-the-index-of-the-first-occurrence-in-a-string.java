class Solution {
    public int strStr(String haystack, String needle) {
        if(haystack.equals(needle))
            return 0;
        int length=needle.length();
        for(int i=0;i<=haystack.length()-length;i++){
            int j=i+length;
            if(haystack.substring(i,j).equals(needle))
                return i;
        }
        return -1;
    }
}