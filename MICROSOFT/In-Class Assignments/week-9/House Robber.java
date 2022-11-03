class Solution {
    public int rob(int[] nums) {
        int len=nums.length;
        if(len==0){
            return 0;
        }
        int[] arr=new int[len+1];
        arr[0]=0;
        arr[1]=nums[0];
        for(int i=1;i<len;i++){
            int n=nums[i];
            arr[i+1]=Math.max(arr[i],arr[i-1]+n);
        }
        return arr[len];
    }
}
