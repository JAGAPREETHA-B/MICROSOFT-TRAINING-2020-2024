class NumArray {
    int[] arr;
    public NumArray(int[] nums) {
        int len=nums.length;
        arr=new int[len];
        arr[0]=nums[0];
        for(int i=1;i<len;i++){
            arr[i]=nums[i]+arr[i-1];
        }
    }
    
    public int sumRange(int left, int right) {
        if(left==0){
            return arr[right];
        }
        else{
            return arr[right]-arr[left-1];
        }
    }
}
