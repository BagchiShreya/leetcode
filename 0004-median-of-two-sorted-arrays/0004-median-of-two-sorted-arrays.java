class Solution {
    public double findMedianSortedArrays(int[] num1, int[] num2) {
        int m=num1.length;
        int n=num2.length;
        int arr[]=new int[m+n];
        for(int i=0;i<m;i++){
            arr[i]=num1[i];
        }
        for(int i=0;i<n;i++){
            arr[m+i]=num2[i];
        }
        Arrays.sort(arr);
        int length=arr.length;
        if(length%2!=0){
            return arr[(length)/2];
        }
        else{
            double n1=arr[length/2];
            double n2=arr[(length/2)-1];
            return (n1+n2)/2;
        }
    }
}