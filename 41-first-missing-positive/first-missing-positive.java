class Solution {
    public int firstMissingPositive(int[] nums) {
       int ans=1;
      int i=0;
      while(i<nums.length){
        if(nums[i]>0 && nums[i]<nums.length){
            if(nums[i]!=nums[nums[i]-1]){
                int temp=nums[i];
                nums[i]=nums[temp-1];
                nums[temp-1]=temp;
            }
            else{
                i++;

            }
        }
        else{
        i++;
        }
      }

      for(int j=0;j<nums.length;j++){
       if(nums[j]!=j+1){
        return j+1;
       }
      }

      return nums.length+1;

    }
}