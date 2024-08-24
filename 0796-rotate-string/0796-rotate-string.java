class Solution {
    public boolean rotateString(String s, String goal) {
        /*int n=0;
        while(n<=s.length()-1){
            if(s.equals(goal))
                return true;
            else{
                s=s.substring(1)+s.charAt(0);
                n++;
            }
        }
        return false;*/
        if(s.length()!=goal.length())
            return false;
        String str=s+s;
        return str.contains(goal);
    }
}