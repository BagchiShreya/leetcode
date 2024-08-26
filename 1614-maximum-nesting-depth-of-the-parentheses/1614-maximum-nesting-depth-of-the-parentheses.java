class Solution {
    public int maxDepth(String s) {
        int ans = 0;
        int brackets = 0;
        for (Character c : s.toCharArray()) {
            if (c == '(') 
                brackets++;
            else if (c == ')') 
                brackets--;
            ans = Math.max(ans, brackets);
        }
        return ans;
    }
}