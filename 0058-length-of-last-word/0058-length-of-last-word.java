class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        String arr[]=s.split(" ");
        // String word=arr[arr.length-1];
        return arr[arr.length-1].length();
    }
}