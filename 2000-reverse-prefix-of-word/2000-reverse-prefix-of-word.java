class Solution {
    public String reversePrefix(String word, char ch) {
        int idx=word.indexOf(ch);
        String str="";
        for(int i=idx;i>=0;i--){
            str+=word.charAt(i);
        }
        word=str+word.substring(idx+1);
        return word;
    }
}