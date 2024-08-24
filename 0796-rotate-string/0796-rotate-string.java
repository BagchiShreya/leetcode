class Solution {
    public boolean rotateString(String s, String goal) {
        int n=0,f=0;
        while(n<=s.length()-1){
            if(s.equals(goal)){
                /*f=1;
                break;*/
                return true;
            }
            else{
                s=s.substring(1)+s.charAt(0);
                n++;
            }
        }
         return false;
    }
}