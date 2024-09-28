class Solution {
    public int findPermutationDifference(String s, String t) {
        char ch;
        int sum=0;
        for(int i=0;i<s.length();i++){
            ch=s.charAt(i);
            int diff=i-t.indexOf(ch);
            sum+=Math.abs(diff);
        }
        return sum;
    }
}