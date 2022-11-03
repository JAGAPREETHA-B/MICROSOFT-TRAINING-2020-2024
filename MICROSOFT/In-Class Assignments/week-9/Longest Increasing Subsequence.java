class Solution {
    public int lengthOfLIS(int[] nums) {
        int len=nums.length;
        int[] lis=new int[len];
        Arrays.fill(lis,1);
        for(int i=1;i<len;i++){
            for(int j=0;j<i;j++){
                if(nums[i]>nums[j] && lis[i]<lis[j]+1){
                    lis[i]=lis[j]+1;
                }
            }
        }
        int large=1;
        for(int i=0;i<len;i++){
            if(large<lis[i]){
                large=lis[i];
            }
        }
        return large;
    }
}
