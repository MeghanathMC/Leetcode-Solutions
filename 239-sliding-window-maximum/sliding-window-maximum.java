class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> dq=new ArrayDeque<>();

        int result[]=new int[nums.length-k+1];

        for(int i=0;i<nums.length;i++){
            while(!dq.isEmpty() && dq.peek()<i-k+1){
                dq.poll();//removes front
            }

                while(!dq.isEmpty() && nums[dq.peekLast()] < nums[i]){
                    dq.pollLast();//removes the rear element 
                }

                dq.offer(i);

                if(i>=k-1){
                result[i-k+1]=nums[dq.peek()];
        }
    }
    
    return result;
}
}