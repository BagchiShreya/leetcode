class Solution {
    public String reverseWords(String s) {
        String str,word="";
        String arr[]=s.split(" ");
        for(int i=0;i<arr.length;i++){
            str=rev(arr[i]);
            word+=str+" ";
        }
        return word.trim();
    }
    String rev(String s){
        String str="";
        for(int i=s.length()-1;i>=0;i--)
            str+=s.charAt(i);
        return str;
    }
}