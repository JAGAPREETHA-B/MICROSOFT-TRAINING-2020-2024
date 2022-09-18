class Solution {
    public int removeDuplicates(int[] nums) {
        int lp=1,len=nums.length;
        for(int i=1;i<len;i++){
            if(nums[i]!=nums[i-1]){
                nums[lp]=nums[i];
                lp++;
            }
        }
        return lp;
    }
}
