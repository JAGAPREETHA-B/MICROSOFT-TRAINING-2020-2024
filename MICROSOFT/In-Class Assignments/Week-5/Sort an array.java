class Solution {
    public int[] sortArray(int[] nums) {
       int len=nums.length;
       if(len==0){
           return nums;
       }
        mergesort(nums,0,len-1);
        return nums;
    }
    public void mergesort(int[] nums,int lt,int rt){
        if(lt>=rt){
            return;
        }
        int mid=lt+(rt-lt)/2;
        mergesort(nums,lt,mid);
        mergesort(nums,mid+1,rt);
        merge(nums,lt,rt);
    }
    private void merge(int[] nums,int lt,int rt){
        int mid=lt+(rt-lt)/2;
        int[] arr=new int[rt-lt+1];
        int i=lt,j=mid+1,k=0;
        while(i<=mid && j<=rt){
            if(nums[i]<nums[j]){
                arr[k++]=nums[i++];
            }else{
                arr[k++]=nums[j++];
            }
        }
        for(;i<=mid;){
            arr[k++]=nums[i++];
        }
        for(;j<=rt;){
            arr[k++]=nums[j++];
        }
        System.arraycopy(arr,0,nums,lt,rt-lt+1);
    }
}
