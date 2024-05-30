class Solution {
    public String reverseWords(String s) {

        String arr[]=s.trim().split("\\s+");
    
        int i=0,j=arr.length-1;
        while(i<=j){
            String temp=arr[j];
            arr[j]=arr[i];
            arr[i]=temp;
            i++;
            j--;
        }
        return String.join(" ",arr);
        
    }
}