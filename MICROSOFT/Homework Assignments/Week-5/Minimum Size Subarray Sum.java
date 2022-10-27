class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int len=nums.length;
        int Min_Val=Integer.MAX_VALUE;
        int temp=0,Sum=0;
        for(int i=0;i<len;i++){
            Sum+=nums[i];
            while(Sum>=target){
                Min_Val=Math.min(Min_Val,i-temp+1);
                Sum-=nums[temp];
                temp++;
            }
        }
        if(Min_Val!=Integer.MAX_VALUE){
            return Min_Val;
        }
        return 0;
    }
}
