class Solution {
    public int search(int[] nums, int target) {
        int len=nums.length;
        int lp=0,rp=len-1;
        while(lp<=rp){
            int mid=(lp+rp)/2;
            if(target==nums[mid]){
                return mid;
            }
            else if(nums[mid]>=nums[lp]){
                if(target<=nums[mid] && target>=nums[lp]){
                    rp=mid-1;
                }
                else{
                    lp=mid+1;
                }
            }
            else{
                if(target>=nums[mid] && target<=nums[rp]){
                    lp=mid+1;
                }
                else{
                    rp=mid-1;
                }
            }         
        }
        return -1;
    }
}
