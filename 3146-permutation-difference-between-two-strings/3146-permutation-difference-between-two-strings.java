class Solution {
    public int findPermutationDifference(String s, String t) {
        int sum=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int diff=i-t.indexOf(ch);
            sum+=Math.abs(diff);
        }
        return sum;
    }
}