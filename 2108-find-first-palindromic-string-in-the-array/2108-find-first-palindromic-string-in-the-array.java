class Solution {
    public String firstPalindrome(String[] words) {
        boolean a;
        for(int i=0;i<words.length;i++){
            a=palin(words[i]);
            if(a==true)
                return words[i];
        }
        return "";
    }
    boolean palin(String s){
        String str="";
        for(int i=s.length()-1;i>=0;i--){
            str+=s.charAt(i);
        }
        if(s.equals(str))
            return true;
        else
            return false;
    }
}