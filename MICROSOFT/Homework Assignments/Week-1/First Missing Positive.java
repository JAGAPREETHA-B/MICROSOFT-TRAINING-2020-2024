class Solution{
public void sp(int nums[],int a,int b){ 
    int temp = nums[a];
    nums[a]=nums[b];
    nums[b]=temp;
}
public int firstMissingPositive(int[] nums) {
    int i=0;
    while(i<nums.length){
        int j= nums[i]-1;
        if(0<nums[i] && nums[i]<nums.length && nums[i]!=nums[j]){
            sp(nums,i,j);
        }
        else{
            i++;
        }
    }
    for(i=0;i<nums.length;i++){
        if(nums[i]!=i+1) 
            return i+1;
    }
    return i+1; 
}
}
