class Solution {
    public int maximumWealth(int[][] accounts) {
        int ans=0;
        int sum;
        for(int i=0;i<accounts.length;i++){
            sum=0;

            for(int j=0;j<accounts[i].length;j++){
                 sum=sum+accounts[i][j];
            }
            if(sum>ans){
                ans=sum;
            }
        }
        return ans;
    }
}