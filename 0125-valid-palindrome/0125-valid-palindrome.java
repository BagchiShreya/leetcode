class Solution {
     public static boolean isPalindrome(String s) {
        StringBuilder newStr = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetterOrDigit(s.charAt(i)) == true) {
                newStr.append(Character.toLowerCase(s.charAt(i)));
            }
        }
        StringBuilder revstr = new StringBuilder();
        for (int i = newStr.length() - 1; i >= 0; i--) {
            revstr.append(newStr.charAt(i));
        }
        if (revstr.toString().equals(newStr.toString())) 
            return true;
        else 
            return false;
    }
}