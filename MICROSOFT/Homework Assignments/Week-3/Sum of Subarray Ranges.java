class Solution {
    public long subArrayRanges(int[] nums) {
        long len=nums.length,sum=0;
        for(int i=0;i<len;i++){
            int min=nums[i],max=nums[i];
            for(int j=i;j<len;j++){
                min=Math.min(nums[j],min);
                max=Math.max(nums[j],max);
                sum+=(max-min);
            }   
        }
        return sum;
    }
}
