class Solution {
    public static String reverseWords(String s) {
        String str="";
        s=s.trim();
        String arr[]=s.split(" ");
        for(int i=0, j=arr.length-1;i<arr.length;i++,j--){
            str=arr[i];
            arr[i]=arr[j];
            arr[j]=str;
        }
        str="";
        for(int i=0;i<arr.length;i++){
            arr[i]=arr[i]+" ";
        }
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i].compareTo(" ")!=0){
                str+=arr[i];
            }
        }
        return str.trim();
    }
}