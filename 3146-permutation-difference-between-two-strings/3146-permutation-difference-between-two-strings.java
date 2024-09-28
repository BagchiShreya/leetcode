class Solution {
    public int findPermutationDifference(String s, String t) {
        char ch;
        int diff=0,sum=0;
        for(int i=0;i<s.length();i++){
            ch=s.charAt(i);
            diff=i-t.indexOf(ch);
            sum+=Math.abs(diff);
        }
        return sum;
    }
}