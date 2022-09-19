class Solution {
    public int mySqrt(int x) {
        if(x<2){
            return x;
        }
            int s=1,e=x/2,mid;
            while(s<=e){
                mid=(s+e)/2;
                if((long)mid*mid>x){
                    e=mid-1;
                }
                else{
                    s=mid+1;
                }
            }
       return e;
    }
}
