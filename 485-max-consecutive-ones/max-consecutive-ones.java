class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {

        int count=0,maxcount=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count++;
            }
            if(count>maxcount){
                maxcount=count;
            }

            if(nums[i]==0){
                count=0;
            }
        }
        return maxcount;
        
    }
}