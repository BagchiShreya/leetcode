class Solution {
    public boolean rotateString(String s, String goal) {
        int n=0,f=0;
        while(n<=s.length()-1){
            if(s.equals(goal)){
                f=1;
                break;
            }
            else{
                s=s.substring(1)+s.charAt(0);
                n++;
            }
        }
        if(f==1)
            return true;
        else
            return false;
    }
}