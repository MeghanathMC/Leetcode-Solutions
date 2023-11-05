class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int start=0;
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]<arr[i+1]){
                start++;
            }
            else{
                break;
            }
        }
        return start;

        
    }
}