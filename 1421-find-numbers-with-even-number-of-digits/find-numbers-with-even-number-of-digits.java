class Solution {
    public int findNumbers(int[] nums) {
        int totalCount=0;
        int c;
        int ans=0;
        int var;

        for(int val:nums){
            totalCount=0;
            while(val>0){
                c=val%10;
                totalCount++;
                val=val/10;
            }
            var=totalCount;
            if(var%2==0){
                ans++;
            }

        }
        return ans;
        
    }
}