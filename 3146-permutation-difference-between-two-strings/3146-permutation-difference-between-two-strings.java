class Solution {
    public int findPermutationDifference(String s, String t) {
        char ch;
        int ind,diff=0,sum=0;
        for(int i=0;i<s.length();i++){
            ch=s.charAt(i);
            ind=t.indexOf(ch);
            diff=i-ind;
            sum+=Math.abs(diff);
        }
        return sum;
    }
}